import model.Book;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class test {

    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
        System.out.println("in main about to get bean..");
        Book book = (Book) context.getBean("book");
        System.out.println("got bean book..");
        book.sayHello();
        System.out.println("about to close context..");
        context.close();
    }
}
