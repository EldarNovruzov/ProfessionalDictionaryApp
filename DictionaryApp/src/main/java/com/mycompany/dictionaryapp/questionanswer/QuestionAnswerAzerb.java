/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.questionanswer;

import com.mycompany.dictionaryapp.askingquestion.AskAzerb;
import com.mycompany.dictionaryapp.utility.FileReader;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class QuestionAnswerAzerb {
     public static Map<String, String> words;
    public static String client;

    public static void answerAzerb() throws Exception {
        words = FileReader.filereader;
        client = com.mycompany.dictionaryapp.clientutil.Util.clientanswer();

        if (AskAzerb.key.trim().equals(client)) {
            System.out.println("\nDogru cavab verdiniz tebrikler!!!");
            words.remove(AskAzerb.key, AskAzerb.value);
            return;
        }
        ignoreanswer();

    }

    public static void ignoreanswer() throws Exception {
        for (int j = 0; j <= 2; j++) {
            if (!AskAzerb.key.trim().equals(client)) {
                System.out.println("\nSehv cavab verdiniz,Bir daha cehd edin");
                System.out.println(AskAzerb.value + " " + "nedir?");
                client = com.mycompany.dictionaryapp.clientutil.Util.clientanswer();
                if (AskAzerb.key.equals(client)) {
                    System.out.println("\nDogru cavab verdiniz tebrikler!!!");
                    words.remove(AskAzerb.key, AskAzerb.value);
                    return;
                }
            }

        }

        System.out.println("\nDogru Cavab" + " " + AskAzerb.key);
        words.remove(AskAzerb.key, AskAzerb.value);

    }
}
