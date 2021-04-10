package endPoint;

import javax.xml.ws.Endpoint;

import servico.ClienteServicoImpl;

public class Iniciar {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9095/ContatosClienteSOAP/ClienteServico", 
				new ClienteServicoImpl());
		
		System.out.println("=======Seviço Cliente Iniciado========");
	}

}
