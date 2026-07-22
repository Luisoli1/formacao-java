# Exercício — Classe Livro (getter, setter e construtor)
 
Classe que simula a leitura de um livro, com navegação de página controlada
por regras de negócio (não só um `set` cru no atributo).
 
## Atributos (todos privados)
- `titulo`, `autor` (String)
- `totalPaginas` (int)
- `paginaAtual` (int)
## Construtor
Recebe `titulo`, `autor` e `totalPaginas`. `paginaAtual` sempre começa em 0.
Se `totalPaginas` vier `<= 0`, corrige automaticamente para 1 e avisa no
console, em vez de deixar o objeto nascer num estado inválido.
 
## Decisões de design (e os porquês)
 
**Por que não existe um `setPaginaAtual` simples?**
Ter um setter sem validação ao lado de métodos com validação
(`avancarPagina`/`voltarPagina`) cria uma "porta dos fundos": não importa
quanta regra você bote nos outros métodos, alguém pode chamar o setter
direto e deixar `paginaAtual` maior que `totalPaginas` ou negativo. Por
isso ele foi removido.
 
**`irParaPagina(int pagina)` — feito, mas não é generalização dos outros**
Serve para ir direto a uma página específica (ex: um índice clicável).
Rejeita valores fora do intervalo `[0, totalPaginas]` e avisa erro — não
altera nada se o valor for inválido.
 
**`avancarPagina` e `voltarPagina` continuam com lógica própria (clamp)**
Testamos reaproveitar `irParaPagina` dentro desses dois métodos, mas as
regras de negócio são diferentes:
- `irParaPagina`: número inválido → **rejeita**, nada muda.
- `avancarPagina`/`voltarPagina`: passar do limite → **trava** no limite
  (última página ou página 0) e avisa que chegou ao fim/início.
Como o comportamento esperado em caso de valor inválido é diferente entre
eles, forçar os três a chamar um método comum quebraria uma das duas
regras. Por isso cada um manteve sua própria lógica de validação — a
duplicação aqui é intencional, porque o que parece "a mesma regra" na
forma (comparar com 0 e com o total) é, na prática, duas regras de negócio
diferentes.
 
**`setTotalPaginas(int novoTotal)`**
Só aceita a alteração se `novoTotal >= paginaAtual` (não permite encolher o
livro para menos páginas do que o leitor já leu). Caso contrário, recusa e
avisa.
 
**`getProgresso()`**
Faz cast para `(double)` antes da divisão, para evitar divisão inteira
zerando o resultado.
 
## Métodos
- `avancarPagina(int quantidade)`
- `voltarPagina(int quantidade)`
- `irParaPagina(int pagina)`
- `getProgresso()`
- `setTotalPaginas(int novoTotal)`
- `exibirFicha()`
- getters de `titulo`, `autor`, `paginaAtual`, `totalPaginas` (sem setters
  para `titulo`/`autor` — não fazem parte do escopo do exercício)