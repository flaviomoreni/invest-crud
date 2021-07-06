package br.com.fiap.investimento.exceptions;

@SuppressWarnings("serial")
public class DadoNaoAlteradoException extends Exception {

	public DadoNaoAlteradoException() {
	}

	public DadoNaoAlteradoException(String message) {
		super(message);
	}

	public DadoNaoAlteradoException(Throwable cause) {
		super(cause);
	}

	public DadoNaoAlteradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DadoNaoAlteradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
