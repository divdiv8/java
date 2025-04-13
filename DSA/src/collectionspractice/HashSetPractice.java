package collectionspractice;

import java.util.HashSet;

public class HashSetPractice {
    HashSet<String> set = new HashSet<>();
    void hashSetMethods(){
        set.add("div");
        set.add("vis");
        set.add("shards");
        set.add("kbr");
        set.add("x");
        System.out.println(set);
        set.remove("x");
        System.out.println("after removing x:" + set);
        System.out.println("set contains div" + set.contains("div"));
        //set.clear();
        System.out.println("set size : " + set.size());
        System.out.println("set is empty: " + set.isEmpty());
        for(String item : set){
            System.out.print("\titem in set - " + item );
        }

    }
}
