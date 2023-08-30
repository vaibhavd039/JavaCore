package exceptionhandling;

import java.io.IOException;

public class UncheckedGame {

    public static void main( String [] args){
        Unchecked uc = new Unchecked();
        uc.game(1,0);
    }
}

class Unchecked {
    public void game(int a, int b){
        System.out.print(a/b);
    }
}
