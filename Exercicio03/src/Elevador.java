public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int cargaAtual;

    //Construtor

    public Elevador(){
        this.setAndarAtual(0);
        this.setCargaAtual(0);
    }



    //Get Set
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(int cargaAtual) {
        this.cargaAtual = cargaAtual;
    }


    //Métodos

    public void inicializar (int capacidae, int totAndares){
        this.setCapacidadeElevador(capacidae);
        this.setTotalAndares(totAndares);
    }

    public void entrar (){

        if (this.getCargaAtual()==this.getCapacidadeElevador()){
            System.out.println("O elevador já está com capacidade máxima");
        }else {
            this.setCargaAtual(this.getCargaAtual()+1);
        }
    }

    public void sair(){
        if (this.getCargaAtual()==0){
            System.out.println("O elevador está vazio");
        }else {
            this.setCargaAtual(this.getCargaAtual()-1);
        }

    }

    public void subir(){
        if (this.getAndarAtual()==this.getTotalAndares()){
            System.out.println("O elevador já está no ultimo andar");
        }else {
            this.setAndarAtual(this.getAndarAtual()+1);
            System.out.println("O elevador está no "+this.getAndarAtual()+"° andar");
        }
    }

    public void descer(){
        if (this.getAndarAtual()==0){
            System.out.println("O elevador já está no térreo andar");
        }else {
            this.setAndarAtual(this.getAndarAtual()-1);
            System.out.println("O elevador está no "+this.getAndarAtual()+"° andar");
        }
    }

    public void printarCargaAtual(){
        System.out.println("Carga atual: "+this.getCargaAtual());
    }
}
