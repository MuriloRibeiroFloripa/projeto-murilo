package interfaces.model.services;

/*
 * Inversão de controle • Inversão de controle Padrão de desenvolvimento que
 * consiste em retirar da classe a responsabilidade de instanciar suas
 * dependências. • Injeção de dependência É uma forma de realizar a inversão de
 * controle: um componente externo instancia a dependência, que é então injetada
 * no objeto "pai". Pode ser implementada de várias formas: • Construtor •
 * Classe de instanciação (builder / factory) • Container / framework
 */

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;

	private TaxService taxService;

	/*
	 * Serviço RentalService depende do serviço TaxService e injeção expecifica do
	 * BrasilTaxService na classe Program inversão de controle e injeção de
	 * dependência injetada por meio do construtor.
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
