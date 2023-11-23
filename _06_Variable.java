package chap_01;

public class _06_Variable {
    public static void main(String[] args) {
//        두 변수의 값 교환하기
        int x = 10, y = 20;
        x = y; // y의 값을 x에 저장
        y = x; // x의 값을 y에 저장
        System.out.println(x); // 20
        System.out.println(y); // 20

        x = 10; y = 20;
        int tmp; // 빈공간
        tmp = x; // x의 값을 tmp에 저장
        x = y; // y의 값을 x에 저장
        y = tmp; // tmp의 값을 y에 저장
//        System.out.println(tmp);
        System.out.println(x);
        System.out.println(y);
    }
}
