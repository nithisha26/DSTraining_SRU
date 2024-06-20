import java.util.*;
public class order {
    public static void main(String[] args) {
        int n=2;
        String order="polikujmnhytgbvfredcxswqaz";
        String input="abbcdd";
        String ans="";
        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : input.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Append characters to ans in the order specified by 'order'
        for (char ch : order.toCharArray()) {
            if (charCount.containsKey(ch)) {
                int count = charCount.get(ch);
                for (int i = 0; i < count; i++) {
                    ans += ch;
                }
                charCount.remove(ch); // Remove the character from the map after processing
            }
        }
        System.out.println(ans);

    }
}
