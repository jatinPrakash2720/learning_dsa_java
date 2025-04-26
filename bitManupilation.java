public class bitManupilation {
    //Practice Question 
    // Question 1 :What is the value of x^x for any valueof x?
    public static int ques1(int x) {
        return fastExpo(x, x);
    }
    //Question 2 :Swap two numbers without using any thirdvariable.
    public static void ques2(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        // a = a >> b;
        // // b = a >> b;
        // // a = a >> b;
        System.out.println(a);
        System.out.println(b);
    }
    // Question 3 :Add 1 to an integer using Bit Manipulation
    public static int ques3(int x) {

        return ~~x + 1;
    }
    //Question 4 :This question is based on a trick, pleasedirectly look at the solution.Convert uppercase characters to lowercase using bits.
    public static void ques4() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char)(ch | ' '));
        }
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0)
                count++;
            n >>= 1;
        }
        return count;
    }
    public static boolean powOf2(int n) {
        //Question: Check if a Number is a Power of 2 or not 
        return (n & n - 1) == 0;
    }
    public static int clrRangeOfBit(int n, int i, int j) {
        int a = -1 << (j + 1);
        int b = (1 << i) - 1;
        return n & a | b;
    }
    public static int clrLastIthBit(int n, int i){
        return n &(-1<<i);
    }
    public static int updateIthBit(int n, int i, int newBit) {
        //Another Way
        n = clearIthBit(n, i);
        return n | newBit << i;

        // return newBit == 0 ? clearIthBit(n, i) : setIthBit(n, i);
    }
    public static int clearIthBit(int n, int i) {
        return n & ~(1 << i);
    }
    public static int setIthBit(int n, int i) {
        return n | (1 << i);
    }
    public static int getIthBit(int n, int i) {
        return (n & (1 << i))==0 ?0:1;
    }
    public static void evenOdd(int n) {
        if ((n & 1) != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
    public static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;

            }
            a *= a;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        ques4();
        // System.out.println(ques3(7));
        // ques2(10,5);
        // System.out.println(ques1(5));
        // System.out.println(countSetBits(10));
        // System.out.println(powOf2(10));
        // System.out.println(clrRangeOfBit(2535, 2, 7));
        // System.out.println(clrLastIthBit(15, 2));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(updateIthBit(10, 1, 0));
        // System.out.println(clearIthBit(10,1 ));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(getIthBit(5, 1)); 
        // evenOdd(10);
        // System.out.println(fastExpo(3, 5));
    }
}
