import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
//Write your code here
//Note: Because we are writing multiple classes in the same file, do not use an access modifier (e.g.: public) in your class declaration (or your code will //not compile); however, you must use the public access modifier before your method declaration for it to be accessible by the other classes in the //file.
class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int tmp = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){tmp+=i;}
        }
        return tmp;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
