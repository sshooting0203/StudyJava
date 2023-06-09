package HereInterface;

import org.w3c.dom.ls.LSOutput;

public class HereInterface {
    public static void main(String[] args) {
//    new PhoneInterface();
//    PhoneInterface planet = new PhoneInterface();
        // compile err => Interface는 객체를 생성하는 것이 불가
        PhoneInterface galaxy;
        // Interface 타입의 레퍼런스 변수는 생성할 수 있음
        // 코드 상으로 객체가 생성되어 있지 않지만
        // 내부적으로는 CLs 객체를 가리킴
//        System.out.println(galaxy.TIMEOUT);
//        galaxy.getPhoneNum();
        // compile err
        System.out.println(PhoneInterface.TIMEOUT);
        // static으로 선언되어 있으므로 Interface로 접근가능
        Phone ph1 = new Phone();
        PhoneInterface ph2 = new Phone();
        System.out.println(ph1.TIMEOUT);
        ph1.printLogo();
        ph1.receiveCall();
        ph1.sendCall();
        Phone ph3;
//        System.out.println(cls3.TIMEOUT);
//        cls3.printLogo();
//        cls3.receiveCall();
//        cls3.sendCall();
        // compile err => 객체가 생성되어 있지 않음!
    }
}
interface PhoneInterface {
    public static final int TIMEOUT = 10000;
    int TIMEON = 0;
    // 상수 필드 => (public static final) 생략가능
    public abstract void sendCall();
    void receiveCall();
    abstract void exitCall();
    // 추상 메소드  => (public abstract) 생략가능
    public default void printLogo() {
        System.out.println("**Phone**");
    }
    default String getPhoneNum() {
        return "010-3753-1785";
    }
    // default 메소드 => (public) 생략가능
    /* 보다시피 인터페이스의 모든 메소드들은 접근지정자가 public(구현해야하기 때문)*/
//    public void urgent119(){
//        System.out.println("----System Calling----");
//    }
    // 일반 메소드는 Interface에서 구현 불가능!
    // default, private, static 메소드가 java8부터 추가
}
interface Electronics extends Electric, Electric2{
    //    java는 인터페이스끼리 상속 가능(인터페이스끼리 계층적 관계 형성가능)
    //    java는 인터페이스 다중상속은 가능
    // public interface Electronics
    // compile err => 클래스와 유사하게 인터페이스 또한 1가지만 public으로 선언가능
    public static final int light=1000;
    public abstract void LightOn();
    public abstract void LightOff();
}
interface Electric{
}
interface Electric2{
}
class Phone implements PhoneInterface,Electronics{
    // java는 클래스의 다중상속 불가능 cf.c++
    // java는 인터페이스의 다중구현 가능
    // java는 인터페이스의 다중상속 가능
    @Override
    public void sendCall(){System.out.println("sendCall");}
    @Override
    public void receiveCall(){System.out.println("receiveCall");}
    @Override
    public void exitCall(){System.out.println("exit from all!");}
    @Override
    public void LightOn(){}
    @Override
    public void LightOff(){}
}
class WearablePhone implements PhoneInterface{
    @Override
//    void sendCall(){System.out.println("send");}
    // compile err
    // 접근지정자를 생략하면 자동적으로 default가 되고 Public->Default로 좁아짐 => public 생략x
    // Interface에서 abstract로 선언한 모든 메서드를 구현하지 않으면 compile err
    public void sendCall(){System.out.println("send");}
    @Override
    public void receiveCall(){System.out.println("receive");}
    @Override
    public void exitCall(){System.out.println("exit!");}
    public void flash(){System.out.println("Go back to your phone!");}
    //메소드 추가 구성
    @Override
    public String getPhoneNum(){return "WearablePhone_3753_1785";}
    //default 메소드는 자동으로 상속됨, Override도 가능함
}
class iPhone extends Phone implements PhoneInterface{
}
//class LgPhone implements PhoneInterface extends CLs{
//}
// extends키워드가 implements 키워드 앞에 쓰여야 함!
interface MobilePhoneInterface extends PhoneInterface{
    void sendSMS();
    void receiveSMS();
}
interface MP3Interface{
    public void play();
    public void stop();
}
class PDA{
    public int calculate(int x, int y){return x+y;}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
    @Override
    public void sendCall(){System.out.println("Bell ringing~");}
    @Override
    public void receiveCall(){System.out.println("Please answer~");}
    @Override
    public void exitCall(){System.out.println("Stop bothering me!");}
    @Override
    public void play(){System.out.println("Play Start");}
    @Override
    public void stop(){System.out.println("Stop playying!");}
    @Override
    public void sendSMS(){System.out.println("send Message!");}
    @Override
    public void receiveSMS(){System.out.println("Message Arrive!");}
}
