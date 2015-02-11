import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO: Description of the class
 */
public class App {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Spring-Module.xml");

        helloWorld obj = (helloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}
