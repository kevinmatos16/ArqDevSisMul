package br.usjt.springclima.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
@Table (name = "tb_usuario")
public class Usuario {
	@Id

	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String senha;
}