package AboutImport;//import java.util.Scanner;
// 특정 클래스의 경로명만 포함
import java.util.*;
// 패키지 내의 모든 클래스 포함(하위 패키지의 클래스까지 포함하지는 않음!)
public class UsingImport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
/*
디폴트 패키지 = 패키지 선언문 없이 만들어진 클래스의 패키지
디폴트 패키지 = 현재 디렉터리
<패키지의 특징>
1. 패키지 계층구조
2. 패키지별 접근 제한
3. 동일한 이름의 클래스와 인터페이스 사용가능
4. 높은 소프트웨어 재사용성
모듈 = 패키지와 이미지 등의 리소스를 담은 컨테이너
모듈은 .jmod로 저장
java.lang
자동으로 import
String,Math 등 기본적인 클래스와 인터페이스 포함
java.util
날짜, 시간, 벡터, 해시맵 다양한 유틸리티 클래스와 인터페이스 포함
java.io
입출력을 할 수 있는 클래스와 인터페이스 포함
java.awt
자바 GUI 프로그래밍을 위한 클래스와 인터페이스 포함
 */
