import java.util.Calendar;
import java.util.Scanner;



public class Jogador {
    //Classe Scanner
    Scanner s = new Scanner(System.in);
    //Coletando ano do sistema
    Calendar data = Calendar.getInstance();
    int ano = data.get(Calendar.YEAR);

    //nome, posição, data de nascimento, nacionalidade, altura e peso

    private String nome, nacionalidade;
    private double peso;
    private  int altura, dataDeNascimento;
    private Posicao posicao;


    //construtores


    //Get set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Posicao getPosicao() {
        return posicao;
    }
    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
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
        //nome, posição, data de nascimento, nacionalidade, altura e peso.
        System.out.println("\n___ Dados do Jogador___");
        System.out.println("Nome: "+ this.getNome()+"; \nAno de nascimento: "+this.getDataDeNascimento()+"; Nacionalidade: "+this.getNacionalidade());
        System.out.println("Posição: "+this.getPosicao().getDesc()+" Descrição: "+this.getPosicao().getDescricao()+"; " +
                "\nAltura(cm): "+this.getAltura()+"; Peso(Kg): "+this.getPeso());

    }

    public int idade (){
        int i = 0;
        i = ano - this.getDataDeNascimento();
       return i;
    }

    public void aposentadoria() {
        switch (this.posicao) {
            case DEFESA:
                if (this.idade() >= 40) {
                    System.out.println("Este jogador já está aposentado ou se aposenta este ano.");
                } else {
                    System.out.println("faltam " + (40 - this.idade()) + " anos para este jogador se aposentar.");
                }
                break;
            case MEIO:
                if (this.idade() >= 38) {
                    System.out.println("Este jogador já está aposentado ou se aposenta este ano.");
                } else {
                    System.out.println("faltam " + (38 - this.idade()) + " anos para este jogador se aposentar.");
                }
                break;
            case ATAQUE:
                if (this.idade() >= 35) {
                    System.out.println("Este jogador já está aposentado ou se aposenta este ano.");
                } else {
                    System.out.println("faltam " + (35 - this.idade()) + " anos para este jogador se aposentar.");
                }
                break;
        }


    }



}
