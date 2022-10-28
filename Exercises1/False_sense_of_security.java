import java.util.HashMap;
import java.util.Scanner;

class Solution {
    private HashMap<Character, String> ht = new HashMap<>();
    private HashMap<String, Character> ht2 = new HashMap<>();

    public String encode(String str, int[] codeLens) {
        String encoded_symbols = new String();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            String code = ht.get(str.charAt(i));
            encoded_symbols += code;
            codeLens[i] = code.length();
        }
        return encoded_symbols;

    }

    public void solve(String str) {

        String[] codes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        // while encoding we have to search symbols according to char
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            ht.put(ch, codes[i]);
        }

        ht.put('_', "..--");
        ht.put(',', ".-.-");
        ht.put('?', "----");
        ht.put('.', "---.");

        int[] codeLens = new int[str.length()];
        String encoded_symbols = encode(str, codeLens);

        // decoding
        // while decoding we have to search char according to symbols
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            ht2.put(codes[i], ch);
        }
        ht2.put("..--", '_');
        ht2.put(".-.-", ',');
        ht2.put("----", '?');
        ht2.put("---.", '.');
        int n = codeLens.length;
        int k = 0;
        for (int i = n - 1; i >= 0; i--) {

            System.out.print(ht2.get(encoded_symbols.substring(k, k + codeLens[i])));
            k += codeLens[i];

        }
        System.out.println();

    }

}

public class False_sense_of_security {

    public static void main(String[] args) {

        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {

            String str = sc.nextLine();
            s.solve(str);
        }
        sc.close();
    }

}
