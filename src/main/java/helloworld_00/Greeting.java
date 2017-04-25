package helloworld_00;

import java.util.Scanner;

class Greeting {
    final private String greeting;

    public Greeting() {
        this(getGreetingFromUser());
    }

    public Greeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    private static String getGreetingFromUser() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
