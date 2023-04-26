import AppConfig.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.driver.Driver;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Driver busDriver = context.getBean("busDriver", Driver.class);
        Driver carDriver = context.getBean("carDriver", Driver.class);
        Driver pickupDriver = context.getBean("pickupDriver", Driver.class);
        System.out.println(busDriver);
        System.out.println(carDriver);
        System.out.println(pickupDriver);
    }
}
