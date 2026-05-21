package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.MidiChannel;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {

		SpringApplication.run(LibreriaApplication.class, args);

		System.out.println("Hola mundo desde spring boot");

		Cliente cliente = new Cliente(
				1
				,"1726323234"
				,"Alan"
				,"Brito"
				,"Quito"
				,"0983456256"
				,"abrito@correo.com"

		);

	}




}
