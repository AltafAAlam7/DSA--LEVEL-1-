import java.util.ArrayList;


public class arraylist {
    public static void main(String[] args) {
      //  Scanner scn=new Scanner(System.in);
      /*
        ArrayList <Integer> list=new ArrayList<> ();
        System.out.println(list+ "->" + list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list+ "->" + list.size());
        list.add(1,15);
        System.out.println(list+ "->" + list.size());
        int val=list.get(1);
        System.out.println(val);
        list.set(1,10);
        System.out.println(list+ "->" + list.size());
        list.remove(1);
        System.out.println(list+ "->" + list.size());

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i)+" ");
        }
        */

        //ArrayList of String;

        ArrayList <String> list= new ArrayList<>();
        System.out.println(list+ "->" + list.size());
        list.add("a");
        list.add("b");
        list.add(2,"c");
        System.out.println(list+ "->" + list.size());

        list.set(0,"Altaf");
        System.out.println(list+ "->" + list.size());

        String s;
        s=list.get(0);
        System.out.println(s);
     //   scn.close();
    }
}
