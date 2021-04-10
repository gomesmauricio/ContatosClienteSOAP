package entidade;

import java.util.List;

public class RetornoCadastroCliente {
	
	private int codigoRetorno;
	private String msgRetorno;
	private Cliente retornoCliente;
	
	
	private List<Cliente> retornoListaCliente;
	public int getCodigoRetorno() {
		return codigoRetorno;
	}
	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public String getMsgRetorno() {
		return msgRetorno;
	}
	public void setMsgRetorno(String msgRetorno) {
		this.msgRetorno = msgRetorno;
	}
	public Cliente getRetornoCliente() {
		return retornoCliente;
	}
	public void setRetornoCliente(Cliente retornoCliente) {
		this.retornoCliente = retornoCliente;
	}
	public List<Cliente> getRetornoListaCliente() {
		return retornoListaCliente;
	}
	public void setRetornoListaCliente(List<Cliente> retornoListaCliente) {
		this.retornoListaCliente = retornoListaCliente;
	}
	
	

}
