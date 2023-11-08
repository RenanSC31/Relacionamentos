package com.relacionamentos2e.relacionamentos2e.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name = "pessoas", uniqueConstraints = @UniqueConstraint(columnNames = {"email","cpf"}))
public class Pessoa {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private String cpf;
  private String email;
  private String senha;
  private String sexo;
  private String rua;
  private String bairro;
  private String cidade;
  private String uf;
  
  private boolean CodStatus;
  @Column(columnDefinition = "Varbinary(max)")
  private byte[] foto; //Salvar a imagem no banco de dados
  
  
public boolean getCodStatus() {
	return CodStatus;
}
public void setCodStatus(boolean codStatus) {
	CodStatus = codStatus;
}
public byte[] getFoto() {
	return foto;
}
public void setFoto(byte[] foto) {
	this.foto = foto;
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
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public String getRua() {
	return rua;
}
public void setRua(String rua) {
	this.rua = rua;
}
public String getBairro() {
	return bairro;
}
public void setBairro(String bairro) {
	this.bairro = bairro;
}
public String getCidade() {
	return cidade;
}
public void setCidade(String cidade) {
	this.cidade = cidade;
}
public String getUf() {
	return uf;
}
public void setUf(String uf) {
	this.uf = uf;
}  
	  
}
