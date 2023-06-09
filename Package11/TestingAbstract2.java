package Package11;

public class TestingAbstract2 {
    public static void main(String[] args) {
        GoodCalc c1 = new GoodCalc();
        System.out.println(c1.add(2,3));
//        Calculator c2 = new Calculator();
//        c2.add(1,2);
        Calculator c3 = new GoodCalc();
        c3.add(1,5);
//        Calculator c4 = new Calculator();
    }
}
abstract class Calculator{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}
// 추상 클래스 Calculator를 상속받은 GoodCalc를 구현
class GoodCalc extends Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public double average(int[] a){
        double result=0;
        for (int i=0;i<a.length;i++){
            result+=a[i];
        }
        return result/a.length;
    }
}
