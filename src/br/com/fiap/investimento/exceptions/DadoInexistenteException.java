package br.com.fiap.investimento.exceptions;

@SuppressWarnings("serial")
public class DadoInexistenteException extends Exception {

	public DadoInexistenteException() {
	}

	public DadoInexistenteException(String message) {
		super(message);
	}

	public DadoInexistenteException(Throwable cause) {
		super(cause);
	}

	public DadoInexistenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public DadoInexistenteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
