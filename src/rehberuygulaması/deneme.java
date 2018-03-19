/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rehberuygulaması;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 112
 */
public class deneme {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        Date dt = new Date();
        System.out.println(dt.toString());
        System.out.println(df.format(dt));
    }

}
