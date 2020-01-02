/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kpsingh
 */
import java.util.Scanner;
public class AverageOfNumbers {
    public static void main(String []args){
        int a,b,c,d,e;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five value");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        d=input.nextInt();
        e=input.nextInt();
        float avr=(a+b+c+d+e)/5;
        System.out.println("Average is:"+avr);
    }
    
}
