public class Main2 {

    static class Class1 {
        String x = "from Class1";
    }

    static class Class2 {
        String y = "from Class2";
    }

    public static void main(String[] args) {
        Class1 myObj1 = new Class1();
        myObj1.x = "Modified";

        Class2 myObj2 = new Class2();
        String y1 = myObj2.y;

        System.out.println(myObj1.x);
        System.out.println(y1);
    }
}
