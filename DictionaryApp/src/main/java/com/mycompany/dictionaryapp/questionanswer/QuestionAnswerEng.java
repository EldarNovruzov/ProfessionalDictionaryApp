/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.questionanswer;

import com.mycompany.dictionaryapp.askingquestion.AskEng;
import com.mycompany.dictionaryapp.utility.FileReader;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class QuestionAnswerEng {

    public static Map<String, String> words;
    public static String client;

    public static void answerEng() throws Exception {
        words = FileReader.filereader;
        client = com.mycompany.dictionaryapp.clientutil.Util.clientanswer();

        if (AskEng.value.equals(client)) {
            System.out.println("Dogru cavab verdiniz tebrikler!!!");
            words.remove(AskEng.key);
            return;
        }
        ignoreanswer();

    }

    public static void ignoreanswer() throws Exception {
        for (int j = 0; j <= 2; j++) {
            if (!AskEng.value.equals(client)) {
                System.out.println("\nSehv cavab verdiniz,Bir daha cehd edin");
                System.out.println(AskEng.key + " " + "nedir?");
                client = com.mycompany.dictionaryapp.clientutil.Util.clientanswer();
                if (AskEng.value.equals(client)) {
                    System.out.println("\nDogru cavab verdiniz tebrikler!!!");
                    words.remove(AskEng.key, AskEng.value);
                    return;
                }
            }

        }

        System.out.println("\nDogru Cavab" + " " + AskEng.value);
        words.remove(AskEng.key);

    }

}
