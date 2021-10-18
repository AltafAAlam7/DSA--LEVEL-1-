import java.util.ArrayList;
import java.util.Scanner;
public class RemovePrimes{
    public static void solution(ArrayList<Integer> al){
		// write your code here
        for(int i=0;i<al.size();i++)
        {
            boolean prime = IsPrime(al.get(i));

            if(prime)
            {
                al.remove(i);
                i--;
            }
        }
		
	}
    public static boolean IsPrime(int n)
    {
        for(int div=2; div*div<= n;div++)
        {
            if(n%div==0)
                return false;
        }
        return true;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
        scn.close();
	}
}