package lab7;

import java.util.ArrayList;

public class MySetChild extends MySet {
    private Object[] elements = new Object[150];

    public MySetChild(ArrayList<Integer> arrayList) {
        super(arrayList);
    }

    /*public MySetChild(ArrayList<Integer> arrayList) {
//        super(arrayList);
        System.out.println(":)");
    }*/
}
