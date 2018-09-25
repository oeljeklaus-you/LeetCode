package cn.edu.hust.link;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private  int size;
    private Cache<Integer,Integer> cache=null;
    class Cache<K,V> extends LinkedHashMap<K,V>
    {
        public Cache()
        {
            super(16,(float) 0.75,true);
        }

        protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
            return size()>size;
        }
    }

    public LRUCache(int cap)
    {
        this.size=cap;
        cache=new Cache<Integer,Integer>();

    }

    public int get(int key) {
        if(cache.get(key)==null) return -1;
        return cache.get(key);
    }

    public void put(int key, int value) {
        cache.put(key,value);
    }

    public static void main(String[] args)
    {
        LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );
        cache.put(1, 1);
        cache.put(2, 2);
        cache.get(1);       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        cache.get(2);       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        cache.get(1);       // 返回 -1 (未找到)
        cache.get(3);       // 返回  3
        cache.get(4);       // 返回  4
    }
}
