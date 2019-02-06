/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dictionaryapp.clientutil;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Util {
    public static String clientanswer() {
        Scanner sc=new Scanner(System.in);
        String answer = sc.nextLine();
        return answer;
    }
    
}
