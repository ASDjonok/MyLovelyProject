public class Lab3 {
    public static void main(String[] args) {
        String s = new String("ASD");
        s = s + "B";
        StringBuilder stringBuilder = new StringBuilder("ASD");
        stringBuilder.append("B");

        int a = 1;
        final int b = 2;
        a = 3;
//        b = 4;

        StringBuilder myLovelyString = new StringBuilder("ASD");
        changeString(myLovelyString);
        System.out.println(myLovelyString);
    }

    static void changeString (StringBuilder myLovelyString) {
        myLovelyString.append("Q");
    }
}
