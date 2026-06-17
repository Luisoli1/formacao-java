package fundamentos.stringmetodos.desafios.procesadordelogs;

public class ProcessadorDeLogs {

	public static void main(String[] args) {
		 // Simula um log do servidor com diferentes tipos de mensagens
		String logServidor = "INFO:Usuario logado com sucesso\nERROR:Falha de conexao com banco de dados\nINFO:Download concluido\nERROR:Senha incorreta para o usuario admin\nWARNING:Uso de memoria alto";
		
		 // Divide o log em linhas usando a quebra de linha como separador
		String[] linhas = logServidor.split("\n");
		
		 // Percorre cada linha do log
		for(int i=0; i< linhas.length; i++) {
			// Processa apenas as linhas que contêm erros
			if (linhas [i].startsWith("ERROR")) {
		    // Exibe a linha original do log
			System.out.println(linhas[i]);
			// Remove o identificador "ERROR:" da mensagem
			String linhaLimpa = linhas[i].replace("ERROR:", "-");
			System.out.println(linhaLimpa);
			// Divide a linha em duas partes:
            // posição 0 -> texto antes de "ERROR:"
            // posição 1 -> mensagem de erro
			String[] limpaLinha = linhas[i].split("ERROR:");
			// Importante:
            // o array "limpaLinha" possui apenas duas posições (0 e 1).
            // Não podemos usar o índice "i" aqui, pois ele pertence ao array "linhas".
			System.out.println(limpaLinha[1]);
			
			}
			
		}
	}



	}


