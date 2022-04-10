import java.util.*;

public class Main {

	public static ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
		// write your code here
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str :strs){
            String key = getCode(str);
            if(map.containsKey(key)){
                ArrayList<String> list = map.get(key);
                list.add(str);
                map.put(key,list);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        ArrayList<ArrayList<String>> res = new ArrayList<>();

        for(String key: map.keySet()){
            res.add(map.get(key));
        }

		return res;
	}
    public static String getCode(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder key = new StringBuilder();
        for(char ch: map.keySet()){
            key.append(ch +""+map.get(ch));
        }
        return key.toString();
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		ArrayList<ArrayList<String>> anagramsGrouped = groupAnagrams(arr);
		for (ArrayList<String> lst : anagramsGrouped) {
			Collections.sort(lst);
		}
		anagramsGrouped.sort(new ListComparator());
		display(anagramsGrouped);
	}

	// it is used to make the result unique
	static class ListComparator implements Comparator<List<String>> {
		@Override
		public int compare(List<String> l1, List<String> l2) {
			if (l1.size() != l2.size()) {
				return l2.size() - l1.size();
			}

			String l1str = l1.get(0);
			String l2str = l2.get(0);
			return l1str.compareTo(l2str);

		}
	}

	public static void display(ArrayList<ArrayList<String>> list) {
		for (int i = 0; i < list.size(); i++) {
			ArrayList<String> currList = list.get(i);
			for (int j = 0; j < currList.size(); j++) {
				System.out.print(currList.get(j) + " ");
			}
			System.out.println();
		}
	}

}
