package autowire.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//In this we have to initialise a constructor of class we want to inject in. In this case i am using the car class to get injected from the specification bean.
//So in this we initialize a contructor that takes the input of Specification object and then inject in the variable.
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByConstructor.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
