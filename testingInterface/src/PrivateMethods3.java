public class PrivateMethods3 {
}
interface Interface11{
    void method();
    default void defaultMethod(){
        
    }
    static void staticMethod(){
        
    }
    private static void privateStaticMethod(){
        
    }
    private void privateMethod(){
        method();
        defaultMethod();
        staticMethod();
        privateStaticMethod();
        // static methods, non-staic methods 모두 접근가능
    }
}
