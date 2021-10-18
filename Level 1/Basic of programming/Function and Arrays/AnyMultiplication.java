import java.util.*;

public class AnyMultiplication{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
    scn.close();
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     
     
     int result=0;
     int tp=1;
     while(n2>0)
     {
         int d2=n2%10;
         n2=n2/10;
         int temp= n1;
         int c=0;
         int ans=0;
         int k=1;
         while(temp>0||c>0)
         {
             int r=temp%10;
             temp=temp/10;
             int ansdigit=(c+r*d2);
             c=ansdigit/b;
             ansdigit=ansdigit%b;
           
             ans=ans+ansdigit*k;
             k=k*10;
             
         }
         ans=ans*tp;
         result=getSum(result,ans,b);
         tp=tp*10;
        
         
         
     }
     return result;
 }
 public static int getSum(int n1,int n2,int b)
    {
        int dn=0;
        int k=1;
        int c=0;
        while(n1>0 || n2>0 || c>0){

            int d1=n1%10;
            n1=n1/10;

            int d2=n2%10;
            n2=n2/10;

            int d=d1+d2+c;
            c=d/b;
            int r=d%b;

            dn= dn +r*k;
            k=k*10;

            
        }
        return dn;
    }

}