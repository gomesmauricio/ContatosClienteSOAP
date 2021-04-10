package servico;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import entidade.Cliente;
import entidade.RetornoCadastroCliente;

@WebService
@SOAPBinding (style = Style.RPC)
public interface ClienteServico {
	
	@WebMethod
	public RetornoCadastroCliente inserir(Cliente cliente);
	
	@WebMethod
	public RetornoCadastroCliente remover(String cpf);
	
	@WebMethod
	public RetornoCadastroCliente alterar(Cliente cliente);
	
	@WebMethod
	public RetornoCadastroCliente pesquisar(String cpf);
	
	@WebMethod
	public RetornoCadastroCliente listarTodos();

}
