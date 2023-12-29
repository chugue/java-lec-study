package ex08.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            try{
                System.out.print("정수를 입력하세요 (종료 -1) : ");
                String a = sc.nextLine();
                if (a.equals("-1")){
                    break;
                }
                int number = Integer.parseInt(a);
                numbers.add(number);
            } catch (NumberFormatException e){
                System.out.println("NumberFormatException 발생!!");
            }
        }
        int sum = 0;
        for (int j = 0; j < numbers.size() ; j++) {
            System.out.print(numbers.get(j) + " ");
            sum = sum + numbers.get(j);
        }
        System.out.println("정수들의 합은 " + sum);
    }
}

