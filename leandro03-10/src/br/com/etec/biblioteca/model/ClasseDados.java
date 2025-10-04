package br.com.etec.biblioteca.model;

public class ClasseDados {
	
	String tituloAt;
	String autorAt;
	int paginasAt;
	
	public ClasseDados(String title,
			String author, int pages) {
		this.tituloAt = title;
		this.autorAt = author;
		this.paginasAt = pages;
	}
	
	public String getTitulo() {
		return tituloAt;
	}

}
