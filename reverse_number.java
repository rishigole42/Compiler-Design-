
import java.util.Scanner;
package helloworld;
public class reverse_number {
    public static void main(String [] args){
        int num,rev=0,r,a;
        Scanner k= new Scanner(System.in);
        System.out.println("Enter a number");
        num= k.nextInt();
        a=num;
        while(num>0)
        {
            r=num%10;
            rev=rev*10+r;
            num=num/10;
        }
        System.out.println("reverse:"+rev);
    }
    
}
