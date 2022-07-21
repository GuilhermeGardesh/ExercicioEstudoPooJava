public class Exercicio03 {

    public static void main(String[] args){

        Elevador e = new Elevador();

        e.inicializar(10, 5);

        e.entrar();
        e.printarCargaAtual();
        e.subir();
        e.descer();
        e.sair();
        e.printarCargaAtual();
    }
}
