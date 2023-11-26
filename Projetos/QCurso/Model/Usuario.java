package org.example.Model;

public abstract class Usuario {
    private String Nome;
    private String email;
    private int Telefone;
    private String senha;

    public abstract void mostrarInfo();

    public Usuario(String nome, String email, int telefone, String senha) {
        Nome = nome;
        this.email = email;
        Telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public abstract String getCurso();

}
