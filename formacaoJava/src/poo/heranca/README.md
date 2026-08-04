# 🏢 Sistema de Gestão de Colaboradores e Holerites (Java POO)

Este projeto foi desenvolvido em **Java** para praticar e consolidar os conceitos de **Herança**, **Classes Abstratas**, **Métodos Abstratos**, **Classes Finais (`final`)** e **Sobrescrita de Métodos (`@Override`)**.

---

## 📌 Conceitos de POO Aplicados

- **Superclasse Abstrata (`Funcionario`)**:
  - Definida como `abstract class`, servindo como molde para os demais cargos e **impedindo a instanciação direta**.
  - Método `calcularSalarioFinal()` genérico sobrescrito em cada classe filha.
- **Herança de Diferenciação / Especialização (`extends`)**:
  - `Gerente`: Adiciona o atributo `bonificacao`.
  - `Desenvolvedor`: Adiciona `nivel` e `horasExtras`.
- **Classe e Método Final (`final`)**:
  - `Estagiario`: Definido como `public final class` (impedindo que a classe seja herdada por outras).
  - Método `renovarContrato()` marcado como `final` (impedindo alteração do comportamento).
- **Reflexão e Formatação Dinâmica**:
  - Uso de `this.getClass().getSimpleName()` no método `exibirHolerite()` para identificar dinamicamente a função do colaborador.
  - Uso de `java.time.LocalDate` para capturar e formatar o mês corrente da emissão do holerite.

---

## 💰 Regras de Cálculo Salarial

| Cargo | Fórmulas de Cálculo do Salário Final |
| :--- | :--- |
| **Gerente** | $\text{Salário Base} + \text{Bonificação}$ |
| **Desenvolvedor** | $\text{Salário Base} + (\text{Horas Extras} \times 50.0)$ |
| **Estagiário** | $\text{Salário Base} + \text{Bolsa Auxílio}$ |

---

## 📁 Estrutura do Projeto

```text
exercicio.heranca/
│
├── Funcionario.java     # Superclasse abstrata mãe
├── Gerente.java         # Subclasse especialização de Funcionario
├── Desenvolvedor.java   # Subclasse especialização de Funcionario
├── Estagiario.java      # Subclasse final (não pode ser herdada)
└── main.java            # Classe de teste e execução dos holerites