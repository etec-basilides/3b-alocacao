package br.gov.sp.etec.alocacao.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.gov.sp.etec.alocacao.entity.Cliente;
import br.gov.sp.etec.alocacao.repository.ClienteRepository;


@ExtendWith(SpringExtension.class)
public class ClienteControllerTest {

	

		@InjectMocks
		ClienteController controller;
		
		@Mock
		ClienteRepository repository;
		
		@Test
		public void clientesTest() {
			when(repository.findAll()).thenReturn(getListCliente());
			List<Cliente> clientes = controller.cliente();
			assertNotNull(clientes);
			assertEquals("XPTO", clientes.get(0).getNome());
		}
		
		
		private ArrayList<Cliente> getListCliente(){
			Cliente cliente = new Cliente();
			cliente.setNome("XPTO");
			cliente.setEmail("email");
			cliente.setId(1L);
			cliente.setTel("123");
			cliente.setCpf("123");
			
			ArrayList<Cliente> lista = new ArrayList<Cliente>();
			lista.add(cliente);
			return lista;
		}
	}

