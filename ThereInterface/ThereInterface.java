package ThereInterface;
public class ThereInterface {
    public static void main(String[] args) {
        F3 f3 = new F3();
        f3.f1();
        f3.f2();
        I I3 = new F3();
        I3.f2();
        // compile ok!
        F2 F3 = new F3();
//        F3.f2();
        // compile err => F2가 F3의 상위 클래스는 맞지만, F2의 인스턴스에서 f2를 불러올 수 없음
        Object O3 = new F3();
        //가장 상위클래스인 Objects까지 레퍼런스타입으로 사용할 수 있음
//        O3.f2();
    }
}
interface I{
    int num=10;
    void f1();
    void f2();
}
abstract class F1{
//    abstract class F1 extends I
    // compile err => 추상클래스가 인터페이스를 상속받을 수는 없음
}
abstract class F2 extends F1{
}
class F3 extends F2 implements I{
    // Interface 하나를 여러개의 클래스가 구현
    // 클래스마다 달라지므로 "동적바인딩"이라고 볼 수 있음
    @Override
    public void f1(){
        System.out.println("playing f1!");
    }
    public void f2(){
        System.out.println("playing f2!");
    }
}