import java.util.*;
import java.io.*;
public class write_Hashmap {
    
    public  class HashMap<K,V>{
         class HMPair{
            K key;
            V value;

            HMPair(K key, V value)
            {
                this.key = key;
                this.value = value;
            }   
        }
        int size =0;
        LinkedList<HMPair>[] buckets;

        public HashMap()
        {
            size = 0;
            initBuckets(4);
        }

        private void initBuckets(int N)
        {
            buckets = new LinkedList[N];
            for(int bi =0; bi<N; bi++)
                buckets[bi] = new LinkedList<>();
        }

        public boolean containsKey(K key)
        {
            int bi = hashFunction(key);
            int di = findInBucket(key , bi);

            if(di== -1)
                return false;
            else
                return true;
        }

        public V get(K key)
        {
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
        public V remove(K key)
        {
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
        public void put(K key, V value)
        {
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
        private int hashFunction(K key)
        {
            int hash = key.hashCode();
            int bi = hash % buckets.length;

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
        public ArrayList<K> keySet()
        {
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
        public void display()
        {
            
            System.out.println("Display Begins");
            for(int bi=0; bi< buckets.length;bi++)
            {   System.out.print("Bucket" + bi +" ")
                for(int di =0;di< buckets[bi].size();di++)
                {
                    HMPair p = buckets[bi].get(di);
                    System.out.print(p.key +"@" + p.value+" ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
        private void reHash()
        {
            LinkedList<HMPair>[] oba = buckets;

            size =0;
            initBuckets(2 * oba.length);

            for(int bi =0; bi< oba.length;bi++)
            {
                for(int di = 0; di<oba[bi].size();di++)
                {
                    HMPair pair = oba[bi].get(di);
                    put(pair.key,pair.value);
                }
            }
        }
    }
}
