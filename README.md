# Orienta-o-a-Objetos-Modificadores-private-e-public-no-java
Anotações de Orientação a Objetos: Modificadores private e public

                                                          Orientação a Objetos: Modificadores private e public

public

.Todo mundo pode ver

No Java existem alguna modificadores de acesso, nós temos o midificador de acesso protected que seria o protegido que iramps aprender quando soubermos
herança existe o ter font o padrão que é um modificador de acesso que utilizamos, quando você não coloca nada na frente dele e e exixte o public que quando
a gente coloca o public na frente de um método ou de uma classe ou de um atributo significa que todo mundo pode ver qualquer classe que esteja dentro daquele
projeto.

private

.Somente a própria classe pode ver

E temos também o privado que é somente a própria classe pode ver aquele atributo ou aquele método.
Se não colocarmos o puiblic no código então a classe não vai ficar publica.

Ex:

package com.madu.poo.Modificadores.Private.Public;

public class Carro {

	public String marca;
	String modelo;
    int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
		}
				
	    double obterautonomia() {
					
			System.out.println("Método obterAltonomia foi chamado.");
					
			return this.capCombustivel * this.consumoCombustivel;
		}
	    
	    private double divideKMPorConsumoCombustivel(double km) {
	    	return km/this.consumoCombustivel;
	    }
			
		public double calcularCombustivel(double km) {
			
			return this.divideKMPorConsumoCombustivel(km);
		}
}


Ex:

package com.madu.poo.Modificadores.Private.Public;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "Fiat";

	}

}


Ex:

package com.madu.poo.Alt;

import com.madu.poo.Modificadores.Private.Public.Carro;

public class TesteCarroAlt {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "Fiat";

	}

}
