package Unit1;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
//        greeter.greet(helloWorldGreeter);

        Greeting lambdaGreeting = () -> System.out.println("Hello Lambda Functions");
        lambdaGreeting.perform();
    }
}