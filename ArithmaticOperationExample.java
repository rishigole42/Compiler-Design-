/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package helloworld;


public class ArithmaticOperationExample {
    public static void main(String [] args){
        float a,b,sum,subs,mul,div,reminder;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter two values");
        a=s.nextFloat();
        b=s.nextFloat();
        sum=a+b;
        subs=a-b;
        mul=a*b;
        div=a/b;
        reminder=a%b;
        System.out.println("sum="+sum);
        System.out.println("subs="+subs);
        System.out.println("mul="+mul);
        System.out.println("div="+div);
        System.out.println("reminder="+reminder);
        
        
    }
    
}
