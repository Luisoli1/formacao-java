package sistema.corrida.carros;

public class Piloto {
    private String nome;
    private String nacionalidade;
    private int experiencia;
    private int vitorias;
    private int derrotas;
    private boolean cadastroAtivo = false;

    public Piloto() {
    }
    public Piloto(String nome, String nacionalidade, int experiencia){
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setExperiencia(experiencia);
    }
    public void infoPiloto(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Nivel experiência: " + this.getExperiencia());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
    }


    public void ganharCorrida(){
        this.setVitorias(this.getVitorias() +1);
    }
    public void perderCorrida(){
        this.setDerrotas(this.getDerrotas() +1);
    }


    public void cadastrarNome(String nome) {
        this.setNome(nome);
    }

    public void cadastrarNacionalidade(String nacionalidade) {
        this.setNacionalidade(nacionalidade);
    }

    public void cadastrarExperiencia(int experiencia) {
        if (this.isCadastroAtivo() == false) {
            this.setExperiencia(experiencia);
        } else {
            System.out.println("ERRO: Experiência ja cadastrada, esse método só vale para cadastro de novos pilotos!\n" +
                    "No caso de pilotos ja existentes a experiência é calculada sózinha, não pode ser alterada manualmente");
        }
    }

    public void cadastrarVitorias(int vitorias) {
        if (this.isCadastroAtivo() == false) {
            this.setVitorias(vitorias);
        } else {
            System.out.println("ERRO: esse método só vale para cadastro de novos pilotos!\n"
                    + "No caso de pilotos ja existentes não pode ser alterado manualmente");
        }
    }

    public void cadastrarDerrotas(int derrotas) {
        if (this.isCadastroAtivo() == false) {
            this.setDerrotas(derrotas);
        } else {
            System.out.println("ERRO: esse método só vale para cadastro de novos pilotos!\n"
                    + "No caso de pilotos ja existentes não pode ser alterado manualmente");
        }
    }

    public void ativarCadastro() {
        this.setCadastroAtivo(true);
    }


    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    private void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getVitorias() {
        return this.vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public boolean isCadastroAtivo() {
        return cadastroAtivo;
    }

    private void setCadastroAtivo(boolean status) {
        this.cadastroAtivo = status;
    }
}
