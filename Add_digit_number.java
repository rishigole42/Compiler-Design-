import java.util.Scanner;
public class Add_digit_number {
    public ststic void main(String [] args){
        int sum =0,last_digit;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number");
        int number =sc.nextInt();
            last-digit =number%10;
            sum = sum+last_digit;
            number =number/10;
        }
        System.out.println("Sum of digit are:"+sum);
    }
}
