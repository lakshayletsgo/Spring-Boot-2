package car.sample;

public class BeanCar {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    public void showMessage(){
        System.out.println("Message : "+message);
    }

    @Override
    public String toString() {
        return "BeanCar{" +
                "message='" + message + '\'' +
                '}';
    }
}
