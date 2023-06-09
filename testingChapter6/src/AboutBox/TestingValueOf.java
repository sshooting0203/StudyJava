package AboutBox;

public class TestingValueOf {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = new Integer(10);
        // boxing (기본타입 => wrapper타입)
        Integer i3 = new Integer("10");
        // 문자열을 int로 전환하는 연산 + boxing (더 많은 시간이 걸림)
        // Java9부터 생성자를 이용한 wrapper객체 생성 폐기
        // compile+run ok
        System.out.println(Integer.bitCount(10101));
        Integer i4 = Integer.valueOf(3);
        float f1 = i4.floatValue();
        System.out.println(f1);
        int ii1 = i4.intValue();
        System.out.println(ii1);
//       int ii2 = Integer.parseInt("3.14");
//       System.out.println(ii2);
        // compile (o) + run (x)
        // NumberFormatException 발생 = 숫자로 변환할 수 없는 문자열을 숫자로 변환
        System.out.println(Integer.toBinaryString(16));
        // 2진수
        System.out.println(Integer.toHexString(16));
        // 16진수
        System.out.println(Integer.toOctalString(16));
        // 8진수
        String s1 = Integer.toString(10);
        System.out.println(s1);
        Integer i6 = Integer.valueOf(100);
//        Integer i7 = Integer.valueOf("3.14");
        Integer i8 = Integer.valueOf(20);
//        Integer i9 = Integer.valueOf("helloJava");
    }
}
/*
valueof() 메서드
public static <T> T valueOf(String s){
}
IllegalArgumentException 예외를 던질 수 있음
1. 입력된 매개변수를 문자열로 전환할 수 없을 때
2. 해당 클래스의 객체가 없을 때
 */
