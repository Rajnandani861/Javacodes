
   import java.util.Scanner;
    public class Takinginput_ch_05 {
       public static void main(String[] args) {
           System.out.println("Taking input from the user");
           Scanner sc = new Scanner(System.in);
        //   System.out.println("Enter number1 ");
           // int a = sc.nextInt();
        //   System.out.println("Enter number2 ");
         //  float b = sc.nextFloat();
         //  //int b = sc.nextInt();
         //  float sum = a + b ;
         //  int sum = a + b ;
          // System.out.println("The sum of these number is");
         //  System.out.println(sum);
          // boolean b1 = sc.hasNextInt();
        //   System.out.println(b1);
         //  String str = sc.next();
         //  String str = sc.nextLine();
          // System.out.println(str);


           System.out.println("Enter marks for hindi");
           int hindi = sc.nextInt();
           System.out.println("Enter marks for english");
           int english = sc.nextInt();
           System.out.println("Emter marks for social");
           int social =  sc.nextInt();
           System.out.println("Enter marks for computer");
           int computer = sc.nextInt();
           System.out.println("Enter marks for mathematics");
           int mathematics = sc.nextInt();
           float percentage =( (hindi + english + social + computer + mathematics)/500.0f)*100;


            System.out.println("percentage");

           System.out.println(percentage);



       }



}
