package AboutString;

public class TestingStringMethod {
    public static void main(String[] args) {
        String a = new String(" c#");
        String b = new String(",   c++ ");
        System.out.println(a + " 의 길이는 " + a.length());
//        System.out.println(a.contains('c');
//        CharSequence 안에는 char은 해당되지 않음
        System.out.println(a.contains("C"));
        System.out.println(a.contains("c"));
        a = a.concat(b);
        System.out.println(a);
        String s0[] = a.split(" ");
        for (int i=0;i<s0.length;i++){
            System.out.println("분리된 문자열" + i +":"+s0[i]);
        }
        a = a.trim();
        System.out.println(a); //중간의 공백은 제거x
        a = a.replace("c#","java");
        System.out.println(a);
        String s[] = a.split(" ");
        // length 멤버변수
        // 배열 => ()없음 String => ()있음
        for (int i=0;i<s.length;i++){
            System.out.println("분리된 문자열" + i +":"+s[i]);
        }
        String s1[] = a.split("");
        for (int i=0;i<s1.length;i++){
            System.out.println("분리된 문자열" + i +":"+s1[i]);
        }
        a = a.substring(5);
        System.out.println(a);
        char c = a.charAt(2);
        System.out.println(c);
    }
}
/*
String 클래스 주요 메소드
1. char CharAt(int index) => 인덱스에 있는 문자값 리턴
2. int codePoint(int index) => 인덱스에 있는 유니코드 값 리턴
3. int compareTo(String anotherString) => 두 스트링이 같으면 객체>anotherString이면 음수
4. String concat(String str) => 스트링 뒤에 str을 덧붙인 새로운 스트링 리턴
5. boolean contains(CharSequence s) => s에 지정된 문자들을 포함하고 있으면 true
6. int length() => 스트링의 길이 리턴
7. String replace(Charsequence target, Charsequence replacement) => target이 지정하는 일련의
문자들을 replacement가 지정하는 문자들로 변경한 스트링 리턴
8. String[] split(String regex) => 정규식 regex에 일치하는 부분을
중심으로 스트링을 분리하고, 분리된 스트링을 배열에 저장하여 리턴
9. String subString(int beginIndex) => beginIndex부터 시작하는 서브 스트링 리턴
10. String toLowerCase() => 소문자로 변경한 스트링 리턴
11. String toUpperCase() => 대문자로 변경한 스트링 리턴
12. String trim() => 스트링 앞뒤의 공백 문자들을 제거한 스트링 리턴
 */
//String, StringBuffer, StringBuilder 클래스는 Charsequence 인터페이스를 구현함
// immutable하며, 문자열로 간주함
