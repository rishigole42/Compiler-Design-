/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
package helloworld;

/**
 *
 * @author kpsingh
 */
public class Addition1 {
    public static void main(String [] args){
        int a,b,c;
        Scanner k= new Scanner(System.in)
        System.out.println("Enter two values:");
        a=k.nextInt();
        b=k.nextInt();
        c=a+b;
        System.out.println("Addition:"+c);
    }
    
}
