package org.example.Model;

public class Curso {
    private String Nome;
    private String Descricao;
    private int tempo;
    private int quantidade_alunos;
    private int id;
    public Curso(String nome, String descricao, int tempo, int quantidade_alunos, int id ) {
        Nome = nome;
        Descricao = descricao;
        this.tempo = tempo;
        this.quantidade_alunos = quantidade_alunos;
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public int getQuantidade_alunos() {
        return quantidade_alunos;
    }

    public void setQuantidade_alunos(int quantidade_alunos) {
        this.quantidade_alunos = quantidade_alunos;
    }
    public int getID(){
        return id;
    }

    public void setId(){
        this.id = id;
    }
}
