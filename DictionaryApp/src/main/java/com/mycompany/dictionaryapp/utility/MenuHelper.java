/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.utility;

import com.mycompany.dictionaryapp.accomplish.AccomplishAzerb;
import com.mycompany.dictionaryapp.accomplish.AccomplishEng;
import com.mycompany.dictionaryapp.clientutil.Util;
import com.mycompany.dictionaryapp.language.Language;
import java.util.concurrent.Executor;

/**
 *
 * @author Acer
 */
public class MenuHelper {

    public static void helper() throws Exception {
        System.out.println("Sual ingilisce sorushulsun yoxsa Azerbaycan dilinde?:"
                + "\nZehmet olmasa azerbaycanca ve ingilisce olaraq cavabi daxil edin");
        Language.chooseLanguage();
        AccomplishEng.finalmethod();
        AccomplishAzerb.finalmethod();
        
        System.exit(0);
           
        

    }
}
