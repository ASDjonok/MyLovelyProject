package lab4;

import java.util.Objects;

public class MyClass implements Comparable<MyClass> {
    private int field1;
    private int field2;
    private int field3;
    private int field4;
    private int field5;

    public MyClass(int field1, int field2, int field3, int field4, int field5) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
        this.field5 = field5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return field1 == myClass.field1 &&
                field2 == myClass.field2 &&
                field3 == myClass.field3 &&
                field4 == myClass.field4 &&
                field5 == myClass.field5;
    }

    @Override
    public int hashCode() {
        return Objects.hash(field1, field2, field3, field4, field5);
    }

    public int getField1() {
        return field1;
    }

    /**
     * Set value to field1 if password is valid
     * @param field1 value of field1
     * @param password secret
     */
    public void setField1(int field1, String password) {
        if (field1 != 13 && password.equals("1111")) {
            this.field1 = field1;
        }
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public int getField3() {
        return field3;
    }

    public void setField3(int field3) {
        this.field3 = field3;
    }

    public int getField4() {
        return field4;
    }

    public void setField4(int field4) {
        this.field4 = field4;
    }

    public int getField5() {
        return field5;
    }

    public void setField5(int field5) {
        this.field5 = field5;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                ", field3=" + field3 +
                ", field4=" + field4 +
                ", field5=" + field5 +
                '}';
    }

//    @Override
    public int compareTo(MyClass o) {
        int result = field2 - o.field2;
        return result != 0 ? result : field1 - o.field1;
    }


}
