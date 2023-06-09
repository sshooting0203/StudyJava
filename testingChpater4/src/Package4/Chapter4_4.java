package Package4;
class Book{
    String title;
    String author;
    void show(){
        System.out.println(title+"."+author);
    }
    public Book(){
        this("","");
        System.out.println("생성자 호출됨");
    }
    public Book(String title){
        this("","작자미상");
        // this()같은 경우에는 생성자의 첫 번째 문장이 아니면 compile err
        this.title = title;
        this.author = "작자미상";
    }
//    public Book(String author){
//        this.title = "제목미상";
//        this.author = author;
//    }
    //같은 모양으로 생성자를 만들 수 없음, 매개변수의 형이 같으면 컴파일러가 혼동
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

public class Chapter4_4 {
    public static void main(String[] args) {
        Book loveStory = new Book("춘향전");
        loveStory.show();
        Book emptyBook = new Book();
    }
}
