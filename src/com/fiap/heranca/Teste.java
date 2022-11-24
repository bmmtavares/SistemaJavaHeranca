package com.fiap.heranca;

public class Teste {

	public static void main(String args[]) {
		
		Animal animal = new Animal();
		animal.setAlimenta("todo animal se alimenta");
		animal.setLocomove("todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("cachorro come racao de cachorro");
		cachorro.setLocomove("cachorro usa 4 patas");
		cachorro.setLatido("cachorro faz au-au");
		
		Animal poodle = new Cachorro();
		poodle.setAlimenta("poodle come racao de cao");
		poodle.setLocomove("poodle usa 4 patas");
	}
	
}
