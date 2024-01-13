package ex14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamEx01 {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "홍길동");
        data.put("age", 20);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "장보고");
        data2.put("age", 30);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "이순신");
        data3.put("age", 10);

        List<Map<String, Object>> arr = Arrays.asList(data, data2, data3);
        List<Map<String, Object>> newArr = arr.stream().map(d -> {
           int newAge = (int)d.get("age") - 1;
           d.put("age", newAge);
           return d;
        } ).toList();

        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });


    }
}
