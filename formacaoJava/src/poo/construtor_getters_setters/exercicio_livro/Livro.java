package poo.construtor_getters_setters.exercicio_livro;

public class Livro {

	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;

	public Livro(String titulo, String autor, int totalPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginaAtual = 0;
		if (totalPaginas <= 0) {
			this.totalPaginas = 1;
			System.out.println(
					"Valor do total de páginas definido automaticamente para 1, 0 não é válido para a operação!");
		}else {
			this.totalPaginas = totalPaginas;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(int totalPaginas) {
		if(totalPaginas >= paginaAtual) {
			this.totalPaginas = totalPaginas;
		}
	 else {
		 System.out.println("============================================");
		 System.out.println("Operação inválida, Total de paginas é menor que a quantidade de paginas atual!");
	}
	}
	public int getPaginaAtual() {
		return paginaAtual;
	}
	
	public void irParaPagina(int pagina) {
		if(pagina <= totalPaginas && pagina >= 0) {
		this.paginaAtual = pagina;
		}else {
			System.out.println("====================================================");
			System.out.println("ERRO: Número de página inválida, tentar novamente");
			System.out.println("o intervalo de páginas é de 0 á " +this.getTotalPaginas());
			System.out.println("====================================================");
		}
	}

	public void avancarPagina(int quantidade) {
		if ((quantidade + paginaAtual) <= totalPaginas) {
			this.paginaAtual += quantidade;
		} else {
			paginaAtual= totalPaginas;
			System.out.println("==============================");
			System.out.println("Quantida de páginas digitadas inválida, Livro chegou ao fim!");
		}
	}

	public void voltarPagina(int quantidade) {
		if (paginaAtual - quantidade >=0 ) {
			paginaAtual -= quantidade;
		} else {
			paginaAtual = 0;
		}
	}

	public double getProgresso() {
		return ((double) this.paginaAtual / this.totalPaginas) * 100;
	}

	public void exibirFicha() {
		System.out.println("============================================");
		System.out.println("Titulo do livro: " + this.getTitulo());
		System.out.println("Autor do livro: " + this.getAutor());
		System.out.println("Página atual: " + this.getPaginaAtual());
		System.out.println("Total de páginas: " + this.getTotalPaginas());
		System.out.println("Progresso: " + this.getProgresso());
		if (paginaAtual == totalPaginas) {
			System.out.println("Livro chegou ao fim!");
		}
	}

}
