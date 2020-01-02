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
public class AreaCircle {
    public static void main(String []args)
    {
        double pi=(22/7);
        float r,A;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius of circle");
        r=sc.nextFloat();
        A=(pi*r*r);
        System.out.println("Area:"+A);
        System.out.println(pi);
    }
    
}
