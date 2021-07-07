package br.com.fiap.investimento.test;

import javax.swing.JOptionPane;

import br.com.fiap.investimento.business.InvestidorBusiness;
import br.com.fiap.investimento.exceptions.DadoNaoAlteradoException;
import br.com.fiap.investimento.model.InvestidorPF;

public class InvestidorTelaCadastroTest {

	public static void main(String[] args) {
		try {
			
			// Dados digitados pelo usuário
			String cpf = "999.999.999-99";
			String nome = "Alvaro Morata";

			// Instanciar o objeto de entidade
			InvestidorPF invPF = new InvestidorPF();
			invPF.setCpf(cpf);
			invPF.setNomeInvestidor(nome);

			// Executar o método do business para efetuar o Cadastro
			InvestidorBusiness business = new InvestidorBusiness();
			business.cadastrarInvestidor(invPF);

			// Exibir mensagem para o usuário
			JOptionPane.showMessageDialog(null, "Investidor cadastrado com sucesso!");
			
		} catch (DadoNaoAlteradoException e) {

			JOptionPane.showMessageDialog(null, "Não foi possível efetuar a alteração, por favor verifique os dados digitados!");
			
		}

	}

}
