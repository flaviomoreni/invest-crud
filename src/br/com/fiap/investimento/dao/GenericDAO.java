package br.com.fiap.investimento.dao;

import java.util.List;

import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.exceptions.DadoNaoRemovidoException;
import br.com.fiap.investimento.exceptions.DataBaseException;

public interface GenericDAO<E extends Object, I> {

	public I cadastrar(E entidade) throws DataBaseException ;
	
	public void excluir(I chave) throws DataBaseException, DadoNaoRemovidoException;
	
	public void alterar(E entidade) throws DataBaseException, DadoNaoAlteradoException;
	
	public E consultarPorId(I chave) throws DataBaseException;
	
	public List<E> buscarTodos() throws DataBaseException;
	
}
