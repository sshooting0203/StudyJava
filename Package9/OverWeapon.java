package Package9;

public class OverWeapon {
    public static void main(String[] args) {
        Weapon weapon;
        weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 "+weapon.fire());
        //정적바인딩
        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 "+weapon.fire());
        //동적바인딩
    }
}
class Weapon{
    protected int fire(){
        return 1;
    }
}
class Cannon extends Weapon{
    @Override
    protected int fire(){
        return 10;
    }
    /* 메소드 오버로딩
    1. 같은 클래스, 상속 관계에서 동일한 이름의 메소드 중복작성
    2. 동일한 클래스 내, 상속 관계
    3. 사용의 편리성 향상, 다형성 실현
    4. 메소드 이름 반드시 동일, 매개변수 타입이나 개수가 달라야 성립
    5. 정적 바인딩(compile time에 결정)
     */
    /* 메소드 오버라이딩
    1. 서브 클래스에서 슈퍼 클래스에 있는 메소드와 동일한 이름의 메소드 재작성
    2. 상속 관계
    3. 새로운 기능의 메소드를 재정의, 다형성 실현
    4. 메소드의 이름 = 매개변수 타입과 개수 = 리턴 타입
    5. 동적 바인딩(run time에 결정)
     */
}