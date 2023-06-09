package Package5;
class Value{
    static void increase(int m){
        m = m+1;
    }
//    static int increase(int m){
//        m = m+1;
//    }
    // 리턴타입은 메소드의 오버로딩과 관련없음.
    static void increase(int[] arr){
        for (int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String[] args) {
        int num = 10;
        Value v = new Value();
        increase(num);
        // 호출자가 건네는 값이 매개변수에 복사
        Value.increase(num);
        // 같은 클래스 내에서 static끼리 호출할 때 => 클래스명.메소드(); (o) 메소드(); (o)
        int arr[] = {1,2,3,4,5};
        increase(arr);
        // 호출자가 건네는 레퍼런스 값이 매개변수에 복사
        System.out.println("메소드 오버로딩(overloading)");
        // System클래스의 out필드의 println메서드...(오버로딩된 메서드)
        Value vv = new Value();
        Value vvv = new Value();
        vvv = vv;
        //vvv가 가리키던 객체는 가비지로 전환
        //가비지 = 가리키는 레퍼런스가 하나도 없는 객체
        vvv = null;
        // 객체에 null을 대입 <=> 가비지로 전환
    }
}
public class Chapter4_5 {

}
