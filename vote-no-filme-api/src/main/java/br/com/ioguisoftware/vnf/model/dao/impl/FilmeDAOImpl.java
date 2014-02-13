package br.com.ioguisoftware.vnf.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.ioguisoftware.vnf.model.dao.FilmeDAO;
import br.com.ioguisoftware.vnf.model.entity.Filme;

@Repository("filmeDao")
public class FilmeDAOImpl implements FilmeDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Filme get(Long id) {
		return em.find(Filme.class, id);
	}

	@Override
	public Filme save(Filme filme) {
		if (filme.getId() == null || filme.getId().equals(Long.valueOf(0))) {
			em.persist(filme);
		} else {
			filme = em.merge(filme);
		}
		
		return filme;
	}

	@Override
	public List<Filme> listAll() {
		TypedQuery<Filme> query = em.createNamedQuery(Filme.QUERY_LIST_ALL, Filme.class);
		
		return query.getResultList();
	}

}
