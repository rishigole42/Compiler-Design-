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
public class pattern01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,j,n;
        System.out.println("Enter a value to print a pattern");
        n=input.nextInt();
        for(i=0;i<=n;i++)
        {
           for(j=0;j<=n;j++)
           {
                System.out.print("*");
           }
           System.out.println();
        }
        
    }
    
}
