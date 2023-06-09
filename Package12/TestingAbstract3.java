package Package12;

public class TestingAbstract3 {
    public static void main(String[] args) {
        M m = new L();
        N n = new L();
        // In my opinion, abstract 키워드가 붙지 않은 생성자는 사용가능
        // In my opinion, abstract 타입도 레퍼런스 변수 사용가능
        L l = new L();
        l.m1();
    }
}
abstract class M{
//    abstract int m0;
    //추상 변수는 사용불가능
    abstract void m1();
    abstract void m2();
    abstract void m3();
}
abstract class N extends M{
    void m1(){
        m3();
        System.out.println("calling m1");
        m3();
    }
    void m2(){
        System.out.println("calling m2");
    }
    abstract void m3();
}
class L extends N{
    void m3(){
        System.out.println("calling m3");
    }
}