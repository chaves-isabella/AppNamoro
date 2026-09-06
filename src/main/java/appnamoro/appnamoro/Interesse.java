package appnamoro.appnamoro;

public class Interesse {

    private Long idUsuario;
    private String nomeInteresse;
    private String categoriaInteresse;
    private String descricao;

    public Interesse (){
    }

    public Interesse(String nomeInteresse, String categoriaInteresse, String descricao){
        this.nomeInteresse = nomeInteresse;
        this.categoriaInteresse = categoriaInteresse;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Interesse{" +
                "idUsuario=" + idUsuario +
                ", nomeInteresse='" + nomeInteresse + '\'' +
                ", categoriaInteresse='" + categoriaInteresse + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }


    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeInteresse() {
        return nomeInteresse;
    }

    public void setNomeInteresse(String nomeInteresse) {
        this.nomeInteresse = nomeInteresse;
    }

    public String getCategoriaInteresse() {
        return categoriaInteresse;
    }

    public void setCategoriaInteresse(String categoriaInteresse) {
        this.categoriaInteresse = categoriaInteresse;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
