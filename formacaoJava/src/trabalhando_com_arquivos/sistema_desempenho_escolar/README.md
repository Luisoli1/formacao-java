# 📚 Sistema de Desempenho Escolar - Processamento de CSV em Java

Projeto desenvolvido em Java para leitura de dados de alunos a partir de arquivos `.csv`, processamento de notas/médias e geração automatizada de relatórios estatísticos da turma em uma subpasta `out/`.

---

## 📌 Sobre o Projeto

O programa lê um arquivo `.csv` de entrada contendo o nome dos alunos e 3 notas de provas. Em seguida, processa as informações aplicando conceitos de **Orientação a Objetos** e gera um arquivo `resultado.csv` formatado.

### Funcionalidades:
- 📖 **Leitura de dados `.csv`** usando `BufferedReader`.
- 🧮 **Cálculo da média individual** de cada aluno e verificação de status (`APROVADO` para média >= 7.0 e `REPROVADO` para média < 7.0).
- 📊 **Estatísticas da Turma (Composição de Objetos)**:
  - Cálculo da média geral da turma.
  - Identificação do aluno com a maior média.
- 💾 **Geração de relatório em subpasta `out/`** usando `BufferedWriter`.
- 🌐 **Padronização Numérica**: Uso de `Locale.US` para garantir o formato de ponto decimal no `.csv`.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (JDK 17+)
- **Paradigma:** Orientação a Objetos (Encapsulamento, Composição, Enumerações)
- **Manipulação de Arquivos:** `java.io` (`File`, `FileReader`, `BufferedReader`, `FileWriter`, `BufferedWriter`)
- **IDE recomendada:** IntelliJ IDEA / Eclipse / VS Code

---

## 📂 Estrutura do Projeto

    src/
    ├── application/
    │   └── Program.java             # Fluxo principal (leitura do CSV e geração da saída)
    └── model/
        ├── entities/
        │   ├── Aluno.java           # Representa o Aluno e suas regras de negócio
        │   ├── Notas.java           # Encapsula as 3 notas e calcula a média do aluno
        │   └── Turma.java           # Agrega a lista de alunos e calcula dados globais da turma
        └── enums/
            └── ResultadoFinal.java   # Enum para o status final (APROVADO / REPROVADO)

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- **Java (JDK 17 ou superior)** instalado.

### Passo a Passo
1. Clone o repositório para sua máquina.

2. Abra o projeto na sua IDE Java (IntelliJ, VS Code, Eclipse, etc.).

3. Crie um arquivo chamado `notas.csv` na sua máquina com o seguinte modelo:

    Maria Silva,8.5,7.0,9.0
    Joao Souza,5.0,6.0,4.5
    Ana Costa,7.0,7.0,7.0
    Carlos Pereira,9.0,8.0,10.0

4. Execute a classe `Program.java`.

5. Quando o terminal solicitar, insira o **caminho absoluto** do seu arquivo `notas.csv` (ex: `C:\Users\usuario\Documents\notas.csv`).

6. O programa criará a pasta `out` e gerará o arquivo `resultado.csv` no mesmo diretório!

---

## 📄 Exemplo de Saída (`out/resultado.csv`)

    Maria Silva, 8.17, APROVADO
    Joao Souza, 5.17, REPROVADO
    Ana Costa, 7.00, APROVADO
    Carlos Pereira, 9.00, APROVADO

    =====Média total da turma =====
    Média: 7.33

    === Aluno com maior média =====
    Carlos Pereira | média: 9.00
