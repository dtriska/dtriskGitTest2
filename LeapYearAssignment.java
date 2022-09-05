
package leapyearassignment;
import java.util.Scanner;


public class LeapYearAssignment {

    
    public static void main(String[] args) {
        Scanner scnr=new Scanner(System.in);
        System.out.println("Enter the year in question: ");
        int userYear = scnr.nextInt();
        
        System.out.println(userYear);
        
        if ((userYear %100 == 0)&&(userYear %400 == 0))
        {
            System.out.println(userYear + " - is Leap Year");
        }
        else if((userYear % 100 > 0)&& (userYear % 4 == 0)){
            System.out.println(userYear + " - is Leap Year");
        }
        else{
            System.out.println(userYear + " - is not Leap Year");
        }
    }
    // readding comment
}
