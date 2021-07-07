package br.com.fiap.investimento.tools;

import br.com.fiap.investimento.exceptions.DataBaseException;

public class DBTools {

	
	public static void obterConexao() throws DataBaseException {
		
		if ( Math.random() < 0.5 ) {
			throw new DataBaseException("Erro ao acessar o banco de dados");
		} else {
			System.out.println("Conexão com o banco obtida com sucesso");
		}
		
	}
	
	
}
