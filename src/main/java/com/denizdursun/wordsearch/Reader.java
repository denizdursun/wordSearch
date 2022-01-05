/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.denizdursun.wordsearch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author Deniz
 */
public class Reader{
  
   public String pdfTextStripper(String pdfPath) throws Exception {
        File initialFile = new File(pdfPath);
        InputStream inputStream = new FileInputStream(initialFile);

        PDDocument pdd = null;
        StringBuilder sb = new StringBuilder("");
        try {
            pdd = PDDocument.load(inputStream);
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setSortByPosition(true);
            for (int i = 0; i < pdd.getNumberOfPages(); i++) {
                //System.out.println("Sayfa :" + i + " " + stripper.getText(pdd));
                sb.append(stripper.getText(pdd));
            }
        } catch (IOException e) {
            // throw error
        } finally {
            if (pdd != null) {
                try {
                    pdd.close();
                } catch (IOException e) {

                }
            }
        }
        String content = "";
        if (sb.toString() != null) {
            content = new String(sb.toString().getBytes());
        }
        
        //content boşlukları alır
        //content = content.replace(" ","");
        return content;
    }
}
