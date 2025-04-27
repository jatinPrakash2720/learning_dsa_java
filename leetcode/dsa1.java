import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class dsa1 {
    public static int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();
        int pairCount = 0;
        for (String str : words) {
            String reversed = new StringBuilder(str).reverse().toString();

            if (set.contains(reversed)) {
                pairCount++;
                set.remove(reversed);
            } else {
                set.add(str);
            }
        }
        return pairCount;
    }
    public static void main(String[] args) {
        
    }
}
