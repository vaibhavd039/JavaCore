public class LambdaExp {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("Random Animal Sound");
            }
        };

        animal.sound();

        Animal ani = () -> {
            System.out.println("Lambda Animal");
        };
        ani.sound();
    }


}
