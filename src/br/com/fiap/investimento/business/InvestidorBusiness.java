package br.com.fiap.investimento.business;

import br.com.fiap.investimento.dao.InvestidorPFDAO;
import br.com.fiap.investimento.exceptions.DadoInexistenteException;
import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.exceptions.DataBaseException;
import br.com.fiap.investimento.model.InvestidorPF;
import br.com.fiap.investimento.tools.LogTools;

public class InvestidorBusiness {

	
	public void cadastrarInvestidor(InvestidorPF investidor) throws DadoNaoAlteradoException {
		try {
			InvestidorPFDAO dao = new InvestidorPFDAO();
			dao.cadastrar(investidor);
		} catch (DataBaseException e) {
			LogTools.log(e.getMessage()); //Coletando
			throw new DadoNaoAlteradoException();
		}
	}
	
	public void alterarInvestidor(InvestidorPF investidor) 
			throws DadoInexistenteException, 
				   DadoNaoAlteradoException {

		try {
			InvestidorPFDAO dao = new InvestidorPFDAO();
			if ( dao.consultarPorId(investidor.getInvestidorId()) != null ) {
				dao.alterar(investidor);
			} else {
				throw new DadoInexistenteException();
			}
		} catch (DataBaseException e) {
			LogTools.log(e.getMessage());
			throw new DadoNaoAlteradoException();
		}
		
	}
	
	
}
