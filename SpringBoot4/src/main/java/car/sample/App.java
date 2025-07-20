package car.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        BeanCar myBean = (BeanCar) context.getBean("myBean");
        System.out.println(myBean);
    }
}
