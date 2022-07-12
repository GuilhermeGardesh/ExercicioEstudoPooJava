import java.util.Calendar;

public class Jogador {
    //Coletando ano do sistema
    Calendar data = Calendar.getInstance();
    int ano = data.get(Calendar.YEAR);

    //nome, posição, data de nascimento, nacionalidade, altura e peso

    private String nome, posicao, nacionalidade;
    private double altura, peso;
    private  int dataDeNascimento;


    //construtores



    //Get set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
        if (this.dataDeNascimento>ano) {
            System.out.println("O jogador ainda não nasceu, digite um ano válido(YYYY). ");
        }else if (ano-this.getDataDeNascimento()>120){
            System.out.println("O jogador com ano de nascimento inválido, digite um ano válido(YYYY). ");
        }
        setDataDeNascimento(0);
    }


    //Metodos

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", dataDeNac=" + //dataDeNac +
                '}';
    }

    public int idade (){
        int i = 0;
        i = ano - getDataDeNascimento();
       return i;
    }

    public void printarAno(){
        System.out.println(ano);
    }

}
