package chap_01;

public class _01_Variable {
    public static void main(String[] args) {
//        변수의 선언
//        변수타입 변수이름;

//        boolean flag;
//        char grade;
//        byte val;
//        short sval;
//        int num;
//        long price;
//        float tax;
//        double score;

//        변수의 초기화 (변수에 값 저장하기)
//        변수타입 변수이름 = 값;
//        변수타입 변수이름; 변수이름 = 값;
        boolean flag = true;
        char grade = 'A';
        byte val = 127;
        short sval = 128;
        int num = 32768;
        long price = 2_222_111_111L;
        float tax = 3.14f;
        double score = 3.14141423444;

        System.out.println("boolean = " + flag);
        System.out.println("char = " + grade);
        System.out.println("byte = " + val);
        System.out.println("short = " + sval);
        System.out.println("int = " + num);
        System.out.println("long = " + price);
        System.out.println("float = " + tax);
        System.out.println("double = " + score);
    }
}
