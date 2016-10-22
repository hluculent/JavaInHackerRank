import java.io.*
import java.util.*
import java.text.*
import java.math.*
import java.util.regex.*

public static void main(String[] args){
  int i = 4;
  double d = 4.0;
  String s = "HackerRank";
  
  Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int j;
        double b;
        String s1;
        /* Read and save an integer, double, and String to your variables.*/
        j = scan.nextInt();
        b = scan.nextDouble();
        scan.nextLine();
        s1 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + j);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + b);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + s1);
   scan.close();
   }
}
