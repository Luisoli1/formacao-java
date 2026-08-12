# 📝 Gestor de Tarefas e Prazos - TaskFlow (Java Collections & Java Time)

Este projeto foi desenvolvido em **Java** para praticar a manipulação de **Listas Dinâmicas (`List` / `ArrayList`)** da API de Collections e o tratamento moderno de **Datas e Horas (`java.time`)**.

---

## 📌 Conceitos de Java Aplicados

- **API de Collections (`java.util.List` / `java.util.ArrayList`)**:
  - Programação voltada à interface (`List<Tarefa> tarefas = new ArrayList<>()`).
  - Métodos de manipulação dinâmica: `add()`, `remove()`, iteração com `for-each` e busca/remoção por filtro de `id`.
- **API Moderna de Data e Hora (`java.time`)**:
  - `LocalDateTime.now()` para captura da data/hora de criação do sistema.
  - `.plusDays(n)` e `.minusDays(n)` para simulação flexível de prazos limite futuros e vencidos.
  - `.isBefore(LocalDateTime.now())` para cálculo automático de tarefas atrasadas.
  - `DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")` para formatação no padrão brasileiro.
- **Encapsulamento e OOD**:
  - Encapsulamento estrito com getters/setters e métodos utilitários de apresentação (`exibirDetalhes` e `toString`).

---

## ⚙️ Funcionalidades do Sistema

1. **Adição Dinâmica de Tarefas**: Cadastro com geração de ID, título, descrição e prazo relativo.
2. **Conclusão de Tarefas por ID**: Altera o estado `concluida` para `true`.
3. **Filtro de Tarefas Atrasadas**: Exibe apenas tarefas **não concluídas** cujo prazo limite já expirou (`isBefore`).
4. **Filtro de Tarefas Pendentes**: Exibe apenas tarefas pendentes de execução.
5. **Remoção de Tarefas por ID**: Remove elementos da lista dinâmica com segurança.

---

## 📁 Estrutura do Projeto

```text
sistema.gestor.tarefas/
│
├── Tarefa.java                # Entidade Tarefa com regras de data/hora e formatação
├── GerenciadorDeTarefas.java  # Classe responsável por gerenciar a List<Tarefa>
└── AppTarefas.java            # Classe principal (main) para testes e execuções# 📝 Gestor de Tarefas e Prazos - TaskFlow (Java Collections & Java Time)

Este projeto foi desenvolvido em **Java** para praticar a manipulação de **Listas Dinâmicas (`List` / `ArrayList`)** da API de Collections e o tratamento moderno de **Datas e Horas (`java.time`)**.

---
