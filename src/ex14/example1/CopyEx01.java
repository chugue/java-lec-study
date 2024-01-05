package ex14.example1;

import java.util.ArrayList;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> newList = new ArrayList<>(list);

        System.out.println(list.hashCode());
        System.out.println(newList.hashCode());

        list.add(5);

        System.out.println(list.size());
        System.out.println(newList.size());
        System.out.println(list.hashCode());
    }
}



