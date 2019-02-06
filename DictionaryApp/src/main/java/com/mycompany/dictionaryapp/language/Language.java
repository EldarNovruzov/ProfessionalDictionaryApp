/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.language;

import com.mycompany.dictionaryapp.clientutil.Util;

/**
 *
 * @author Acer
 */
public class Language {
    public static boolean language;
    public static void chooseLanguage() {
        String clientanswer = Util.clientanswer();
        if (clientanswer.equalsIgnoreCase("ingilisce")) {
            language= true;
        }else if(clientanswer.equalsIgnoreCase("azerbaycanca")){
            language= false;
        }
       
    }
    
     
}
