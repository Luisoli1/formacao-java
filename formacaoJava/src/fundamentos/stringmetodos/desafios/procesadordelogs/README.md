# Processador de Logs com `split()` em Java

Exercício prático de manipulação de strings e arrays em Java.

## Desafio

Você trabalha no suporte de uma empresa de tecnologia. O servidor web gera um arquivo de texto registrando tudo o que acontece, mas o objetivo é identificar e exibir apenas as mensagens de erro.

Cada registro do log é separado por uma quebra de linha (`\n`).

## Exemplo de entrada

```java
String logServidor =
    "INFO:Usuario logado com sucesso\n" +
    "ERROR:Falha de conexao com banco de dados\n" +
    "INFO:Operacao concluida";
```

## Requisitos

O programa deve:

1. Utilizar `split("\n")` para separar as linhas do log.
2. Percorrer as linhas utilizando um laço `for`.
3. Identificar apenas as mensagens que começam com `ERROR:`.
4. Exibir as mensagens de erro no console.
5. Remover o prefixo `ERROR:` para apresentar apenas a mensagem limpa.

## Exemplo de saída

```text
Falha de conexao com banco de dados
```

## Conceitos praticados

- Manipulação de strings
- Método `split()`
- Método `replace()`
- Arrays
- Estruturas de repetição (`for`)
- Estruturas condicionais (`if`)
- Escopo de variáveis
- Acesso a índices de arrays

## Aprendizados

Durante o desenvolvimento, foi identificado um erro do tipo `ArrayIndexOutOfBoundsException`.

O erro ocorreu porque o índice utilizado para percorrer o array `linhas` foi usado incorretamente para acessar o array criado pelo método `split()`.

Com esse exercício, foi possível compreender que:

- Cada chamada ao método `split()` cria um novo array.
- Diferentes arrays podem possuir tamanhos distintos.
- Cada array possui seus próprios índices.
- Variáveis declaradas dentro de um bloco são recriadas a cada iteração do laço.

## Tecnologias utilizadas

- Java
- Eclipse IDE

## Observação

O desafio foi gerado com auxílio de inteligência artificial. A implementação, depuração e compreensão da solução foram realizadas por mim como parte do processo de aprendizagem.