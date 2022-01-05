/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.denizdursun.wordsearch;
//import java.util.*;

import java.io.IOException;

/**
 *
 * @author Deniz
 */
public class Main {
    public static void main(String[] args) throws IOException, Exception{
        String path = "..\\test.pdf";
        Reader pdfReader = new Reader();
        String pdfContent = pdfReader.pdfTextStripper(path);
        String key = "tarih:";
        int character = 10;
        System.out.println(WordSearch.wordSearch(key.length(),character, pdfContent, key));
    }
}