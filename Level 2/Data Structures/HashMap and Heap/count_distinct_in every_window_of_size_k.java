import java.util.*;

public class Main {

	public static ArrayList<Integer> solution(int[] arr, int k) {
		//write your code here
		if(arr.length==0 || k==0){
			return new ArrayList<>();
		}
        HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<k;i++)
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		
		
		int i=0;
		int j=-1;
		ArrayList<Integer> res = new ArrayList<>();
		res.add(map.size());
		for(int i=k;i<arr.length;i++){
			int val = arr[i];
			map.put(val,map.getOrDefault(val, 0)+1);

			j++;
			int valj = arr[j];
			if(map.get(valj)>1)
				map.put(valj,map.get(valj)-1);
			else
				map.remove(valj);
			
			res.add(map.size());
		}

		return res;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int k = scn.nextInt();
		ArrayList<Integer> ans = solution(arr,k);
		for(int a : ans){
			System.out.print(a + " ");
		}
	}


}
