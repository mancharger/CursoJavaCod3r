package StreamsAPI.FIlter.DesafioFilter;

public class Cliente {
    private String nome;
    private Boolean comprouEsseMes;
    private Integer qntComprasTotal;

    public Cliente (String nome, Boolean comprouEsseMes, Integer qntComprasTotal){
        this.nome = nome;
        this.comprouEsseMes = comprouEsseMes;
        this.qntComprasTotal = qntComprasTotal;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Boolean return the comprouEsseMes
     */
    public Boolean getComprouEsseMes() {
        return comprouEsseMes;
    }

    /**
     * @param comprouEsseMes the comprouEsseMes to set
     */
    public void setComprouEsseMes(Boolean comprouEsseMes) {
        this.comprouEsseMes = comprouEsseMes;
    }

    /**
     * @return Integer return the qntComprasTotal
     */
    public Integer getQntComprasTotal() {
        return qntComprasTotal;
    }

    /**
     * @param qntComprasTotal the qntComprasTotal to set
     */
    public void setQntComprasTotal(Integer qntComprasTotal) {
        this.qntComprasTotal = qntComprasTotal;
    }

}