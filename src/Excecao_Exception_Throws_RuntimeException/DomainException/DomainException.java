package Excecao_Exception_Throws_RuntimeException.DomainException;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}