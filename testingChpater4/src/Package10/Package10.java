package Package10;

public class Package10 {
}
class StaticMethod{
    int n;
    static int m;
    void f1(int x){ n=x; }
    void f2(int x){ m=x; }
//    static void s1(int x){ n=x; }
    // compile err => this.n을 바꾸는 함수인데, this가 생성되어 있지 않은 시점에서 호출됨
//    static void s2(int x){f1(3);}
    // compile err => 얘도 위와 동일, this가 생성되어 있지 않은데, 멤버함수 접근 불가능
    static void s3(int x){ m=x; }
    static void s4(int x){s3(3);}
    // 둘은 모두 static 멤버 변수와 함수이므로 접근 가능
//    static void s5(int x){ this.m=x; }
    //this.m이지만 접근 불가능 => static은 this사용불가
}
