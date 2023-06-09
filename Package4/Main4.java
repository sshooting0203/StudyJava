package Package4;
public class Main4 {
    public static void main(String[] args) {
        One o1,o2,o3;
        o1= new One();
        o2 = new One(4);
        o3 = new One(1,5);
        Two t1;
        t1 = new Two(7,8);
    }
}
class One{
    public One(){
        super();
        System.out.println("첫 번째 생성자");
    }
    public One(int Test){
        super();
        System.out.println("두 번째 생성자");
        System.out.println(Test);
    }
    public One(int Test1, int Test2){
        // super(Test1,Test2); =>compile err
        System.out.println("세 번째 생성자");
    }
}
class Two extends One {
    public Two(){
        super();
        System.out.println("첫 번째 자식생성자");
    }
    public Two(int Test){
        // super(Test1,Test2);  => compile err
        // super(Test1); => compile err
        // default로 super();와 동일
        super(Test);
        System.out.println("두 번째 자식생성자");
    }
    public Two(int Test1, int Test2){
        // super(Test);  => compile err
        // super(Test2); => compile + run
        // Two생성자의 매개변수 중 두 번째를 넣어서 상위클래스 생성자로 전달
        super(Test1,Test2);
        System.out.println("세 번째 자식생성자");
    }
}