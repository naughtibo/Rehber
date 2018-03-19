/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehberuygulaması;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 112
 */
public class DosyaIslemleri {

    String path = "D:\\ornek.txt";
    File dosya = new File(path);

    public String dosyaOku() {
        try {
            FileReader fileReader = new FileReader(dosya);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string = bufferedReader.readLine();
            return string;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";

    }

    public void dosyaYaz(String string) {
        try {
            FileWriter fileWriter = new FileWriter(dosya, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append(string+"@");
            bufferedWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(DosyaIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
