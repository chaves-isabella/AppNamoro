package appnamoro.appnamoro;

import java.time.LocalDate;

public class Usuario {

    private Long idUsuario;
    private String nomeCompleto;
    private LocalDate dtNascimento;
    private String email;
    private String biografia;

//construtor vazio para o spring boot transformar as informações em JSON em objetos java
    public Usuario (){}

    public Usuario (String nomeCompleto, LocalDate dtNascimento, String email, String biografia){
        this.nomeCompleto = nomeCompleto;
        this.dtNascimento = dtNascimento;
        this.email = email;
        this.biografia = biografia;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", dtNascimento=" + dtNascimento +
                ", email='" + email + '\'' +
                ", biografia='" + biografia + '\'' +
                '}';
    }

    public Long getIdUsuario(){
        return idUsuario;
    }
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    public LocalDate getDtNascimento(){
        return dtNascimento;
    }
    public String getEmail(){
        return email;
    }
    public String getBiografia(){
        return biografia;
    }


    public void setIdUsuario(Long idUsuario){
        this.idUsuario = idUsuario;
    }
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public void setDtNascimento(LocalDate dtNascimento){
        this.dtNascimento = dtNascimento;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBiografia(String biografia){
        this.biografia = biografia;
    }

}
