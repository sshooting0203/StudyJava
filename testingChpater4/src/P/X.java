package P;
//import Q.Y;
//1. public 접근지정자를 가진 Y를 import하거나
public class X {
    void f(){
        Q.Y y = new Q.Y();
//2. Q.Y와 같이 패키지와 클래스를 지정해야함
//        y.n = 3;
//        y.g();
    }
}
