package org.iesfm.buscador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

import static org.iesfm.buscador.BuscadorTexto.buscar;

public class BuscadorPalabras {
    private final static Logger log = LoggerFactory.getLogger(BuscadorPalabras.class);
    public static void main(String[] args) {



        try(BufferedReader reader=
                    new BufferedReader(
                            new FileReader(
                                    "src/main/resources/el_quijote.txt"
                            )
                    )
        ) {


            String line= reader.readLine();
            while(line !=null){
                log.info(line);
                line= reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        buscar("Sancho Panza");
    }

}
