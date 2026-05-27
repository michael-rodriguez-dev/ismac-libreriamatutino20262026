package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setup(){
        autor = new Autor(
                1
                ,"Carlos"
                ,"Román"
                ,"Chile"
                ,"Santiago"
                ,"0983456256"
                ,"romantico@correo.com"
        );

    }

    @Test
    public void testAutorConstructorandGetters(){

        assertAll("Pruebas unitarias constructor Autor",
            () -> assertEquals(1,autor.getIdAutor()),
            () -> assertEquals("Carlos",autor.getNombre()),
            () -> assertEquals("Román",autor.getApellido()),
            () -> assertEquals("Chile",autor.getPais()),
            () -> assertEquals("Santiago",autor.getDireccion()),
            () -> assertEquals("0983456256",autor.getTelefono()),
            () -> assertEquals("romantico@correo.com",autor.getCorreo())

        );

        System.out.println("Test unitarias en autor");
        System.out.println(autor.toString());

    }




}
