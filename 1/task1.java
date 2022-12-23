import java.nio.charset.StandardCharsets;

public class task1 {
    public static void main(String[] args) {
        System.out.println("letter -- ASCII -- UTF-8 -- UTF-16");

        for(int i = 0; i < 26; i++){
            char ch = (char) ('a' + i);
            byte bu = String.valueOf(ch).getBytes(StandardCharsets.US_ASCII)[0];
            byte b8 = String.valueOf(ch).getBytes(StandardCharsets.UTF_8)[0];
            byte[] b16 = String.valueOf(ch).getBytes(StandardCharsets.UTF_16);

            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < b16.length; j++){
                sb.append(b16[j]);
            }

            System.out.println( ch + " -- " + bu + " -- " + b8 + " -- " + b16.toString());
        }
    }
}
