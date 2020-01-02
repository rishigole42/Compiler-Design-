
import java.util.Scanner;
package helloworld;


public class leap_year {
    public static void main(String [] args){
        int year;
        System.out.println("enter a year to chech it is leap or not");
        Scanner s=new Scanner(System.in);
        year=s.nextInt();
        if((year%400==0) !! ((year%4==0) && (year%100!=0)))
        System.out.println("year"+year+"is a leap year");
    
        else
            System.out.println("year"+year+"is not leap year");
                
    }
    
}
