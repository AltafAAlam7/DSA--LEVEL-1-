public class PerformanceIssueinString {
    public static void main(String[] args) {
        String s = "";
        long start1 = System.currentTimeMillis();
        for(int i=0;i<100000;i++)
            s+=i;
        long end1 = System.currentTimeMillis();
        System.out.println(s);
        System.out.println(end1-start1);
        
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for(int i=0;i<100000;i++)
            sb.append(i);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
