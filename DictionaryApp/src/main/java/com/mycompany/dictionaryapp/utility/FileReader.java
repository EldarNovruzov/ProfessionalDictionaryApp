/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class FileReader {

    public static Map<String, String> filereader;
    public static String[] split;

    public static Map<String, String> words() throws Exception {
        String read = FileUtil.read("C:\\Workspace\\ProfessionalDictionaryApp\\DictionaryApp\\words.txt");
        filereader = new HashMap<>();
        split = read.split(",");
        String key = "";
        String value = "";
        for (int i = 0; i < split.length - 1; i++) {
            key = split[i];
            value = split[++i];
            filereader.put(key, value);
        }

        return filereader;
    }
}
