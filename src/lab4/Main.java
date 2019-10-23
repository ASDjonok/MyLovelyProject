package lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    int myField;
    public static void main(String[] args) {
        MyClass[] myObjects = new MyClass[2];
        myObjects[0] = new MyClass(- 1, 2, 3, 4, 5);
        myObjects[1] = new MyClass(1, 2, 3, 4, 5);
        System.out.println(myObjects[0].compareTo(myObjects[1]));
        System.out.println(Arrays.toString(myObjects));
        for (MyClass myObject : myObjects) {
            System.out.println(myObject/*.toString()*/);
        }
        Arrays.sort(myObjects, new MyComparator());
        System.out.println(Arrays.toString(myObjects));
        Arrays.sort(myObjects, new MyComparator2());
//        Arrays.sort(new String[]{"123", "ASD"}, new MyComparator2());


        Arrays.sort(myObjects, new Comparator<MyClass>() {
            @Override
            public int compare(MyClass o1, MyClass o2) {
                return o1.getField1() - o2.getField1();
            }
        });

        Arrays.sort(myObjects, (o1, o2) ->
                o1.getField1() - o2.getField1());

        Arrays.sort(myObjects,
                Comparator.comparingInt(MyClass::getField1));

        Arrays.sort(myObjects, (o1, o2) ->
                {
                    System.out.println(":p");
                    return o1.getField1() - o2.getField1();
                }
        );

        System.out.println(Arrays.toString(myObjects));
        /*myObjects[0].setField1(1, "1111");
        myObjects[0].setField2(2);
        myObjects[0].setField3(3);
        myObjects[0].setField4(4);
        myObjects[0].setField5(5);*/



//        MyClass myClass = new MyClass();
//        myClass.setField1(1);


        /*String s;
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
        System.out.println(object1.equals(object1));*/

    }
}
