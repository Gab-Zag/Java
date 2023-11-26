DROP DATABASE IF EXISTS QCurso;
CREATE DATABASE QCurso;
USE QCurso;

CREATE TABLE IF NOT EXISTS Gerente(
	email VARCHAR(45),
    PRIMARY KEY (email),
    nome VARCHAR(45),
    telefone VARCHAR(45),
    senha VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS Professor(
    email VARCHAR(45),
    PRIMARY KEY(email),
    nome VARCHAR(45),
    telefone VARCHAR(45),
    senha VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS aluno(
    email VARCHAR(45),
    PRIMARY KEY (email),
    nome VARCHAR(45),
    telefone VARCHAR(45),
    senha VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS Curso(
	nome VARCHAR(45),
    PRIMARY KEY(nome),
    descricao VARCHAR(1000),
    tempo VARCHAR(12),
    quantidadeDeAlunos VARCHAR(100),
    id VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS Inscricoes(
	aluno_id VARCHAR(45),
	curso_id VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS Ministrada(
	professor_id VARCHAR(45),
    curso_id VARCHAR(45)
);
