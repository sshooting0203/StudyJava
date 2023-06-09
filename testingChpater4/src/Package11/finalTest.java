package Package11;

public class finalTest {
    public static void main(String[] args) {
    }
    protected final int finalMethod(){
        System.out.println("이것은 final 메소드");
    }
}
class SubTest extends finalTest{
//    protected int finalMethod(){
        // compile err => final메소드는 오버라이딩을 불허함
//    }
}
final class FinalClass{

}
//class SubClass extends FinalClass{
    // compile err => final클래스는 상속을 불허함
//}
class FinalClass2{
    public static final double PI = 3.14;
    // final 필드 => 상수를 선언할 때 사용
    // 접근지정자 static final type 순으로 나열
//    public static final int;
    //compile err => final필드는 초기값 지정필요, 실행 주 값변경 불가능
}
final class SubClass2 extends FinalClass2{

}