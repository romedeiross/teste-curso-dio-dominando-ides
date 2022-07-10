package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		g1.setCor("preto");
		g1.setIdade(2);
		g1.setNome("Pedro");
		System.out.println(g1);

	}

}
