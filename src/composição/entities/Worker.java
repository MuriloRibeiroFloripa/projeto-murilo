package composi��o.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import composi��o.entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department departement;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
		// construtor vazio;
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department departement) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departement = departement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartement() {
		return departement;
	}

	public void setDepartement(Department departement) {
		this.departement = departement;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// apagando porque de maneira nenhuma essa lista pode ser trocada por outra
	// lista.
	// public void setContracts(List<HourContract> contracts) {
	// this.contracts = contracts;
	// }

	// implementando os argumentos
	// que ir�o fazer ou desfazer a associa��o do contrato
	// adicionando ou removendo o contrato.
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
