import java.util.Scanner;

/*nome, posição, data de nascimento, nacionalidade, altura e peso*/

public class Exercicio01 {
    public static void main(String args[]){
        //Classe Scanner
        Scanner s = new Scanner(System.in);

        //Objeto jogador
        Jogador j = new Jogador();

        System.out.print("Digite o nome do jogador: ");
        j.setNome(s.next());

        System.out.print("Digite o ano de nascimento do jogador(yyyy): ");
        j.setDataDeNascimento(s.nextInt());
        while ((j.idade()<=0)){
            j.setDataDeNascimento(s.nextInt());
        }

        System.out.print("Digite a sigla da área em que ele joga.\nD - Defesa \nM - Meio campo\nA - Ataque \nDigite: ");
        j.setPosicao(s.next());

        System.out.print("Digite a nacionalidade do jogador: ");
        j.setNacionalidade(s.next());

        System.out.print("Digite a altura do jogador(em cm): ");
        j.setAltura(s.nextInt());

        System.out.print("Digite o peso do jogador(em Kg): ");
        j.setPeso(s.nextDouble());

        j.aposentadoria();
        j.printarDados();




    }
}
