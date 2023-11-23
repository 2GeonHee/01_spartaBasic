package chap_01;

public class _03_Variable {
    public static void main(String[] args) {
//        값타입에 따른 변수타입 (8기본형, 실제 값을 저장)
//        문자 : char
//        정수 : byte, short, int, long
//        실수 : float, double
//        논리 : boolean(true,false)
//        *참조형 String, System, Date 등..모메리 주소 저장

//        변수 : 하나의 값 저장 - 변경O
//        상수 : 한 번만 값 저장 - 변경X
//        리터럴 : 그 자체로의 값
        int score = 100; // 변수
        score = 200; // 100 -> 200 변경
        System.out.println(score); // 200
        final int MAX = 100; // final 상수
//        MAX = 200; -> error
    }
}
