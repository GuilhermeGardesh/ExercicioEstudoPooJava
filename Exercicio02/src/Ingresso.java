public class Ingresso {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public void imprimirValor(){
        System.out.println("O preço do ingresso normal é: R$"+this.getValor());
    }
}
