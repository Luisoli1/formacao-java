# 🏎️ Sistema de Corrida de Carros (Java POO)

Este projeto é um sistema de simulação de corridas de carros desenvolvido em **Java**, aplicando conceitos avançados de **Programação Orientada a Objetos (POO)** como **Agregação entre Classes**, **Encapsulamento Estrito** e **Regras de Negócio de Domínio**.

---

## 📌 Conceitos de POO Aplicados

- **Agregação de Objetos**:
  - A classe `Carro` agrega uma instância de `Piloto`.
  - A classe `Corrida` agrega duas instâncias de `Carro`.
- **Encapsulamento Avançado**:
  - Uso de **setters privados** em atributos sensíveis (`experiencia`, `vitorias`, `derrotas`, `cadastroAtivo`) na classe `Piloto` para impedir alteração direta não autorizada.
- **Regras de Negócio (Domain Rules)**:
  - Controle de estado do cadastro (`cadastroAtivo`): atinge o perfil após o cadastro e trava alterações manuais de estatísticas.
- **Navegação em Cadeia de Objetos**:
  - Acessos encadeados como `carro1.getPiloto().getExperiencia()`.

---

## ⚙️ Regras de Validação de Corrida

Para que uma corrida seja **aprovada** no método `marcarCorrida()`, ela precisa passar por 3 validações:

1. **Equipes Diferentes**: Os carros não podem pertencer à mesma equipe.
2. **Equilíbrio de Experiência**: A diferença entre o nível de experiência dos dois pilotos deve ser de no máximo **3 pontos** (`Math.abs(...) <= 3`).
3. **Cadastro Ativo**: Ambos os pilotos precisam estar com o cadastro ativo (`isCadastroAtivo() == true`).

---

## 🎲 Motor de Simulação (`iniciarCorrida`)

A pontuação de desempenho no momento da corrida é calculada dinamicamente:

$$\text{Pontuação} = \text{potenciaHP} + (\text{experienciaDoPiloto} \times 15) + \text{Random}(0 \text{ a } 30)$$

- O piloto do carro de maior pontuação vence a corrida e tem seu atributo `vitorias` incrementado.
- O perdedor tem o atributo `derrotas` incrementado.
- Em caso de pontuações iguais, a corrida termina em empate sem alterar os históricos.

---

## 📁 Estrutura do Projeto

```text
sistema.corrida.carros/
│
├── Piloto.java     # Entidade do piloto com controle de status e setters privados
├── Carro.java      # Entidade do carro agregando a classe Piloto
├── Corrida.java    # Classe gerenciadora agregando 2 Carros com as regras da corrida
└── Autodromo.java  # Classe principal (main) para testes e execuções