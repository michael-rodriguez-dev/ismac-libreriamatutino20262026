package com.distribuida.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CategoriaTest {

    private Categoria categoria;

    public void setup(){
        categoria = new Categoria(
                1
                ,"Drama"
                ,"Esencia y suspenso"

        );

    }

    @Test
    public void testCategoriaConstructorandsGetters(){

        assertAll("Pruebas unitarias constructor Categoria",
                () -> assertEquals(1,categoria.getIdCategoria()),
                () -> assertEquals("Drama",categoria.getCategoria()),
                () -> assertEquals("Esencia y suspenso",categoria.getDescripcion())
        );

        System.out.println("Test unitarias en categoria");
        System.out.println(categoria.toString());

    }

}
