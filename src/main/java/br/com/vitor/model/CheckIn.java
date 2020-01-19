package br.com.vitor.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "CheckIn")
public class CheckIn {
	
	private Hospede hospede;
	private Date dataEntrada;
	private Date dataSaida;
	private boolean adicionalVeiculo;

}