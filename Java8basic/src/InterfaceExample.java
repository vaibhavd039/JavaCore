interface Abc {
    default int getter(int i) {
        return i * i;
    }

    static int getAra(int a, int b) {
        return a * b;
    }
}

public class InterfaceExample implements Abc {
    public static void main(String[] args) {
        Abc obj = new InterfaceExample();
        System.out.println(obj.getter(2));
        System.out.println( Abc.getAra(2,4));
    }
}
