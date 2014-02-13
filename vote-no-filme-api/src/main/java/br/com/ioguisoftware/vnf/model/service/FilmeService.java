package br.com.ioguisoftware.vnf.model.service;

import java.util.List;

import br.com.ioguisoftware.vnf.model.entity.Filme;

public interface FilmeService {
	void generateFilmes();
	List<Filme> getRandomEnqueteFilmes();
}
