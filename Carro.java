package com.madu.poo.Modificadores.Private.Public;

class Carro {

	String marca;
	String modelo;
    int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
		}
				
	    double obterautonomia() {
					
			System.out.println("Método obterAltonomia foi chamado.");
					
			return this.capCombustivel * this.consumoCombustivel;
		}
			
		double calcularCombustivel(double km) {
			
			double qtdCombustivel = km/this.consumoCombustivel;
			
			return qtdCombustivel;
		}
}
