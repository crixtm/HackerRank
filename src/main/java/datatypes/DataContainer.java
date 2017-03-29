package datatypes;

import java.util.Scanner;

public class DataContainer {
    final private int i;
    final private double d;
    final private String s;

    public DataContainer(int i, double d, String s) {
        this.i = i;
        this.d = d;
        this.s = s;
    }

    public DataContainer() {
        this(getInt(), getDouble(), getString());
    }

    private static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("string?");
        String str = sc.nextLine();
        sc.close();
        return str;
    }

    private static int getInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("int?");
        return sc.nextInt();
    }

    private static double getDouble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("double?");
        return Double.valueOf(sc.nextLine());
    }

    public int getI() {
        return i;
    }

    public double getD() {
        return d;
    }

    public String getS() {
        return s;
    }


    public DataContainer addDC(DataContainer dc2) {
        return new DataContainer(this.i + dc2.i, this.d + dc2.d, this.s + dc2.s);
    }

    @Override
    public String toString() {
        return Integer.toString(i) + ", " + d + ", " + s;
    }
}
