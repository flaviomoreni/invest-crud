package br.com.fiap.investimento.exceptions;

@SuppressWarnings("serial")
public class DadoNaoRemovidoException extends Exception {

	public DadoNaoRemovidoException() {
	}

	public DadoNaoRemovidoException(String message) {
		super(message);
	}

	public DadoNaoRemovidoException(Throwable cause) {
		super(cause);
	}

	public DadoNaoRemovidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DadoNaoRemovidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
