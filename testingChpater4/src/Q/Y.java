package Q;

public class Y {
//    private int n;
//    private void g(){
//        n=5;
//    }
}
class Z {
    void g(){
        Y y = new Y();
//        y.n = 7;
//        y.g();
    }
}
class W {
    private int n;
    protected void g(){
        n=5;
    }
    void h(){
        Z x = new Z();
    }
}
class U extends W{
    void f(){
//        n=3;
        g();
    }
}