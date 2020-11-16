package homework;

public class hw1 {

    public static void main(String[] args) { //1, 2

        byte by;
        by = -124;

        short s;
        s = 30;

        int i;
        i = 1854564256;

        long l;
        l = 123415615446573246L;

        float f;
        f = 123.121353f;

        double dou;
        dou = 13.23345;

        char ch;
        ch = 'C';

        boolean bool;
        bool = true;

        String str;
        str = "java";

//        System.out.println(by);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(dou);
//        System.out.println(ch);
//        System.out.println(bool);
//        System.out.println(str);

        posOrNeg(-4);
//        System.out.println(computeSum(3.8f, 5.3f, 3.3f, 2.9f));
        helloUser("Руслан");
        isLeap(700);
    }

    public static float computeSum(float a, float b, float c, float d) { //3
        return a *(b + (c / d));
    }

    public static boolean intervalCheck(int a, int b) { //4
        int c = a + b;
        if(c < 10 || c > 20) {
            return false;
        } else {
            return true;
        }
    }

    public static void posOrNeg(int a) { //5
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean isNegative(int a) { //6
        if(a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void helloUser(String name) { //7
        System.out.printf("Привет, " + name + "!");
    }

    public static void isLeap(int a) { //8
        if (a % 100 != 0 && a % 400 == 0 || a % 4 == 0) {
            System.out.println(a + " - високосный год.");
        } else {
            System.out.println(a + " - невисокосный год.");
        }
    }


}

