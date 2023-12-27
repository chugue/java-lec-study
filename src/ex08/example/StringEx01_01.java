package ex08.example;

public class StringEx01_01 {

    public static String encoding(String data) {
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        char lastChar = data.charAt(0);

        for (int i = 1; i < data.length(); i++) {
            if (data.charAt(i) == lastChar) {
                count++;
            } else {
                encoded.append(lastChar).append(count);
                lastChar = data.charAt(i);
                count = 1;
            }
        }

        // 마지막 문자 처리
        encoded.append(lastChar).append(count);

        return encoded.toString();
    }

    public static String decoding(String encodingData) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < encodingData.length(); i += 2) {
            char ch = encodingData.charAt(i);
            int count = Character.getNumericValue(encodingData.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                decoded.append(ch);
            }
        }

        return decoded.toString();
    }

    public static void main(String[] args) {
        String data = "AABBBCCCCDDDDD";
        String encoded = encoding(data);
        System.out.println("Encoded: " + encoded); // 인코딩 A2B3C4D5

        String decoded = decoding(encoded);
        System.out.println("Decoded: " + decoded); // 디코딩 AABBBCCCCDDDDD
    }
}
