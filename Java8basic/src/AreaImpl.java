public class AreaImpl {
    public static void main(String[] args) {

        Area area = (int a, int b) -> {return a * b;};
        System.out.println(area.getArea(5, 10));
    }
}
