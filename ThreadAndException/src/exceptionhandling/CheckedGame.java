package exceptionhandling;

import java.io.IOException;

public class CheckedGame {
    public static void main(String[] args) throws IOException {
     CustomChecked checked = new CustomChecked();
     checked.checked(2  );
    }
}

class CustomChecked extends Error {
    public void checked(int i) throws IOException {
        if(i==1){
            throw  new IOException("I am checked");
        }
        System.out.println(i);
    }
}
