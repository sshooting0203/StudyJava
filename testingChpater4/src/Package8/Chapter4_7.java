package Package8;
class Sample{
    public int a; //public 접근지정자
    private int b; //private 접근지정자(같은 클래스 내에서만 접근가능)
    int c; //default 접근지정자(같은 패키지 내에서만 접근가능)
}
public class Chapter4_7 {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
//        aClass.b = 10;
//        private이므로 접근 불가능
        aClass.c = 10;
//        Sample클래스와 Chapter4_7이 같은 패키지 안에 있으므로 접근가능
    }
}
