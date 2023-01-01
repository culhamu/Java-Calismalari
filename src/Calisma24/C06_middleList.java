package Calisma24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_middleList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(middleNode(list));

    }public static List<Integer> middleNode(List<Integer> list){
List<Integer> middleList=new ArrayList<>();
int ortaindex=list.size()/2;
        for (int i = ortaindex+1; i < list.size(); i++) {
            middleList.add(list.get(i));


        }
return middleList;
    }
}
