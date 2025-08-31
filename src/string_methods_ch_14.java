import java.util.Locale;

public class string_methods_ch_14 {
             public static void main(String[] args) {
                 String name = "Sejal";
              //   String name = new String("sejal");
                 System.out.println(name);
                 int value = name.length();
                 System.out.println(value);

                // String lstring = name.toLowerCase();
                // System.out.println(lstring);

               //  String uString = name.toUpperCase();
              //   System.out.println(uString);

               //  String nonTrimmedString = "    Sejal    ";
                // System.out.println(nonTrimmedString);




              //   String trimmedString = nonTrimmedString.trim();
              //   System.out.println(trimmedString);

                // System.out.println(name.substring(2));
               //  System.out.println(name.substring(1,4));

               //  System.out.println(name.replace('a', 'u'));
              //   System.out.println(name.replace("al", "uu"));


               //  System.out.println(name.startsWith("Sej"));
               //  System.out.println(name.endsWith("jal"));


                 System.out.println(name.charAt(1));


                 String modifiedName = "sejaljal";
                 System.out.println(modifiedName.indexOf("jal"));
                 System.out.println(modifiedName.indexOf("jal", 4));
                 System.out.println(modifiedName.lastIndexOf("jal", 4  ));
                 System.out.println(name.equals("sejal"));

                 System.out.println("i am escape\\ double quote");


             }
}
