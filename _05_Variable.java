package chap_01;

public class _05_Variable {
    public static void main(String[] args) {
        //        문자와 문자열
        char ch1 = 'A';
//        char ch2 = 'AB'; //error
//        char ch3 = ''; // error
        System.out.println(ch1);

        int i = 'A';
        System.out.println(i); // 문자코드 65

        String s0 = "5";
        String s1 = "ABC";
        String s2 = "A";
        String s3 = ""; // 빈 문자열
        String s4 = "A" + "B"; // 문자열 결합 AB

        String s5 = "" + 7; // 숫자를 문자열로 변화 "7"
        String s6 = "" + 7 + 7; // "7" + 7 -> "77"
        System.out.println(s6);
        String s7 = 7 + 7 + ""; // 14 + "" -> "14"
        System.out.println(s7);

        String s3_1 = s0 + s2;
        System.out.println(s3_1); // 5+A, 5A

        String str1 = "AB";
        String str2 = new String("AB");
    }
}
