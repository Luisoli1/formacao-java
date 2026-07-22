package poo.construtor_getters_setters.exercicio_livro;

public class TesteLivro {

	public static void main(String[] args) {
		   // Construtor normal
        Livro l1 = new Livro("Clean Code", "Robert C. Martin", 400);
        l1.exibirFicha(); // página 0, progresso 0.0%
 
        l1.avancarPagina(150);
        l1.exibirFicha(); // página 150, progresso 37.5%
 
        // Tentando avançar além do total (400)
        l1.avancarPagina(1000);
        l1.exibirFicha(); // deve travar em 400, progresso 100.0%, com aviso de fim de livro
 
        l1.voltarPagina(50);
        l1.exibirFicha(); // página 350
 
        // Tentando voltar além do início
        l1.voltarPagina(9999);
        l1.exibirFicha(); // deve travar em 0, sem ficar negativo
 
        // totalPaginas inválido no construtor (deve corrigir para 1 e avisar)
        Livro l2 = new Livro("Rascunho", "Anônimo", -20);
        l2.exibirFicha();
 
        // Tentando diminuir o total abaixo da página atual
        l1.avancarPagina(200); // página 200
        l1.setTotalPaginas(100); // deve ser recusado (100 < 200) e avisar
        l1.exibirFicha(); // total continua 400
 
        l1.setTotalPaginas(300); // deve ser aceito (300 >= 200)
        l1.exibirFicha(); // total agora é 300
    }
}