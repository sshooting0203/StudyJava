public class PrivateMethods {
    public static void main(String[] args) {

    }
}
// Interface9에서는 static메서드 없음
interface Interface9{
    void method();
    // 만약 Interface9를 구현하는 클래스가 있다면 반드시 구현해야함(안하면 Compile err)
    // 구현하는 클래스가 따로 없으므로 compile err가 없고 실행도 됨!
    default void defaultMethod1(){
        privateMethod1();
        // 같은 클래스 내이기 때문에 가능
    }
    default void defaultMethod2(){
        System.out.println("Default Method in Interface");
    }
    private void privateMethod1(){
        System.out.println("Private Method in Interface");
        privateMethod2();
        // 같은 클래스 내이기 때문에 가능
        defaultMethod2();
        // default앞에 public 생략
        method();
        // 추상 메서드이지만 public이므로 접근가능
    }
    private void privateMethod2(){
        System.out.println("Private Method2 in Interface");
    }
}