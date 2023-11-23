package chap_01;

public class _02_Variable {
    public static void main(String[] args) {
//        변수의 값 읽어오기

        int year = 0, age = 14;
        year = age + 2000; // year = 14 + 2000
        System.out.println(year); // 2014

        age = age + 1; // age = 14 + 1
        System.out.println(age); // 15

        int x = 4, y = 2;
        System.out.println(x+y); // 6
        System.out.println(x-y); // 2
        System.out.println(x*y); // 8
        System.out.println(x/y); // 2
    }
}
