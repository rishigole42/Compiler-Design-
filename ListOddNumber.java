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
public class ListOddNumber {
    public static void main(String [] args){
        int last=100;
        for(int i=1; i<=last;i++){
            if(i%2==1){
                System.err.print(i+" ");
            }
        }
    }
    
}
