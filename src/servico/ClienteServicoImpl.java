package servico;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import entidade.Cliente;
import entidade.Contato;
import entidade.RetornoCadastroCliente;


@WebService(endpointInterface = "servico.ClienteServico")
public class ClienteServicoImpl implements ClienteServico {
	
private List<Cliente> lista;
private List<Contato> contatList;
	
	public ClienteServicoImpl() {
		this.lista = new ArrayList<Cliente>();
	}
	
	@Override
	public RetornoCadastroCliente inserir(Cliente cliente) {
		
		Boolean achou = false;
		for (Cliente c : lista) {
			if (c.equals(cliente)) {
				achou = true;
			}
		}

		RetornoCadastroCliente retorno = new RetornoCadastroCliente();
		if (!achou) {
			lista.add(cliente);
			retorno.setCodigoRetorno(0);
			retorno.setMsgRetorno("OK");
			retorno.setRetornoCliente(cliente);
		} else {
			retorno.setCodigoRetorno(1);
			retorno.setMsgRetorno("Cliente já Possui Cadastro");
		}
		return retorno;
	}
	
	@Override
	public RetornoCadastroCliente remover(String cpf) {
		Cliente achou = null;

		for (Cliente c : lista) {
			if (c.getCpf().equals(cpf)) {
				achou = c;
			}
		}
		
		RetornoCadastroCliente retorno = new RetornoCadastroCliente();
		if (achou != null) {
			lista.remove(achou);
			retorno.setCodigoRetorno(0);
			retorno.setMsgRetorno("OK");
		} else {
			retorno.setCodigoRetorno(1);
			retorno.setMsgRetorno("Cliente não Localizado!");
		}

		return retorno;
	}
	
	@Override
	public RetornoCadastroCliente alterar(Cliente cliente) {
		RetornoCadastroCliente retorno = new RetornoCadastroCliente();
		for (Cliente c : lista) {
			if (c.equals(cliente)) {
				c.setNome(cliente.getNome());
				c.setIdade(cliente.getIdade());
				c.setSexo(cliente.getSexo());
				
				retorno.setCodigoRetorno(0);
				retorno.setMsgRetorno("OK");
				retorno.setRetornoCliente(c);
			}
		}
		
		if (retorno.getRetornoCliente() == null) {
			retorno.setCodigoRetorno(1);
			retorno.setMsgRetorno("Cliente não encontrado!");
		}
		
		return retorno;
	}
	
	@Override
	public RetornoCadastroCliente pesquisar(String cpf) {
		Cliente achou = null;
		for (Cliente c : lista) {
			if (c.getCpf().equals(cpf)) {
				achou = c;
			}
		}
		
		RetornoCadastroCliente retorno = new RetornoCadastroCliente();
		
		retorno.setRetornoCliente(achou);
		retorno.setCodigoRetorno(0);

		if (achou != null) {
			retorno.setMsgRetorno("OK");
		} else {
			retorno.setMsgRetorno("Pessoa não encontrada!");
		}
		return retorno;
		
	}
	
	@Override
	public RetornoCadastroCliente listarTodos() {
		RetornoCadastroCliente retorno = new RetornoCadastroCliente();
		retorno.setCodigoRetorno(0);
		retorno.setMsgRetorno("OK");
		retorno.setRetornoListaCliente(lista);
		return retorno;
	}


}
