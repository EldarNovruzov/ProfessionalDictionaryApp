/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.randomint;

import com.mycompany.dictionaryapp.utility.FileReader;

/**
 *
 * @author Acer
 */
public class RandomInt {

    public static int randomInt() {
        int i = FileReader.filereader.size();
        return ((int) (Math.random() * (i - 1)) + 1);
    }

}
