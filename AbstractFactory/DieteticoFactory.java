package com.ioet.training.abstractfactory;

// La implementacion de la Hueca Restaurant es una fabrica de un plato dietetico

public class DieteticoFactory implements HuecaFactory{
	
	public String AgregarArroz(){
		// UnaTazaDeArroz
		// LavoArrozIntegral
		// AgregoAgua
		// .....

		return "Arroz Dietetico";
	}

	public String AgregarCarne() {
		// CarneLomo
  		// SartenConAceiteOliva
		// TaparAlVapor10Minutos
	}
	
}
