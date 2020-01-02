/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package helloworld;

public class factorial {
    public static void main(String [] args){
    Scanner s = new Scanner(System.in);
    int a, i,fact =1;
    System.out.println("Enter a value:");
    a=s.nextInt();
    for(i=1;i<=a;i++){
        fact=fact*i;
    }
    System.out.println("factorial of"+a+"is:"+fact);
    }
    
}
