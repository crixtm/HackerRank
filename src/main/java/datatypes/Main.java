package datatypes;

public class Main {
    public static void main(String[] args) {
        DataContainer dc1 = new DataContainer(3, 3.0, "a string");
        DataContainer dc2 = new DataContainer();
        System.out.println(dc1);
        System.out.println(dc2);
        System.out.println(dc1.addDC(dc2).toString());
    }

}
