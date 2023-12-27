package ex08.example;

import java.util.ArrayList;
import java.util.regex.*;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.google.com?username=ssar&password=1234";

        // username값과, password값 찾아보기
        String username = null;
        String password = null;

        String[] token = url.split("\\?");
        for (String a : token){
            if (a.contains("&")){
                String[] info = a.split("&");
                for (String privacy : info){
                    if (privacy.contains("username")){
                        String[] finaluser = privacy.split("=");
                        for (String q :finaluser){
                            if (!q.contains("username"));
                            username = q;
                        }
                    }
                    if (privacy.contains("password")){
                        String[] finalpass = privacy.split("=");
                        for (String q : finalpass){
                            if (!q.contains("password")){
                               password = q;

                            }
                        }
                    }
                }
            }
        }
        System.out.println(username);
        System.out.println(password);
    }
}