
public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        p1.setColor("Red");
        p1.setTip(15);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Raj";
        myAcc.setPassword("12345");

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        this.password = pwd;
    }
}
class Pen {
    private String color;
    private int tip;

    
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        this.percentage = (phy + chem + math) / 3;
    }
}
