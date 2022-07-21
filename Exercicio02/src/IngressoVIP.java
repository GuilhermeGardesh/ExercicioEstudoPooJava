public class IngressoVIP extends Ingresso{

    private double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimirValor() {
        System.out.println("O preço do ingresso VIP é: R$"+(this.getValor()+this.getValorAdicional()));
    }
}
