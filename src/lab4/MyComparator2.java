package lab4;

import java.util.Comparator;

public class MyComparator2 implements Comparator<MyClass> {
    @Override
    public int compare(MyClass o1, MyClass o2) {
        return o1.getField2() - o2.getField2();
    }
}
