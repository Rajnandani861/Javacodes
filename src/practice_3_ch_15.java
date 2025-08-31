public class practice_3_ch_15 {
    public static void main(String[] args) {
        String name = "aryan";
        name  = name.toLowerCase();
        System.out.println(name);

        // problem2
        String text = "how are you";
        text= text.replace(" ","_");
        System.out.println(text);


        // problem 3
        String letter = "Dear <|name|>, thanks a lot";
        letter =  letter.replace("<|name|>", "sejal");
        System.out.println(letter);


        // problem4
        String yourString = "this string contains double and triple space";
        System.out.println(yourString.indexOf(" "));
        System.out.println(yourString.indexOf(" "));

        // problem5
        String myLetter = "Dear Sejal,\n\t this java cource is nice.\n \tthanks you ";
        System.out.println(myLetter);


    }
}
