public enum Posicao{
    DEFESA("Defesa", "Este jogador Joga de forma defensiva"),
    MEIO("Meio", "Este jogador Joga de forma a construir jogadas"),
    ATAQUE("Ataque", "Este jogador Joga para arrematar ao gol");



    private String desc;
    private String descricao;

    Posicao(String p, String d) {
        this.desc = p;
        this.descricao = d;
    }

    public String getDesc() {
        return desc;
    }

    public String getDescricao() {
        return descricao;
    }
}