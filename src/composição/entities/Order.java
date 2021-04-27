package composição.entities;

import java.util.Date;

import composição.entities.enums.OrderStatus;

public class Order {// classe pedido
	private Integer id; // id do pedido
	private Date moment; // instante que o pedido foi feito
	private OrderStatus status; // status do pedido

	public Order() {// construtor vazio{

	}

	public Order(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}

}
