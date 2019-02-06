/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.askingquestion;

import com.mycompany.dictionaryapp.randomint.RandomInt;
import com.mycompany.dictionaryapp.utility.FileReader;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class AskAzerb {
 public static int i;
    public static String key;
    public static String value;
    
    public static void questionAzerb() throws Exception {
        Object[] keys = FileReader.filereader.keySet().toArray();
        Object[] values = FileReader.filereader.values().toArray();
        i = RandomInt.randomInt();
        key=(String)keys[i-1];
        value=(String)values[i-1];
            System.out.println(value+" "+"nedir?");
            
    }

}
