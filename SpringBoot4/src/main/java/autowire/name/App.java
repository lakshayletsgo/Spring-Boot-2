package autowire.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//It is somewhat same to the autowire by name. In this the maven looks inside the class of the car and looks where we have initialised an object and if there is a bean of that class then it injects its dependecies.
//For eg. In this i have specified that autowire by type. So in the class of the car i have initialised a object of a class Specification.
// Maven will look for the bean to inject in that class and find it using its type
// In this the variable value is set using the setter for the variable
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByName.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
