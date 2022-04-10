import java.util.*;
// import java.io.*;

public class powerful_number {
	
	public static ArrayList<Integer> powerfulIntegers(int x, int y, int bound) {
		// write your code here
		HashSet<Integer> set = new HashSet<>();

        ArrayList<Integer> list = new ArrayList<>();
        if(bound<=1)
            return list;
        else if(x==1 && y==1){
            list.add(2);
            return list;
        }
        else if( x==1){
            
            for(int py =1 ;1+py<=bound;py*=y){
                
                if(set.contains(1+py)==false){
                    list.add(1+py);
                    set.add(1+py);
                }
            }
            return list;
        }
        else if(y==1){
            for(int px =1 ;1+px<=bound;px*=x){
                
                if(set.contains(1+px)==false){
                    list.add(1+px);
                    set.add(1+px);
                }
            }
            return list;
        }
        else{
            for(int px = 1;px<bound;px*=x){
                for(int py = 1;py<bound;py*=y){
                    int val = px + py;
                    if(val<=bound){
                        if(set.contains(val)==false){
                            list.add(val);
                            set.add(val);
                        }
                    }
                }
            }
            return list;
        }

	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int bound = scn.nextInt();
		ArrayList<Integer> ret = new ArrayList<>();
		ret = powerfulIntegers(x, y, bound);
		Collections.sort(ret);
		for (int i = 0; i < ret.size(); i++) {
			System.out.print(ret.get(i) + " ");
		}
        scn.close();
	}

}
