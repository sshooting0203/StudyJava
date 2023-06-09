package Package9;

public class Chpater4_8 {
    public static void main(String[] args) {
        StaticSample s1,s2,s3;
        s1 = new StaticSample();
        s1.n=5;
        s1.g();
        s1.m=50;
        s2 = new StaticSample();
        s2.n=8;
        s2.h();
        System.out.println(s1.m);
        s3 = new StaticSample();
        System.out.println(StaticSample.m);
        //static 멤버, 함수는 클래스명으로 접근가능
        StaticSample.f();
        //m을 호출하고 난 후 부르면 5로 출력, 호출하기 전에 값을 요청했으므로 30이 도출
    }
}
class StaticSample{
    public int n;
    public static int m;
    public void g(){
        m=20;
    }
    public void h(){
        m=30;
    }
    public static void f(){
        m=5;
    }
}
// Math m = new Math(); 잘못된 사용법
// Math() 생성자는 private으로 선언되어 있음
// int n = Math.abs(-5); 올바른 사용법

