package br.com.ioguisoftware.vnf.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ioguisoftware.vnf.model.entity.Filme;
import br.com.ioguisoftware.vnf.model.service.FilmeService;
import br.com.ioguisoftware.vnf.web.dto.FilmeDTO;

@Controller
@RequestMapping("/filme")
public class FilmesController {
	
	@Resource(name="filmeService")
	private FilmeService filmeService;
	
	@RequestMapping(value="enquete.go", method=RequestMethod.GET)
	public String goEnquete(ModelMap modelMap) {
		List<Filme> filmes = filmeService.getRandomEnqueteFilmes();
		
		FilmeDTO filme1 = new FilmeDTO(filmes.get(0).getId(), 
											 filmes.get(0).getNome(),
											 filmes.get(0).getImagePath());
		
		FilmeDTO filme2 = new FilmeDTO(filmes.get(1).getId(), 
											 filmes.get(1).getNome(),
											 filmes.get(1).getImagePath());
		
		modelMap.addAttribute("filme1", filme1);
		modelMap.addAttribute("filme2", filme2);
		
		return "includes/enquete";
	}
}
