
import java.util.Scanner;
package helloworld;


public class findGreater {
    public static void main(String[] args){
        int a,b,c;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        if(a>=b && a>=c){
            System.out.println("larest number:"+a);
        }
        if(b>=a && b>=c){
            System.out.println("largest number:"+b);
        }
        if(c>=a && c>=b){
            System.out.println("largest number is:"+c);
        }
    }
    
}
