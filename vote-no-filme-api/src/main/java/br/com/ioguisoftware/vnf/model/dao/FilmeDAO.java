package br.com.ioguisoftware.vnf.model.dao;

import java.util.List;

import br.com.ioguisoftware.vnf.model.entity.Filme;

public interface FilmeDAO {
	Filme get(Long id);
	Filme save(Filme filme);
	List<Filme> listAll();
}
