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
public class swap2number {
    public static void main(String [] args){
        int a,b,t;
        Scanner p = new Scanner(System.in);
        System.out.println("Enter value in a:");
        a =p.nextInt();
        System.out.println("Enter value in b:");
        b = p.nextInt();
        t = a;
        a = b;
        b = t;
        System.out.println("values in a:"+a);
        System.out.println("values in b:"+b)
    }
    
}
