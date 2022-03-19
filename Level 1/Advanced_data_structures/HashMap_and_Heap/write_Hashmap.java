import java.io.*;
import java.util.*;

public class Main {

  public static class HashMap<K, V> {
    private class HMPair {
      K key;
      V value;

      HMPair(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n
    private LinkedList<HMPair>[] buckets; // N = buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }

    public void put(K key, V value) {
      // write your code here
       int bi = hashFunction(key);
      int di = findInBucket(key , bi);

      if(di == -1)
      {
          HMPair p = new HMPair(key,value);
          buckets[bi].add(p);
          size++;

      }
      else
      {
          HMPair p = buckets[bi].get(di);
          p.value = value;
          
      }

      double lambda = size * 1.0 / buckets.length;
      if(lambda > 2.0)
      {
          reHash();
      }
    }
    
    private void reHash()
    {
      LinkedList<HMPair>[] oba = buckets;

      size =0;
      initbuckets(2 * oba.length);

      for(int bi =0; bi< oba.length;bi++)
      {
          for(int di = 0; di<oba[bi].size();di++)
          {
              HMPair pair = oba[bi].get(di);
              put(pair.key,pair.value);
          }
      }
    }
    public V get(K key) throws Exception {
      // write your code here
      int bi = hashFunction(key);
      int di = findInBucket(key , bi);

      if(di == -1)
          return null;
      else
      {
          HMPair p = buckets[bi].get(di);
          return  p.value;
      }
    }
     private int hashFunction(K key)
    {
        int hash = key.hashCode();
        int bi = Math.abs(hash) % buckets.length;

        return bi;
    }
    private int findInBucket(K key ,int bi)
    {
        for(int di=0; di <buckets[bi].size();di++ )
        {
            HMPair p = buckets[bi].get(di);
            
            if(p.key.equals(key))
                return di;
        }

        return -1;
    }

    public boolean containsKey(K key) {
      // write your code here
      int bi = hashFunction(key);
      int di = findInBucket(key , bi);

      if(di== -1)
          return false;
      else
          return true;
    }

    public V remove(K key) throws Exception {
      // write your code here
      int bi = hashFunction(key);
      int di = findInBucket(key , bi);

      if(di == -1)
          return null;
      else
      {
          HMPair p = buckets[bi].remove(di);
          size--;
          return p.value;
          
      }
    }

    public ArrayList<K> keyset() throws Exception {
      // write your code here
      ArrayList<K> keys = new ArrayList<>();

      for(int bi=0; bi< buckets.length;bi++)
      {
          for(int di =0;di< buckets[bi].size();di++)
          {
              HMPair p = buckets[bi].get(di);
              keys.add(p.key);
          }
      }

            return keys;
    }

    public int size() {
      // write your code here
      return size;
    }

   public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMPair node : buckets[bi]) {
          System.out.print( node.key + "@" + node.value + " ");
        }
        System.out.println(".");
      }
      System.out.println("Display Ends");
  }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("put")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        Integer val = Integer.parseInt(parts[2]);
        map.put(key, val);
      } else if (str.startsWith("get")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.get(key));
      } else if (str.startsWith("containsKey")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.containsKey(key));
      } else if (str.startsWith("remove")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.remove(key));
      } else if (str.startsWith("size")) {
        System.out.println(map.size());
      } else if (str.startsWith("keyset")) {
        System.out.println(map.keyset());
      } else if (str.startsWith("display")) {
        map.display();
      }
      str = br.readLine();
    }
  }
}