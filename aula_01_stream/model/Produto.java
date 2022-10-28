package aula_01_stream.model;

import java.math.BigDecimal;

public class Produto {
    
    public enum Status {
        ATIVO, INATIVO
    }

    private String nome;
    private Status status;
    private BigDecimal preco;
    private Categoria categoria;

    public Produto (String nome, Status status, BigDecimal preco) {
        super();
        this.nome = nome;
        this.status = status;
        this.preco = preco;
    }

    public Produto (String nome, Status status, BigDecimal preco, Categoria categoria) {
        super();
        this.nome = nome;
        this.status = status;
        this.preco = preco;
        this.categoria = categoria;
    }

    public String getNome(){
        return this.nome;
    }

    public Status getStatus(){
        return this.status;
    }

    public BigDecimal getPreco(){
        return this.preco;
    }

    public Categoria getCategoria(){
        return this.categoria;
    }

    public void Inativar(){
        System.out.println("Inativando: " + this.getNome());

        this.status = Status.INATIVO;
    }
}
