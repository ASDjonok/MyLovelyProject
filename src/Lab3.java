public class Lab3 {
    public static void main(String[] args) {
//        System.out.println("ASD. AS as.".replaceAll("^[a-zA-Z]${2}", "!"));

        String text = "As, aa. Aaaaa.";
        String[] words = text.split("[,. ]+");
//        String[] words = text.split("[.]+\\s?");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("========");


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
