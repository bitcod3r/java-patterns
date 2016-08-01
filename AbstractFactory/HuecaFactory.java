package com.ioet.training.abstractfactory;

// Un ejemplo para un Restaurant que prepara platos tipicos

public interface HuecaFactory{
	
	public Arroz AgregarArroz();
	public Aguacate AgregarAguacate();
	public Huevo AgregarHuevo();
	public Carne AgregarCarne();
	public Papas AgregarPapas();
}
