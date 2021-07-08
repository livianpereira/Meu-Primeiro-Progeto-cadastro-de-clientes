
package br.com.model;


public class Cliente {
    private String nome;
    private String telefone;
    private String endereco;
    private String rg;
    private String cpf;
    private String produto;
    private Integer quantidade;
    private Double preco;
    private String data;

    public Cliente (){
  }

    public Cliente(String nome, String telefone, String endereco, String rg, String cpf, String produto, Integer quantidade, Double preco, String data) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.rg = rg;
        this.cpf = cpf;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    }

   
    
   
    
   
