public class BoxTester {
    public static void main(String[] args) {
        Box box1 = new Box(10, 1, 9);
        Box box2 = new Box(box1);
        Box box3 = box1.big(box1);
        Box box4 = box1.small(box1);
        Box box5 = new Box(1, 23, 13);

        System.out.println(box1.volume());
        System.out.println(box1.surfaceArea());

        System.out.println(box2.volume());
        System.out.println(box2.surfaceArea());

        System.out.println(box3.volume());
        System.out.println(box3.surfaceArea());

        System.out.println(box4.volume());
        System.out.println(box4.surfaceArea());

        System.out.println(box1.nests(box5));
    }
}