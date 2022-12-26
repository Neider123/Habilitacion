package com.example.habilitacion.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="news")
public class News {
	
	@Id
	@SequenceGenerator(name="user_id_seq",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_id_seq")
	private Integer id;
	private String titulo;
	private String desarrollo;
	private String fecha;
	private Integer categoria_id;
	private String url;
	private String resumen;

}
