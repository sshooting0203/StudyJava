//import Package7.sub2;
//상위 패키지에서 하위패키지를 import 불가능(1. 패키지간의 독립성 유지, 2. 이름 충돌방지)
package Package7;
public class Chapter4_6 {
    public static void main(String[] args) {
        Package7.sub1.A a = new Package7.sub1.A();
        System.out.println(Package7.sub1.A.Anum);
        //import하지 않아도 접근 가능함
        //단 static 클래스인 main안이므로 Anum또한 static이어야 가능
    }
}
//package Package7.sub1;
//class A{
//
//}
// 같은 코드 공간에 패키지를 연달아서 선언할 수 없음