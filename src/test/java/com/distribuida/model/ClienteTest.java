package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setup(){
        cliente = new Cliente(
                1
                ,"1827348273"
                ,"Bob"
                ,"Esponja"
                ,"En el mar"
                ,"09982345623"
                ,"besponja@correo.com"
        );

    }

    @Test
    public void testClienteConstructorAndGetters(){

        assertAll("Pruebas unitarias constructor  Cliente",
            () -> assertEquals(1,cliente.getIdCliente()),
            () -> assertEquals("1827348273",cliente.getCedula()),
            () -> assertEquals("Bob",cliente.getNombre()),
            () -> assertEquals("Esponja",cliente.getApellido()),
            () -> assertEquals("En el mar",cliente.getDireccion()),
            () -> assertEquals("09982345623",cliente.getTelefono()),
            () -> assertEquals("besponja@correo.com",cliente.getCorreo())
        );

        System.out.println("Test unitarias enb cliente");
        System.out.println(cliente.toString());

    }

    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1728374569");
        cliente.setNombre("Bobi");
        cliente.setApellido("Craft");
        cliente.setDireccion("México");
        cliente.setTelefono("0982458723");
        cliente.setCorreo("bobi@correo.com");

        assertAll("Pruebas unitarias constructor  Cliente",
                () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("1728374569",cliente.getCedula()),
                () -> assertEquals("Bobi",cliente.getNombre()),
                () -> assertEquals("Craft",cliente.getApellido()),
                () -> assertEquals("México",cliente.getDireccion()),
                () -> assertEquals("0982458723",cliente.getTelefono()),
                () -> assertEquals("bobi@correo.com",cliente.getCorreo())
        );

    }
}
