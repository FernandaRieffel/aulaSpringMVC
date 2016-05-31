package dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {

	private ArrayList<Cliente> clientes;
	
	private void initClientes() {
		clientes = new ArrayList<Cliente>();
		Cliente c = new Cliente();
		c.setNome("Paulo");
		c.setBairro("Centro");
		c.setEndereco("Rua Duque de Caxias, nº 4243");
		c.setCidade("Santa Maria");
		clientes.add(c);
	}
	
	public boolean adicionar(Cliente cliente) {
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("Endereço: "+cliente.getEndereco());
		System.out.println("Bairro: "+cliente.getBairro());
		System.out.println("Cidade: "+cliente.getCidade());
		
		clientes.add(cliente);
		
		return true;
	}
	
	public ArrayList<Cliente> listaClientes() {
		initClientes();
		return clientes;
	}
}
