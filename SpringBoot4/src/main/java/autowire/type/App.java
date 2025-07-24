package autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// So basically what i am doing is first i am getting the configuration file in the resource folder in which all the beans are available.
// And then i am using the getBean method to get the  dependency of bean we want. In the id parameter we pass the id of the bean that we have added in the configuration file, in this case the autowireByName.xml
// And in the car class we are adding the variable named after the class we want to inject. So for eg in this case we want to inject the dependency of the specification class in the car class, We have added a object of specification class inside the car class
// And inside the configuration i have added so that whenever the bean is created and if there is any variable named specification it will be linked the specification class
// The name of the object can be different then the class name just by changing the id of specification bean in the configuration file.
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireByType.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
