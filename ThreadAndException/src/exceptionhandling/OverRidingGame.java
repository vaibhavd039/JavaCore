package exceptionhandling;


import java.io.IOException;

class Mother{
    public void m1  () throws IOException {
        System.out.println("mother");
        throw  new IOException();
    }
}
public class OverRidingGame  extends  Mother{
    public static void main(String [] Args) throws IOException {
        Mother m = new OverRidingGame();
        m.m1();
    }

    @Override
    public  void m1() {
        System.out.println("daughter");
    }
}
