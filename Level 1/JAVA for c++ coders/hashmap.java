import java.util.HashMap;
import java.util.Set;
//import jdk.internal.jshell.tool.resources.l10n;

public class hashmap {
    public static void main(String[] args) {
       HashMap<String,Integer> hm= new HashMap<>();

        //put
        hm.put("India",140);
        hm.put("China",40);
        hm.put("US",10);
        hm.put("UK",14);

        System.out.println(hm);

        // change and insert
        hm.put("India",135);
        hm.put("Pak",30);
        System.out.println(hm);
        
        //get
        Integer val=hm.get("India");
        System.out.println(val);

        //containskeys

        System.out.println(hm.containsKey("India"));

        //Setkeys

        Set<String> s=hm.keySet();
        System.out.println(s);

        for(String s1:hm.keySet())
        {
            Integer val2=hm.get(s1);
            System.out.println(val2);
        }


    }
}
