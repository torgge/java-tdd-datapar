package br.com.bonespirito.leilao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {
	
	private String descricao;
	private List<Lance> lances;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void propoe(Lance lance){
		lances.add(lance);
	}
	
	public List<Lance> getLances(){
		return Collections.unmodifiableList(lances);		
	}	

	public Leilao(String descricao) {
		super();
		this.descricao = descricao;
		lances = new ArrayList<Lance>();
	}
	
	
	
	
 
}
