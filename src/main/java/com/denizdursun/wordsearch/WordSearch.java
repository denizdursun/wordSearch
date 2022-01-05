/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.denizdursun.wordsearch;
/**
 *
 * @author Deniz
 */

public class WordSearch {
    static String wordSearch(int length, int character, String pdfContent, String key) throws Exception{
        
        boolean b;
        String sonuc = null;
        b = pdfContent.contains(key);
        if (b){
            String t = pdfContent.substring(pdfContent.indexOf(key) + length , pdfContent.length());
            sonuc = t.substring(0,character);
        }
        else{
            System.out.println("Metinde "+key+" Mevcut Değil");
        }
        return sonuc;
    }
}

