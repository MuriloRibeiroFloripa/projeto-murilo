package interfaces.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import interfaces.model.entities.CarRental;
import interfaces.model.entities.Vehicle;
import interfaces.model.services.BrazilTaxService;
import interfaces.model.services.RentalService;

/*Interface
 * Interface � um tipo que define um conjunto de opera��es que uma
 * classe deve implementar.
 * A interface estabelece um contrato que a classe deve cumprir.
 * Pra qu� interfaces?
 * � Para criar sistemas com baixo acoplamento e flex�veis.
 * TaxService.java
 * */

public class Program_loca��oCarro {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy HH:mm): ");
		Date finish = sdf.parse(sc.nextLine());

		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Enter price per hour: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();

		/*
		 * public RentalService(Double pricePerDay, Double pricePerHour, TaxService
		 * taxService) Inje��o de depend�ncia por meio do construtor o objeto de servico
		 * por meio de imposto new BrasilTaxServices() do qual a classe RentalService
		 * depende � inst�nciado em outro lugar no program principal no qual essa
		 * inst�ncia esta sendo injetada na classe RentalService por meio do construtor
		 * para n�o gerar um forte acoplamento. ********modelo de forte
		 * acomplamento************ public RentalService(Double pricePerDay, Double
		 * pricePerHour){ this.pricePerDay = pricePerDay; this.pricePerHour =
		 * pricePerHour; this.taxService = new BrasilTaxService; Se fazer desse jeito a
		 * classe RentalService estar� sendo ela mesmo respons�vel de inst�nciar a
		 * depend�ncia dela. gerando o problema de forte acoplamento se futuramente eu
		 * quiser mudar a forma de imposto terei que alterar essa chamada da
		 * inst�ncia��o al�m de gerar um forte acoplamento gera dois pontos de
		 * altera��o, por meio de upcasting.
		 */

		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());

		rentalService.processInvoice(cr);

		System.out.println("INVOICE:");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

		sc.close();
	}
}