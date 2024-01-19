package com.metacoding.myhttp;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.reactive.function.client.WebClient;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class MyApp {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );
            String download = "";
            while (true) {
                String line = br.readLine();

                if (line == null) break;

                download = download + line;
            }
            System.out.println(download);

            ObjectMapper om = new ObjectMapper();
            ToDo todo = om.readValue(download, ToDo.class);

            System.out.println(todo.getTitle());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
