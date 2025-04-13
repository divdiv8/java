package collectionspractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice{
    private final HashMap<Integer, Integer> hashMap= new HashMap<>();

    void learnHashMap(){
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(3, 30);
        hashMap.put(4, 40);
        System.out.println("hashmap get " + hashMap.get(3));
        System.out.println("hashmap contains key " + hashMap.containsKey(2));
        System.out.println("hashmap contains value " + hashMap.containsValue(10));
        hashMap.remove(3);
        int mapSize = hashMap.size();
        //hashMap.clear();
        System.out.println("is empty" + hashMap.isEmpty());
        //loops
        for (int key : hashMap.keySet()){
            System.out.print(key + " key\t");
        }
        for (int key : hashMap.values()){
            System.out.print(key + " value\t");
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            System.out.println("entry key and value - " + entry.getKey() + " " + entry.getValue());
        }
        System.out.println(hashMap.getOrDefault(3, 0));
        System.out.println(hashMap);
        hashMap.replace(2, 21); // replace if key exists
        System.out.println(hashMap);
        hashMap.replace(2, 21, 20); // replace only if oldValue matches
        System.out.println(hashMap);
        hashMap.putIfAbsent(2, 40);          // only puts if key is missing
        System.out.println(hashMap);
        hashMap.replace(2, 31, 20); // replace only if oldValue matches
        System.out.println(hashMap);
        hashMap.putIfAbsent(9, 20);
        System.out.println(hashMap);
    }
}