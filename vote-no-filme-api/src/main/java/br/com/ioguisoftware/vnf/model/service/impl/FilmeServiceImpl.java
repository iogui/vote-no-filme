package br.com.ioguisoftware.vnf.model.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.ioguisoftware.vnf.model.dao.FilmeDAO;
import br.com.ioguisoftware.vnf.model.entity.Filme;
import br.com.ioguisoftware.vnf.model.service.FilmeService;

@Service("filmeService")
@Transactional
public class FilmeServiceImpl implements FilmeService {
	
	@Resource(name="filmeDao")
	private FilmeDAO dao;

	@Override
	public void generateFilmes() {
		String[] filmes = {"Harry Potter",
						   "Forest Gump",
						   "A pele em que habito",
						   "O Senhor dos Anéis",
						   "Pulp Fiction"};
		
		String[] imagePath = {"/resources/images/HP1.jpg",
				   			  "/resources/images/forrest_gump.jpg",
				   			  "/resources/images/a-pele-que-habito.jpg",
				   			  "/resources/images/o-senhor-dos-aneis-1.jpg",
				   			  "/resources/images/pulp_fiction.jpg"};
		
		for (int i = 0; i < filmes.length; i++) {
			dao.save(createFilme(filmes[i], imagePath[i]));
		}
	}
	
	private Filme createFilme(String name, String imageName) {
		Filme filme = new Filme();
		filme.setNome(name);
		filme.setImagePath(imageName);
		
		return filme;
	}

	@Override
	public List<Filme> getRandomEnqueteFilmes() {
		int indice1, indice2 = 0;
		List<Filme> filmesExibir = new ArrayList<Filme>();
		List<Filme> filmes = dao.listAll();
		
		Random randomGenerator = new Random();
		indice1 = randomGenerator.nextInt(5);
		do {
			indice2 = randomGenerator.nextInt(5);
		} while(indice1 == indice2);
		
		filmesExibir.add(filmes.get(indice1));
		filmesExibir.add(filmes.get(indice2));
		
		return filmesExibir;
	}

}
