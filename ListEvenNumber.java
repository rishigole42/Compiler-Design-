/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author kpsingh
 */
public class ListEvenNumber {
    public static void main(String [] args){
        int last_number =50;
        System.out.println("printing even number between 1 and "+last_number);
        for(int i=0;i<=last_number;i++){
            if(i%2==0){
                System.out.print(i+"  ");
            }
        }
    }
    
}
