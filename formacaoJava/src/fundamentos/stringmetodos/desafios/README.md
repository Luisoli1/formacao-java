# Processador de Logs com `split()` em Java

Exercício prático de manipulação de strings, arrays e estruturas de repetição em Java.

## Objetivo

Percorrer um conjunto de linhas de log e exibir apenas as mensagens de erro.

Durante o desenvolvimento, o foco foi praticar o uso dos métodos `split()` e `replace()`, além de compreender melhor o funcionamento de arrays, índices e escopo de variáveis.

## Exemplo de entrada

```text
INFO:Usuário logado com sucesso
ERROR:Falha de conexão com banco de dados
INFO:Operação concluída
ERROR:Banco indisponível
```

## Saída esperada

```text
ERROR:Falha de conexão com banco de dados
- Falha de conexão com banco de dados
Falha de conexão com banco de dados

ERROR:Banco indisponível
- Banco indisponível
Banco indisponível
```

## Conceitos praticados

- Estruturas de repetição (`for`)
- Estruturas condicionais (`if`)
- Manipulação de strings
- Método `split()`
- Método `replace()`
- Arrays
- Escopo de variáveis
- Tratamento de índices

## Aprendizados

Durante o desenvolvimento, foi identificado um erro do tipo `ArrayIndexOutOfBoundsException`.

O erro ocorreu porque o índice do array `linhas` estava sendo utilizado para acessar o array criado pelo método `split()`. Como cada array possui seu próprio tamanho e seus próprios índices, isso gerava uma tentativa de acesso a posições inexistentes.

Com esse exercício, foi possível compreender que:

- Cada chamada ao método `split()` cria um novo array.
- Variáveis declaradas dentro de um bloco são recriadas a cada iteração do laço.
- Diferentes arrays podem possuir tamanhos distintos.
- Os índices de um array não devem ser reutilizados em outro sem validação.

## Tecnologias utilizadas

- Java
- Eclipse IDE

## Como executar

1. Clone este repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto na sua IDE de preferência.

3. Execute a classe `ProcessadorDeLogs`.

## Observação

O enunciado deste exercício foi gerado com auxílio de inteligência artificial. A implementação, depuração e compreensão da solução foram realizadas por mim como parte do processo de aprendizagem.