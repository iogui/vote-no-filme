package br.com.ioguisoftware.vnf.model.service.impl;

import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.ioguisoftware.vnf.model.dao.FilmeDAO;
import br.com.ioguisoftware.vnf.model.entity.Filme;
import br.com.ioguisoftware.vnf.model.service.FilmeService;


import static org.testng.Assert.*;
import static org.mockito.Mockito.*;

public class FilmeServiceImplTest {
	
	@InjectMocks
	private FilmeService filmeService = new FilmeServiceImpl();
	
	@Mock
	private FilmeDAO filmeDao;
	
	@BeforeMethod(alwaysRun=true)
	public void injectDao() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void generateFilmes() {
		when(filmeDao.save(any(Filme.class))).thenReturn(any(Filme.class));
		
		filmeService.generateFilmes();
		
		verify(filmeDao, times(5)).save(any(Filme.class));
	}
	
	@Test
	public void getRandomEnqueteFilmes() {
		@SuppressWarnings("unchecked")
		List<Filme> listaFilmes = mock(List.class);
		
		when(listaFilmes.get(anyInt())).thenReturn(mock(Filme.class));
		when(filmeDao.listAll()).thenReturn(listaFilmes);
		
		List<Filme> filmes = filmeService.getRandomEnqueteFilmes();
		
		assertNotNull(filmes, "Lista de filmes retornou vazia");
		assertEquals(filmes.size(), 2, "Lista não retornou com 2 filmes");
	}
}
