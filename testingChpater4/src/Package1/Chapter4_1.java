package Package1;
class Animal {
    String name;
    int age;
    /*생성자의 조건 >> 1.리턴타입x 2.클래스이름==생성자명 3.매개변수마음대로 */
//    Animal(int age){
//        this.age = age;
//        this.name = "알 수 없음";
//    }
//    Animal(int age, String name){
//        this.age = age;
//        this.name = name;
//    }
    // Aniaml생성자를 오버로딩(overloading)
    // 오버로딩 : 같은 이름이지만 다르게 작동하는 여러 메소드
    void speak(){}
}
class Human extends Animal{
    // java는 클래스 다중 상속x
    String hobby;
    String job;
    void speak(){
        System.out.println("하하하");
    }
    // speak()함수를 오버라이딩(overriding)
    // 오버라이딩 : 슈퍼클래스의 메소드를 서브클래스마다 다르게 구현
}
class Dog extends Animal{
//    Dog(int age,String name){
//        super(age,name);
//    }
    void speak(){
        System.out.println("멍멍");
    }
}
class Chicken extends Animal{
//    Chicken(int age,String name){
//        super(age,name);
//    }
    void speak(){
        System.out.println("꼬꼬");
    }
}
public class Chapter4_1 {
    public static void main(String[] args) {
        int a=3; //이것은 객체
        String b="hi"; //이것은 객체가 아님
        Dog d1 = new Dog();
        // 객체에 대한 레퍼런스 변수 선언 = 객체 생성
        // 객체생성 = 클래스 타입 크기의 메모리할당(힙) + 객체 내 생성자코드실행
        d1.speak();
        Chicken c1 = new Chicken();
        c1.speak();
        Human h1 = new Human();
        h1.speak();
        Human h2;
//        System.out.println(h2.name);
//        h2.speak();
        //객체를 초기화(initialized)하지 않으면 접근할 수 없음!
        String  c = new String();
        System.out.println(c);
        // 공백 출력
    }
}
