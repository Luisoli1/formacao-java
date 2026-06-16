package fundamentos.stringmetodos;

public class ExemplosString {

	public static void main(String[] args) {
		String entrada = "  PROJETO_SETTA_ELETRICA_RESIDENCIAL  ";
        String nomeCliente = "  joão silva  ";
        
        // 1. Formatação (Trim, ToLowerCase, ToUpperCase)
        String nomeLimpo = nomeCliente.trim(); // "joão silva"
        String nomeFormatado = nomeLimpo.toUpperCase(); // "JOÃO SILVA" (Padronização para relatórios)
        String nomeMinusculo = nomeLimpo.toLowerCase(); // "joão silva" (Para busca interna)

        String entradaLimpa = entrada.trim(); // "PROJETO_SETTA_ELETRICA_RESIDENCIAL"

        // 2. Extração de partes (Substrings)
        String prefixo = entradaLimpa.substring(0, 7); 
        String categoria = entradaLimpa.substring(8);  

        // 3. Substituição
        String nomeProjetoFormatado = entradaLimpa.replace("_", " - ");

        // 4. Busca de índices
        int posicaoDaCategoria = entradaLimpa.indexOf("SETTA");

        // 5. Split (Divisão)
        String tags = "eletrica,hidraulica,gas";
        String[] listaTags = tags.split(",");

        // --- IMPRESSÃO DOS RESULTADOS ---
        System.out.println("Cliente (Maiúsculas): " + nomeFormatado);
        System.out.println("Cliente (Minúsculas): " + nomeMinusculo);
        System.out.println("String do Projeto: " + nomeProjetoFormatado);
        System.out.println("Prefixo extraído: " + prefixo);
        System.out.println("Índice de início da categoria: " + posicaoDaCategoria);
        System.out.println("Primeira tag do sistema: " + listaTags[0]);

	}

}
