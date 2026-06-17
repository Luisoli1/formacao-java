# Desafio: Boletim Escolar

## Descrição

Neste desafio, o objetivo é processar uma lista de alunos e suas respectivas notas a partir de uma única `String`, simulando um cenário em que um professor envia os dados em formato de texto contínuo.

O programa deve separar as informações de cada aluno, calcular a média das três notas e informar se o aluno foi aprovado ou reprovado.

---

## Objetivos

- Trabalhar com manipulação de `String` em Java.
- Utilizar o método `split()`.
- Converter valores de `String` para `double` com `Double.parseDouble()`.
- Utilizar estruturas de repetição.
- Aplicar estruturas condicionais.
- Praticar formatação de saída com `System.out.printf()`.

---

## Entrada

```java
// Formato: Nome,Nota1,Nota2,Nota3;
String notasTurma = "Ana,8.5,9.0,7.5;Joao,4.5,5.0,6.0;Maria,10.0,9.5,10.0;Pedro,6.5,7.0,6.0";
```

---

## Regras de Negócio

1. O separador entre os alunos é `;`.
2. O separador entre os dados de cada aluno é `,`.
3. A média é calculada com as três notas.
4. O aluno é considerado **Aprovado** quando a média for maior ou igual a `7.0`.
5. O aluno é considerado **Reprovado** quando a média for menor que `7.0`.

---

## Exemplo de Saída

```text
Aluno: Ana | Média: 8.33 | Status: Aprovado
Aluno: Joao | Média: 5.17 | Status: Reprovado
Aluno: Maria | Média: 9.83 | Status: Aprovado
Aluno: Pedro | Média: 6.50 | Status: Reprovado
```

---

## Conceitos Praticados

- `String.split()`
- Arrays
- Laços de repetição (`for`)
- Conversão de tipos (`Double.parseDouble()`)
- Estruturas condicionais (`if/else`)
- Formatação com `System.out.printf()`