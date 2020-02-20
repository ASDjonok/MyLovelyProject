package lab7;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        mySet.clear();
        /*A a = new A();
        MySet mySet = null;
        System.out.println(mySet.foo);
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        mySet = new MySet(arrayList);
        //...
        mySet = new MySetChild(arrayList);*/

        ArrayList<String> arrayList = new ArrayList();
//        System.out.println(arrayList.getClass());
        arrayList.add("1");
        arrayList.add("2");
        for (String s : arrayList) {
            System.out.println(s);
            arrayList.remove(1);
        }
//        System.out.println(arrayList.size());

        /*HashSet hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("1");
        System.out.println(hashSet.size());*/
    }
}
