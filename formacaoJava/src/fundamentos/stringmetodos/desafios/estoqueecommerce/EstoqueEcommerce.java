package fundamentos.stringmetodos.desafios.estoqueecommerce;

public class EstoqueEcommerce {

	public static void main(String[] args) {
		// Formato: NomeDoProduto-Quantidade-PrecoUnitario|NomeDoProduto-Quantidade...
		String estoque = "Cadeira Gamer-2-850.00|Mesa de Escritorio-1-1200.50|Teclado Mecanico-3-250.00|Mouse sem fio-5-120.00";

		 // Separa cada produto utilizando o caractere '|'
		String[] linhas = estoque.split("\\|");
		
		double valorTotal = 0;
		double valorMaior = 0;
		String produtoValioso = "x";
		System.out.println("--- ESTOQUE E-COMMERCE DO BETINHO ---");
		// Percorre todos os produtos do estoque
		for (int i = 0; i < linhas.length; i++) {
			// Separa nome, quantidade e preço unitário
			String[] dadosProduto = linhas[i].split("-");
			String nome = dadosProduto[0];
			int quantidade = Integer.parseInt(dadosProduto[1]);
			double valor = Double.parseDouble(dadosProduto[2]);
			// Acumula o valor total do estoque
			valorTotal += valor * quantidade;
			//variavel para comparar valor total de um determinado produto
			double valorCompara = valor * quantidade;
			System.out.printf("Produto: %s | Quantidade: %d | Valor: R$ %.2f\n", nome, quantidade, valor);
			// verifica se o valor total do produto atual é maior que o anterior, caso sim ele é o produto de maior valor
			if (valorCompara> valorMaior) {
				valorMaior = valorCompara;
				produtoValioso = nome;
			}

		}
		// Exibe o valor total investido em estoque
		System.out.printf("Valor parado em estoque: R$ %.2f\n", valorTotal);
		System.out.printf("Produto de maior valor: %s | Valor: R$ %.2f\n ", produtoValioso, valorMaior);
		System.out.println("-----------------FIM ----------------");

	}

}
