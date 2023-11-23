package chap_01;

public class _04_Variable {
    public static void main(String[] args) {
//        논리리형 boolean true/false 만 사용 가능
        boolean power = true;

//        문자형 char 하나의 문자, 개행문자
        char ch = 'A';

//        문자열 String ""
        String str = "abc";

//        byte 범위 -128 ~ 127 (int 타입)

//        정수형 int 범위 +-20억
        int i = 100; // 10진수
        int ob = 0b0101; // 접두사 0b, 2진수
        int oct = 0100; // 접두사 0, 8진수
        int hex = 0x100;// 접두사 0x, 16진수
        System.out.println(ob); // 5
        System.out.println(oct); // 64
        System.out.println(hex); // 256

//        정수형 long 범위 int(+-20억) 이상
        long l1 = 2_000_000_000L; // 접미사 L, 생략불가
        long l2 = 100; // int 범위 내 접미사 생략 가능
        System.out.println(l2);

//        실수형 float, double
        float f = 3.14f; // 접두사 f, 생략불가
        double d = 3.14; // 접두사 d, 생략가능

//        10. = 10.0
//        .10 = 0.10
//        10f = 10.0f
//        le3 = 1000.0, e = 10의 n제곱

//        변수와 리터럴의 타입 불일치
//        범위가 변수 > 리터럴 인 경우, 가능
        int i1 = 'A'; // int > char
        System.out.println(i);
        long l = 123; // long > int
        double d1 = 3.14f; // double > float

//        범위가 변수 < 리터럴 인 경우, 불가능
//        int i = 300_000_000; / int의 범위 +-20억 벗어남
//        long l = 3.14f / long < float
//        float f = 3.14; / float < double

//        byte, short 변수에 int리터럴 저장 가능
        byte b = 100; // byte 범위 -128~127까지 가능
    }
}
