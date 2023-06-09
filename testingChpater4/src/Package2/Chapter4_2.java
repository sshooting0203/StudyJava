package Package2;
class Blank{
    String str;
    int in;
    Boolean bool;
    char ch;
    int test;
    Blank(){
        System.out.println("매개변수 없는 생성자");
    }
    Blank(int test){
        System.out.println("매개변수 있는 생성자");
    }

}
public class Chapter4_2 {
    public static void main(String[] args) {
//        Blank space = new Blank();
//        Blank space = new Blank();
//        int j;
//        int j;
        //두번 선언은 불가능
        Blank space = new Blank();
        space = new Blank();
        space = new Blank(3);
        //new연산자를 사용해 두 번 호출을 가능
        System.out.println(space.str);
        System.out.println(space.in);
        System.out.println(space.bool);
        System.out.println(space.ch);
        // 츌력 결과를 보길... 객체의 비트는 모두 00000...으로 설정되어있음
    }
}
