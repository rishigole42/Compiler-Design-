/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import com.sun.xml.internal.fastinfoset.util.StringArray;

/**
 *
 * @author kpsingh
 */
public class StringTocharacterArray {
    public static void main(String [] args){
        String str0ring = "hello World";
        char[] stringArray;
        stringArray = str0ring.toCharArray();
        boolean[] StringArray = null;
        
        for (int index =0; index<stringArray.length; index++)
            System.out.println(StringArray[index]);
    }
    
}
