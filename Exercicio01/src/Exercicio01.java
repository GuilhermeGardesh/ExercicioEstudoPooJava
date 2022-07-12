import java.util.Scanner;

/*nome, posição, data de nascimento, nacionalidade, altura e peso*/

public class Exercicio01 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        Jogador j1 = new Jogador();


        j1.printarAno();

        System.out.print("Digite o nome do jogador: ");
        j1.setNome(s.next());
        System.out.print("Digite o ano de nascimento do jogador(yyyy): ");
        while (j1.getDataDeNascimento()<1){
            j1.setDataDeNascimento(s.nextInt());
        }
        System.out.print("Digite a nacionalidade do jogador: ");
        j1.setNacionalidade(s.next());
        System.out.print("Digite a altura do jogador: ");
        j1.setAltura(s.nextDouble());
        System.out.print("Digite o peso do jogador: ");
        j1.setPeso(s.nextDouble());












    }
}
