package dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public Long geraCodigo() {
		
		int co = clientes.size()+1;
		String cod = String.valueOf(co);
		Long codigo = Long.parseLong(cod);
		return codigo;
	}
	
	private void initClientes() {
		
		if(clientes.size() <= 0) {
			Cliente c = new Cliente();
			c.setCodigo(geraCodigo());
			c.setNome("Paulo");
			c.setBairro("Centro");
			c.setEndereco("Rua Duque de Caxias, nº 4243");
			c.setCidade("Santa Maria");
			clientes.add(c);
		}
		
	}
	
	public boolean adicionar(Cliente cliente) {
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("Endereço: "+cliente.getEndereco());
		System.out.println("Bairro: "+cliente.getBairro());
		System.out.println("Cidade: "+cliente.getCidade());
		cliente.setCodigo(geraCodigo());
		clientes.add(cliente);
		
		return true;
	}
	
	public ArrayList<Cliente> listaClientes() {
		initClientes();
		return clientes;
	}
	
	public boolean remover(Cliente c) {
		
		clientes.remove(c);
		return true;
	}
}
