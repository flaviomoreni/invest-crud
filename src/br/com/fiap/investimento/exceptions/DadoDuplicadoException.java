package br.com.fiap.investimento.exceptions;

@SuppressWarnings("serial")
public class DadoDuplicadoException extends Exception {

	public DadoDuplicadoException() {
	}

	public DadoDuplicadoException(String message) {
		super(message);
	}

	public DadoDuplicadoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DadoDuplicadoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DadoDuplicadoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
