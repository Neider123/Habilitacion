package com.example.habilitacion.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categoriaNews")
public class Categoria {
	
	@Id
	private Integer id;
	private String descripcion;
	
	

}
