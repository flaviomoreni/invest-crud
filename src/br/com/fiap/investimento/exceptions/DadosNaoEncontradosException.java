package br.com.fiap.investimento.exceptions;

@SuppressWarnings("serial")
public class DadosNaoEncontradosException extends Exception {

	public DadosNaoEncontradosException() {
	}

	public DadosNaoEncontradosException(String message) {
		super(message);
	}

	public DadosNaoEncontradosException(Throwable cause) {
		super(cause);
	}

	public DadosNaoEncontradosException(String message, Throwable cause) {
		super(message, cause);
	}

	public DadosNaoEncontradosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
