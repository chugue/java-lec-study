package ex03;

public class PizzaTopping {
    public static void main(String[] args) {

        String[] toppings = { "Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};
        // String 문자열 배열이기 때문에 중괄호 안의 요소들은 ""따옴표 표시를 꼭해야된다.

        for (String s: toppings) {
            System.out.println(s + " ");
        }
        // 여기서 처음에는 toppings라는 배열과 String s라는 배열이 값은 같지만 다른 주소값을 가지게 되는 줄
        // 알았으나, gpt한테 물어보니 각 배열은 다른 주소 배열이 아니라

    }
}
