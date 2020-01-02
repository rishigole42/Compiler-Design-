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
public class pattern02 {
    public static void main(String[] args){
        int i,j,n;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a value:");
        n=input.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=5;j>=i;j--)
                    
                    
            {
                 System.out.print("*");
            }
             System.out.println();
        }
    }
    
}
