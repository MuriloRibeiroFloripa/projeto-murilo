package composição.entities;

import java.util.Date;

//Classe contrato por hora
public class HourContract {
	private Date date;
	private Double valuesPerHour;
	private Integer hours;

	public HourContract() {
	}

	public HourContract(Date date, Double valuesPerHour, Integer hours) {

		this.date = date;
		this.valuesPerHour = valuesPerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuesPerHour() {
		return valuesPerHour;
	}

	public void setValuesPerHour(Double valuesPerHour) {
		this.valuesPerHour = valuesPerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	// operação valor total do contrato, por delegação.
	public double totalValue() {
		return valuesPerHour * hours;
	}
}
