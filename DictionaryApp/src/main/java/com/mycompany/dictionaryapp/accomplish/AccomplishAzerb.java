/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.accomplish;

import com.mycompany.dictionaryapp.askingquestion.AskAzerb;
import com.mycompany.dictionaryapp.clientutil.Util;
import com.mycompany.dictionaryapp.language.Language;
import com.mycompany.dictionaryapp.questionanswer.QuestionAnswerAzerb;
import com.mycompany.dictionaryapp.utility.FileReader;
import static com.mycompany.dictionaryapp.utility.MenuHelper.helper;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class AccomplishAzerb {
    public static void accomplishAzerb() throws Exception {
        while (Language.language == false) {
            Map<String, String> words = FileReader.words();
            while (true) {
                AskAzerb.questionAzerb();
                QuestionAnswerAzerb.answerAzerb();
                if (FileReader.filereader.isEmpty()) {
                    System.out.println("\nButun suallari duzgun cavablandirdiniz: Tebrikler");
                    return;
                }

            }
        }
    }
    
    public static void finalmethod() throws Exception {
        AccomplishAzerb.accomplishAzerb();
        if (Language.language!=false) {
            return;
        }
         System.out.println("\nDavam Etmek isteyirsiniz?:"
                    + "\n isteyirsinizse +, "
                 + "\nistemirsizse - (bu isareden sonra enter-i basdiqdan sonra bir daha enter-i basin) olaraq daxil edin:");
            if (Util.clientanswer().equalsIgnoreCase("+")) {
                helper();
            } else if (Util.clientanswer().equalsIgnoreCase("-")) {
                System.exit(0);
            } 
            System.exit(0);
    }


   
}
