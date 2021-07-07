package br.com.fiap.investimento.test;

import javax.swing.JOptionPane;

import br.com.fiap.investimento.business.InvestidorBusiness;
import br.com.fiap.investimento.exceptions.DadoInexistenteException;
import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorTelaAlteracaoTest {

	public static void main(String[] args) {
		try {
			// Dados digitados pelo usu�rio
			int id = 1;
			String cpf = "999.999.999-99";
			String nome = "Alvaro Morata";

			// Instanciar o objeto
			InvestidorPF invPF = new InvestidorPF();
			invPF.setInvestidorId(id);
			invPF.setCpf(cpf);
			invPF.setNomeInvestidor(nome);

			// Executar o m�todo do business para efeuar o Alteracao
			InvestidorBusiness business = new InvestidorBusiness();
			business.alterarInvestidor(invPF);

			// Exibir mensagem para o usu�rio
			//JOptionPane.showMessageDialog(null, "Investidor alterado com sucesso com sucesso!");
			System.out.println("Investidor alterado com sucesso com sucesso!");
			
		} catch (DadoNaoAlteradoException e) {
			
			//JOptionPane.showMessageDialog(null, "Ocorreu um erro na altera��o dos dados!");
			System.out.println("Ocorreu um erro na altera��o dos dados!");
			
		} catch (DadoInexistenteException e) {
			
			//JOptionPane.showMessageDialog(null, "Os dados informados n�o existem no banco de dados");
			System.out.println("Os dados informados n�o existem no banco de dados");
			
		}

	}

}
