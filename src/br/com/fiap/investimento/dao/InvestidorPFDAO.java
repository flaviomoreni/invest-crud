package br.com.fiap.investimento.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.exceptions.DadoNaoRemovidoException;
import br.com.fiap.investimento.exceptions.DataBaseException;
import br.com.fiap.investimento.model.InvestidorPF;
import br.com.fiap.investimento.tools.DBTools;

public class InvestidorPFDAO implements GenericDAO<InvestidorPF, Integer> {

	@Override
	public Integer cadastrar(InvestidorPF entidade) throws DataBaseException {
		DBTools.obterConexao();
		System.out.println("Inserindo " + entidade);
		return 1;
	}

	
	@Override
	public void excluir(Integer chave) throws DataBaseException, DadoNaoRemovidoException {
		DBTools.obterConexao();
		if ( chave.equals(1) ) {
			System.out.println("Removendo " + chave);
		} else {
			throw new DadoNaoRemovidoException();
		}
	}

	@Override
	public void alterar(InvestidorPF entidade) throws DataBaseException, DadoNaoAlteradoException {
		DBTools.obterConexao();
		if ( entidade.getInvestidorId() == 1 ) {
			System.out.println("Alterando " + entidade);
		} else {
			throw new DadoNaoAlteradoException();
		}
	}

	@Override
	public InvestidorPF consultarPorId(Integer chave) throws DataBaseException {
		DBTools.obterConexao();
		if ( chave.equals(1) ) {
			return new InvestidorPF(1, "111.111.111-11", "Antonio Coutinho");
		} else {		
			return null;
		}
	}

	@Override
	public List<InvestidorPF> buscarTodos() throws DataBaseException {
		DBTools.obterConexao();
		
		List<InvestidorPF> lista = new ArrayList<InvestidorPF>();
		lista.add(new InvestidorPF(1,"111.111.111-11", "Cristiano Romário"));
		lista.add(new InvestidorPF(2,"222.222.222-22", "Lionel Ronaldo"));
		lista.add(new InvestidorPF(3,"333.333.333-33", "Kylian Lewandowski"));
		lista.add(new InvestidorPF(4,"444.444.444-44", "Sadio Salah"));
		lista.add(new InvestidorPF(5,"555.555.555-55", "Mohamed Mané"));
		
		return lista;
	}

	
	
}
