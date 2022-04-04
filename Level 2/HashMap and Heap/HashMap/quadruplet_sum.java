import java.util.*;

public class quadruplet_sum {
    public static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target, int n) {
		// write your code here

        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<String> dup = new HashSet<>();

        for(int i=0;i<=arr.length-4;i++){
            for(int j=i+1;j<=arr.length-3;j++){

                int sum = arr[i] + arr[j];
                int tar = target - sum;

                int l = j + 1;
                int r = arr.length -1;
                while(l<r){  
                    if(arr[l] + arr[r] == tar)
                    {
                        ArrayList<Integer> list  = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);

                        String key = "" + arr[i]+"@" + arr[j]+ "@" + arr[l] + "@"+ arr[r] ;
                        if(dup.contains(key)==false)
                        {
                            ans.add(list);
                            dup.add(key);
                        }
                        l++;
                        r--;
                    }
                    else if( arr[l] + arr[r] > tar){
                        r--;
                    }
                    else{
                        l++;
                    }
                }
            }
        }
        return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		ArrayList<ArrayList<Integer>> ans = fourSum(arr, target, n);
		Collections.sort(ans,(a,b)->{
            int i = 0;
            int j = 0;
            
            while(i < a.size()){
                if(a.get(i) == b.get(j)){
                    i++;
                    j++;
                }else{
                    return a.get(i) - b.get(j);
                }
            }
            
            return 0;
        }); 
		for (ArrayList<Integer> a : ans) {
			for (int element : a) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
        sc.close();
	}

}
