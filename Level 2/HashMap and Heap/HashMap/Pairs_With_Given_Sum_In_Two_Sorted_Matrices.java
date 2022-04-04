import java.util.*;

public class Main {
	
    // public static int solve(int[][] num1, int[][] num2, int k) {
	// 	// write your code here
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i=0;i<num1.length;i++){
    //         for(int j=0;j<num1[0].length;j++){
    //             map.put(num1[i][j],map.getOrDefault(num1[i][j], 0)+1);
    //         }
    //     }
    //     int ans =0;
    //     for(int i=0;i<num2.length;i++){
    //         for(int j=0;j<num2.length;j++){
    //             int tar = k - num2[i][j];
    //             if(map.containsKey(tar))
    //                 ans+=map.get(tar);
    //         }
    //     }

	// 	return ans;
	// }
    public static int solve(int[][] num1, int[][] num2, int k) {
        int size = num1.length* num2.length;
        int left =0;
        int right = size-1;
        int ans =0;
        while(left< size && right>=0){

            int r1 = left/num1[0].length;
            int c1 = left%num1[0].length;

            int r2 = right/num2[0].length;
            int c2 = right%num2[0].length;

            int sum = num1[r1][c1] + num2[r2][c2];

            if(sum == k){
                ans++;
                left++;
                right--;
            }
            else if( sum > k)
                right--;
            else
                left++;
        }

        return ans;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] mat1 = new int[N][N];
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		int[][] mat2 = new int[N][N];
		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		int K = sc.nextInt();
		System.out.println(solve(mat1, mat2, K));

	}

}
