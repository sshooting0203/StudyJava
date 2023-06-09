package AboutString;

public class TestingCompareTo {
    public static void main(String[] args) {
        String java = "java";
        String cpp = "C++";
        int res = java.compareTo(cpp);
        System.out.println(res);
        String java2 = "JAVA";
        int res2 = java.compareTo(java2);
        System.out.println(res2);
        System.out.println(java.codePointAt(0));
        System.out.println(java2.codePointAt(0));
        // 106-74 = 32
    }
}
// class String implements Comparable<String>{...}
// Comparable<E> 인터페이스 = 객체들 간의 순서를 비교
// public interface Comparable<E>{ public int compareTo(E o);}
// 이 인터페이스를 구현한 클래스는 compareTo()메서드를 구현해야함
// compareTo() 메서드는 각 문자의 유니코드 값을 비교하여 순서 결정
