package br.com.bonespirito.leilao;

/**
 * Created by torgg on 03/02/2016.
 */
public class Usuario {

    private Long id;
    private String nome;

    public Usuario(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
