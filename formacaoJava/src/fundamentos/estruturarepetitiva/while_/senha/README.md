# Exercício: Validação de Senha

## Descrição

Programa que permite ao usuário cadastrar uma senha e, em seguida, realizar tentativas de acesso.

A senha digitada é comparada com a senha cadastrada anteriormente. Enquanto os valores forem diferentes, o sistema informa que a senha é inválida e solicita uma nova tentativa.

Quando a senha correta é informada, o acesso é liberado.

## Conceitos Praticados

- Estrutura de repetição `while`
- Comparação de valores
- Validação de entrada
- Variáveis
- Entrada de dados com `Scanner`

## Regra de Negócio

1. O usuário cadastra uma senha.
2. A senha é armazenada em uma variável.
3. O sistema solicita uma senha para acesso.
4. Enquanto a senha digitada for diferente da senha cadastrada:
   - Exibir mensagem de senha inválida.
   - Solicitar nova tentativa.
5. Quando a senha estiver correta:
   - Exibir mensagem de acesso permitido.
   - Encerrar o programa.

## Adaptação Realizada

O exercício original considerava uma senha fixa definida no código (`2002`).

Como forma de prática, a solução foi modificada para permitir que o próprio usuário cadastre uma senha. Em seguida, o sistema solicita uma nova digitação e compara os valores informados.

Enquanto a senha digitada for diferente da senha cadastrada, o acesso é negado. Quando os valores coincidem, o programa libera o acesso.

Essa alteração foi realizada para praticar:

- Variáveis
- Comparação de valores
- Estruturas de repetição (`while`)
- Validação de entrada de dados

## Exemplo

```text
Cadastre sua senha: 1234

Digite sua senha para acessar: 1111
Senha inválida!

Digite sua senha para acessar: 2222
Senha inválida!

Digite sua senha para acessar: 1234
Acesso Permitido!
```