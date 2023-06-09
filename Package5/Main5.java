package Package5;
/*instanceof는 사용을 지양해야 함!*/
public class Main5 {
    public static void main(String[] args) {
        Person p;
//        업캐스팅
//        Student s = new Student("이재문");
//        p = s;
//        업캐스팅 안되는 경우
//        p = new Student("이재문");
//err     Student s = p; (하위타입 != 상위타입)
//        다운캐스팅
//err     Student s = p; (p가 초기화x)
//err     Student s = (Student)p; (p가 초기화x)
//        p를 생성(Person생성자)하고 다시 실행
//        p = new Person("이재문");
//        Student s = p; => compile err(하위타입!=상위타입)
//        Student s = (Student)p;
//        p를 생성(Student생성자)하고 다시 실행
        Person jee = new Student("이경제");
        Person lee = new Researcher("손민잘");
        Person kee = new Professor("잘생쁨");
        System.out.println(jee instanceof Person); //true
        System.out.println(jee instanceof Student); //true
        System.out.println(lee instanceof Person); //true
        System.out.println(lee instanceof Student); //false
        System.out.println(lee instanceof Researcher); //true
        System.out.println(kee instanceof Person); //true
        System.out.println(kee instanceof Student); //false
        System.out.println(kee instanceof Professor); //true
        System.out.println(kee instanceof Researcher); //true
        System.out.println("a" instanceof String); // String은 레퍼런스 타입이므로 가능
        //System.out.println("a" instanceof int); //String에서 int로 캐스팅할 수 없다고 뜸
        //System.out.println(3 instanceof int); //int에서 int로 캐스팅할 수 없다고 뜸
    }
}
class Person{
    private String name;
    private String id;
    public Person(String name){
        this.name = name;
        System.out.println("매개변수 생성자");
    }
}
class Researcher extends Person{
    private String field;
    public Researcher(String f){
        super(f);
        this.field = f;
    }
}
class Student extends Person{
    private String grade;
    private String department;
    public Student(String name){
        super(name); //이 문장이 없다면 super()인 생성자를 찾을 수 없으므로 compile err
    }
}
class Professor extends Researcher{
    private String major;
    public Professor(String m){
        super(m);
        this.major = m;
    }
}