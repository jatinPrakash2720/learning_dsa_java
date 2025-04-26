public class DSA {
    public static boolean isPallinRecur(int i, String s) {
        if (i >= s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return isPallinRecur(i + 1, s);
    }
    public static boolean isPallindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void reverseArr(int[] arr) {
        int n = arr.length;
        int left = 0;
        for (int right = n - 1; right >= (n / 2) + 1; right--) {
            arr[left] = arr[left] ^ arr[right];
            arr[right] = arr[left] ^ arr[right];
            arr[left] = arr[left] ^ arr[right];
            left++;
        }

    }
    public static int func4(int i, int prod) {
        if (i < 1)
            return prod;
        return func4(i - 1, prod * i);
    }

    public static int func5(int n) {
        if (n == 1) {
            return 1;
        }
        return n * func5(n - 1);
    }
    public static int func3(int n) {
        int prod = 1;
        for (int i = 2; i <= n; i++) {
            prod = prod * i;
        }
        return prod;
    }
    public static int func(int i, int sum) {
        if (i < 1)
            return sum;
        return func(i - 1, sum + i);

    }

    public static int func1(int n) {
        if (n == 0) {
            return 0;
        }
        return n + func1(n - 1);
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String args[]) {
        String s = "ABCDDCBA";
        if (isPallinRecur(0,s)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
        // int[] arr = { 5, 4, 3, 2, 1 };
        // printArr(arr);
        // reverseArr(arr);
        // printArr(arr);
        // System.out.println(func5(5));
        // System.out.println(func4(5,1))
        // System.out.println(func3(5));
        // System.out.println(func(3, 0));
        // System.out.println(func1(3));
    }
}