class Solution {
    public String minWindow(String s, String t) {

        if(s.length() <t.length())
            return "";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        // System.out.println(map);
        String ans ="";
        int i=0;
        int j=-1;
        int mmc = t.length();
        HashMap<Character,Integer> map2 = new HashMap<>();
        while(true){
            while(mmc>0 && i<s.length()){
                char chi = s.charAt(i);
                map2.put(chi,map2.getOrDefault(chi, 0)+1);

                if(map2.getOrDefault(chi,0)<=map.getOrDefault(chi,0))
                    mmc--;
                // System.out.print(mmc+" ");
                i++;
            }
            while(mmc==0 && j<i){

                String pans = s.substring(j+1, i);
                if(ans.length()==0)
                    ans =pans;
                else if(pans.length()< ans.length())
                    ans = pans;
                j++;
                char chj = s.charAt(j);
                map2.put(chj,map2.getOrDefault(chj, 0)-1);

                if(map2.getOrDefault(chj, 0)<map.getOrDefault(chj, 0))
                    mmc++;

            }

            if(i==s.length())
            break;

        }
        return ans;

    }
}