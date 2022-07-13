import java.util.Calendar;
import java.util.Scanner;

public class Jogador {
    //Classe Scanner
    Scanner s = new Scanner(System.in);
    //Coletando ano do sistema
    Calendar data = Calendar.getInstance();
    int ano = data.get(Calendar.YEAR);

    //nome, posição, data de nascimento, nacionalidade, altura e peso

    private String nome, posicao, nacionalidade;
    private double peso;
    private  int altura, dataDeNascimento;


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
        if (posicao.equals("D")){
            this.posicao=("Defesa");
        } else if (posicao.equals("M")){
            this.posicao=("Meio");
        } else if (posicao.equals("DA")){
            this.posicao=("Ataque");
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
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
            System.out.print("O jogador ainda não nasceu, digite um ano válido(YYYY). \nDigite:  ");
        }else if (this.idade()==0){
            System.out.print("O jogador nasceu neste ano, digite um ano válido(YYYY). \nDigite:  ");
        }if (this.idade()>100){
            System.out.print("Está certo do ano que digitou? (S/N)");
            String i = s.next();
            if (i.equals("S")){}
            while (i.equals("N")){
                System.out.print("Digite o ano(yyyy): ");
                this.setDataDeNascimento(s.nextInt());
                i="S";
            }
        }
    }


    //Metodos
    public void printarDados(){


    }

    public int idade (){
        int i = 0;
        i = ano - this.getDataDeNascimento();
       return i;
    }

    public void aposentadoria() {
        if (this.getPosicao().equals("Defesa")) {
            if (this.idade() >= 40) {
                System.out.print("Este jogador já está aposentado ou se aposenta este ano.");
            } else {
                System.out.print("faltam " + (40 - this.idade()) + " anos para este jogador se aposentar.");
            }
        } else if (this.getPosicao().equals("Meio")) {
            if (this.idade() >= 38) {
                System.out.print("Este jogador já está aposentado ou se aposenta este ano.");
            } else {
                System.out.print("faltam " + (38 - this.idade()) + " anos para este jogador se aposentar.");
            }
        }else if (this.getPosicao().equals("Ataque")) {
            if (this.idade() >= 35) {
                System.out.print("Este jogador já está aposentado ou se aposenta este ano.");
            } else {
                System.out.print("faltam " + (35 - this.idade()) + " anos para este jogador se aposentar.");
            }
        }

    }

}
