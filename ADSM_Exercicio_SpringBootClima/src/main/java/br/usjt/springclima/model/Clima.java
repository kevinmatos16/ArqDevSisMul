package br.usjt.springclima.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "tb_clima")
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Clima implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	@Column(nullable = false, length = 200)
	private int minima;

	@Column(nullable = false, length = 30)
	private int maxima;

	@Column(nullable = true, length = 100)
	private double umidade;

	@Column(nullable = true, length = 100)
	private String descricao;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true, length = 100)
	private Date data;

	@ManyToOne(cascade = CascadeType.ALL)
	private Semana semana;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cidade cidade;


}
