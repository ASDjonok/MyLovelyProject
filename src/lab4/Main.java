package lab4;

public class Main {
    int myField;
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setField1(1);


        String s;
        s = "AB";
        String s2 = new String("AB");
        System.out.println(s == s2);
        System.out.println(s.equals(s2));

        System.out.println("AB" == "AB");
        System.out.println("AB".equals("AB"));

        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1 == object2);
        System.out.println(object1.equals(object2));
        System.out.println(object1.equals(object1));

    }
}
