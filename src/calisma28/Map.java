package calisma28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Map {
    public static <K, V> void main(String[] args) {
        java.util.Map<Integer,String> ogrenciMap=new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        List<Integer> keyList=new ArrayList<>(ogrenciMap.keySet());
        System.out.println(keyList);
        List<String> valueList=new ArrayList<>(ogrenciMap.values());
        System.out.println(valueList);
        List<java.util.Map.Entry<Integer, String>> enntrySet=new ArrayList<>(ogrenciMap.entrySet());
        System.out.println(enntrySet);

        for (java.util.Map.Entry entry:ogrenciMap.entrySet()) {
             Integer key= (Integer) entry.getKey();
            System.out.println(key);
            String value=(String) entry.getValue();
            System.out.println(value);
        }
        Iterator<java.util.Map.Entry<Integer, String>> itr=ogrenciMap.entrySet().iterator();
        while (itr.hasNext()){
            java.util.Map.Entry entry = itr.next();// get key
            K key = (K) entry.getKey();
            V value = (V) entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

    }
}
