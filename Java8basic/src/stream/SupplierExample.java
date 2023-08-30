package stream;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> supp = () -> {return "this is done";};
        System.out.println(supp.get());
    }
}
