package helloworld;

public class Main {
    public static void main(String[] args) {
        Greeting originalGreeting = new Greeting("Hello, World.");
        Greeting greeting = new Greeting();
        System.out.println(originalGreeting.getGreeting());
        System.out.println(greeting.getGreeting());
    }
}
