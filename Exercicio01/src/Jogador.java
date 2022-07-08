import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Jogador {
    /*nome, posição, data de nascimento, nacionalidade, altura e peso*/

    private String nome, posicao, nacionalidade;
    private double altura, peso;
    //private  dataDeNascimento;


    //construct



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

    /*public Date getDataDeNac() {
        return dataDeNac;
    }

    public void setDataDeNac(Date dataDeNac) {
        this.dataDeNac = dataDeNac;
    }*/

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

    /*public void idade(Date dataDeNac){
        int idade = dataDeNac -

    }*/

}
