# Desafio: Estoque do E-commerce

## Descrição

Neste desafio, o objetivo foi processar uma lista de produtos armazenada em uma única `String`, simulando a exportação de um sistema legado de estoque.

O programa deve separar os dados de cada produto, calcular o valor total em estoque e exibir as informações formatadas no console.

---

## Objetivos

- Trabalhar com manipulação de `String` em Java.
- Utilizar o método `split()`.
- Converter valores de `String` para tipos numéricos.
- Utilizar estruturas de repetição.
- Acumular valores com operadores de atribuição.
- Praticar formatação de saída com `System.out.printf()`.

---

## Entrada

```java
// Formato: NomeDoProduto-Quantidade-PrecoUnitario|NomeDoProduto-Quantidade-PrecoUnitario

String estoque = "Cadeira Gamer-2-850.00|Mesa de Escritorio-1-1200.50|Teclado Mecanico-3-250.00|Mouse sem fio-5-120.00";
```

---

## Regras de Negócio

1. O separador entre os produtos é `|`.
2. O separador entre os dados de cada produto é `-`.
3. A quantidade deve ser convertida para `int`.
4. O preço unitário deve ser convertido para `double`.
5. O valor total em estoque é calculado multiplicando a quantidade pelo preço unitário de cada produto.
6. O valor total deve ser acumulado durante a execução.

---

## Exemplo de Saída

```text
--- ESTOQUE E-COMMERCE DO BETINHO ---

Produto: Cadeira Gamer | Quantidade: 2 | Valor: R$ 850.00
Produto: Mesa de Escritorio | Quantidade: 1 | Valor: R$ 1200.50
Produto: Teclado Mecanico | Quantidade: 3 | Valor: R$ 250.00
Produto: Mouse sem fio | Quantidade: 5 | Valor: R$ 120.00

Valor parado em estoque: R$ 4301.50

---------------FIM----------------
```

---

## Desafio Encontrado

Durante o desenvolvimento, foi identificado um problema ao utilizar o método `split("|")` para separar os produtos.

Após pesquisa, foi descoberto que o caractere `|` possui significado especial em expressões regulares, sendo interpretado como um operador lógico.

Para utilizá-lo como separador literal, foi necessário escapar o caractere:

```java
String[] linhas = estoque.split("\\|");
```

---

## Aprendizados

- O método `split()` utiliza expressões regulares.
- Alguns caracteres especiais precisam ser escapados.
- `Integer.parseInt()` converte `String` para `int`.
- `Double.parseDouble()` converte `String` para `double`.
- O operador `+=` facilita o acúmulo de valores.

---

## Observações

A lógica de processamento, conversão dos dados, cálculo do valor total e exibição das informações foi desenvolvida de forma independente. A única pesquisa externa realizada foi para entender o comportamento do `split()` com o caractere `|`.