package fundamentos.stringmetodos;

public class StringSplit {

	public static void main(String[] args) {
		
		String dados = "PIX;50.00;Netflix\nDEBITO;120.50;Supermercado\nPIX;20.00;Farmacia";
		
		String [] linhas = dados.split("\n");
		
		System.out.println("--- RELATÓRIO DE GASTOS ---");
		
		for (String linha : linhas) {
			//3. quebra a linha em partes (tipo, valor, local)
			String [] partes = linha.split(";");
			
			String tipo = partes[0];
			String valor = partes [1];
			String local = partes [2];
					
			System.out.println("Tipo: " + tipo + " | Local: " + local + " | Valor: R$: " + valor);
		}

	}

}
