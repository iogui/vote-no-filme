package br.com.ioguisoftware.vnf.web.dto;

public class FilmeDTO {
	private Long id;
	private String nome;
	private String imagePath;
	
	public FilmeDTO() {
	}
	
	public FilmeDTO(Long key, String value, String imagePath) {
		this.id = key;
		this.nome = value;
		this.imagePath = imagePath;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
}
