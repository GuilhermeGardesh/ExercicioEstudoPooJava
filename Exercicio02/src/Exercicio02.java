public class Exercicio02 {
    public static void main(String[] args){
        Ingresso i = new Ingresso();
        IngressoVIP v = new IngressoVIP();

        i.setValor(25.5);
        v.setValor(25.5);
        v.setValorAdicional(10);

        i.imprimirValor();

        v.imprimirValor();
    }

}
