package interfaces.model.services;

/*
 * Invers�o de controle � Invers�o de controle Padr�o de desenvolvimento que
 * consiste em retirar da classe a responsabilidade de instanciar suas
 * depend�ncias. � Inje��o de depend�ncia � uma forma de realizar a invers�o de
 * controle: um componente externo instancia a depend�ncia, que � ent�o injetada
 * no objeto "pai". Pode ser implementada de v�rias formas: � Construtor �
 * Classe de instancia��o (builder / factory) � Container / framework
 */

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;

	private TaxService taxService;

	/*
	 * Servi�o RentalService depende do servi�o TaxService e inje��o expecifica do
	 * BrasilTaxService na classe Program invers�o de controle e inje��o de
	 * depend�ncia injetada por meio do construtor.
	 */
	public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;

		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		} else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}

		double tax = taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

}
