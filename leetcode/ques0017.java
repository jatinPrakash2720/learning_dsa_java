import java.util.*;

public class ques0017 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(result, map, digits, 0, new StringBuilder());
        return result;

    }

    private void backtrack(List<String> result, Map<Character, String> map, String digits, int index,
            StringBuilder path) {
        if (path.length() == digits.length()) {
            result.add(path.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));
            backtrack(result, map, digits, index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        ques0017 solution = new ques0017();
        System.out.println(solution.letterCombinations("23"));
        
    }
}


// public class ques0017 {
//     public List<String> letterCombinations(String digits) {
//         List<String> result = new ArrayList<>();
//         if (digits == null || digits.length() == 0) {
//             return result;
//         }
        
//         Map<Character, String> map = new HashMap<>();
//         map.put('2', "abc");
//         map.put('3', "def");
//         map.put('4', "ghi");
//         map.put('5', "jkl");
//         map.put('6', "mno");
//         map.put('7', "pqrs");
//         map.put('8', "tuv");
//         map.put('9', "wxyz");
        
//         backtrack(result, map, digits, 0, new StringBuilder());
//         return result;
//     }
    
//     private void backtrack(List<String> result, Map<Character, String> map, String digits, int index,
//             StringBuilder path) {
//                 System.out.println(index);
//         if (path.length() == digits.length()) {
//             result.add(path.toString());
//             return;
//         }
        
//         String letters = map.get(digits.charAt(index));
//         for (int i = 0; i < letters.length(); i++) {
//             path.append(letters.charAt(i));
//             backtrack(result, map, digits, index + 1, path);
//             path.deleteCharAt(path.length() - 1);
//         }
//     }

//     public static void main(String[] args) {
        // ques0017 solution = new ques0017();
        // solution.letterCombinations("23");
        // System.out.println(solution.letterCombinations("23"));
//     }
// }
