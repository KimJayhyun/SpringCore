package exam;

public class BookExam01 {
    public static void main(String[] args){
        Book book1 = new Book("java", 20000);
        System.out.println(book1.getTitle());
        System.out.println(book1.getPrice());
    }
}