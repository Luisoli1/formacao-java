# Exercício: Validação de Senha

## Descrição

Programa que solicita uma senha ao usuário e continua pedindo uma nova tentativa enquanto a senha informada for inválida.

Quando a senha correta é digitada, o sistema exibe uma mensagem de acesso permitido e encerra a execução.

## Conceitos Praticados

- Estrutura de repetição `while`
- Validação de dados
- Operador de comparação
- Entrada de dados com `Scanner`

## Regra de Negócio

- Enquanto a senha digitada for diferente da senha cadastrada:
  - Exibir mensagem de senha inválida
  - Solicitar nova tentativa
- Quando a senha estiver correta:
  - Exibir mensagem de acesso permitido

## Exemplo

```text
Digite sua senha para acessar: 1234

Senha inválida!

Digite sua senha para acessar: 2002

Acesso Permitido!
```