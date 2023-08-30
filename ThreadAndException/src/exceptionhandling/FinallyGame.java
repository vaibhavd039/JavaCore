package exceptionhandling;

import java.io.IOException;

public class FinallyGame {
    public static void main(String[] args) {
        try {
            try {
                m1();
            } catch (ArithmeticException ex) {
                System.out.println("hello");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("hello array");
                throw new IOException();
            }
            finally {
                System.out.println("inner");
            }
        } catch (RuntimeException ex) {
            System.out.println("hello run");
        }
        catch (IOException ex) {
            System.out.println("hello IO");
        }
        finally {
            System.out.println("outerfinallu");
        }


    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        throw new ArrayIndexOutOfBoundsException();
    }

}
