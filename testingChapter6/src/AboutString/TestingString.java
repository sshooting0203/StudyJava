package AboutString;

// String클래스는 java.lang 패키지에 위치
// String 객체는 수정불가능
public class TestingString {
    public static void main(String[] args) {
        String s1 = "abcd";
//        String s2[] = {'a','b','c','d'};
        // compile err => 요소가 String 타입이 아님
        char s2[] = {'a','b','c','d'};
        System.out.println(s2); //abcd
        System.out.println(s2[0]); //a
        String s3[] = {"a","b","c","d"};
        System.out.println(s3); //[Ljava.lang.String;@1d251891
        String s4 = new String("abcd");
        String s5 = new String(s2);
        String s6 = new String();
        System.out.println(s6); //공백
        System.out.println(s6.getClass().getName());
//        리터럴로 생성 != String 객체로 생성
//        리터럴로 생성 => 힙메모리에 JVM이 스트링리터럴테이블에 생성, 내용동일하면 하나만 생성
//        String 객체로 생성 => 힙메모리에 String 객체 생성, 내용동일해도 여러 개 생성
        String a = "Hello";
        String b = "Java";
        String c = "Hello"; //위에서 리터럴로 생성한 것과 동일
        System.out.println(a==c); //true
        System.out.println(a.equals(c)); //true
        String d = new String("Hello");
        String e = new String("Java");
        String f = new String("Java");
        System.out.println(a==d); //false
        System.out.println(a.equals(d)); //true
        System.out.println(e==f); //false
        System.out.println(e.equals(f)); //true

        String s = new String("Hello");
        String t = s.concat("Java");
        System.out.println(t); //새로운 스트링 객체 리턴
        String v = s.intern();
        System.out.println(t==v); //false
        System.out.println(v);
        // String 객체의 intern() 메소드
        // 해당 문자열이 스트링 리터럴 테이브레 있는지 확인
        // 있다면 해당 문자열의 참조를 반환
        // 없다면 새로운 문제열을 스트링 리터럴 테이블에 등록한 후 그 참조를 반환
    }
}
/*
String() => 빈 스트링 객체 생성
String(char[] value) => char 배열의 문자들을 스트링 객체로 생성
String(String original) => 매개변수로 주어진 문자열과 동일한 스트링객체 생성
String(StringBuffer buffer) => 매개변수로 주어진 스트링 버퍼의 문자열의 스트링 객체로 생성
 */

