package com.ioet.training.abstractfactory;

// La implementacion de la Hueca Restaurant es una fabrica de un plato dietetico

public class ConYapaFactory implements HuecaFactory{

        public String AgregarArroz(){
                // DosTasasDeArroz
		// LavoArrozNormal
		// AgregoAguaYAceite
		//  .....        
		// MantecaDeCerdo

                return "Arroz con Yapa";
        }

        public String AgregarCarne() {
                //   CarneConGrasas
  		// SartenConMantequilla
		//   .....      
		//  Freir10Minutos
		return "Carne Frita";
        }

}
