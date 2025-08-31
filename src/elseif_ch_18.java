
    import java.util.Scanner;
    public class elseif_ch_18 {
          public static void main(String[] args) {
              int age;
              System.out.println("Enter your age");

              Scanner sc = new Scanner(System.in) ;
              age = sc.nextInt();

//              if (age>56){
//                  System.out.println("you are experienced");
//
//
//              }
//              else if(age>46){
//                  System.out.println("you are semi experience");
//
//              } else if (age > 36) {
//                  System.out.println("you are semi semi experience");
//
//              }
//              else{
//                  System.out.println( "you are not experience");
//              }

             switch(age){
                 case 18:
                     System.out.println("you are going to become an Adult!");
                     break;
                 case 23:
                     System.out.println("you are going to join a job");
                     break;
                 case 60:
                     System.out.println("you are goine to get retired ");
                 default:
                     System.out.println("Enjoy your Life!");

             }



          }
}
