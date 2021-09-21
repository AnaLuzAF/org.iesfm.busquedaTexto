package org.iesfm.buscador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuscadorTexto {
    private final static Logger log = LoggerFactory.getLogger(BuscadorTexto.class);


    public static int buscar(String txt) {
        int p = 0;


        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(
                                     "src/main/resources/el_quijote.txt"
                             )
                     )
        ) {


            String line = reader.readLine();
            while (line != null) {

                if (line.contains(txt)) {
                    p++;

                }
                line = reader.readLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return p;
    }


}
