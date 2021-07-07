package br.com.fiap.investimento.test;

import javax.swing.JOptionPane;

import br.com.fiap.investimento.business.InvestidorBusiness;
import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorTelaCadastroTest {

	public static void main(String[] args) {
		try {
			
			// Dados digitados pelo usu�rio
			String cpf = "999.999.999-99";
			String nome = "Alvaro Morata";

			// Instanciar o objeto de entidade
			InvestidorPF invPF = new InvestidorPF();
			invPF.setCpf(cpf);
			invPF.setNomeInvestidor(nome);

			// Executar o m�todo do business para efetuar o Cadastro
			InvestidorBusiness business = new InvestidorBusiness();
			business.cadastrarInvestidor(invPF);

			// Exibir mensagem para o usu�rio
			JOptionPane.showMessageDialog(null, "Investidor cadastrado com sucesso!");
			
		} catch (DadoNaoAlteradoException e) {

			JOptionPane.showMessageDialog(null, "N�o foi poss�vel efetuar a altera��o, por favor verifique os dados digitados!");
			
		}

	}

}
