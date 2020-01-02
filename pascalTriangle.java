package helloworld;

import java.util.Scanner;
package helloworld;
public class pascalTriangle {
    public static void main(String [] args){
        int bin, p,q,r,x;
        Scanner input = new Scanner(System.in);
        System.out.println("How many row Do you want to input:");
        r = input.nextInt();
        bin=1;
        q=0;
        
        System.out.println("pascal triangle:");
        while(q<r){
            for(p=40-3*q;p>0;--p)
                System.out.print("");
            for(x=0;x<=q; ++x){
                if((x==0)|| (q==0))
                 bin=1;
                else
                    bin = (bin*(q-x+1))/x;
                System.out.print("   ");
                System.out.print(bin);
            }
            System.out.println("");
            ++q;
        }
    }
    
}
