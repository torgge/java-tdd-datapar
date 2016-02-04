package br.com.bonespirito.leilao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {

    private String descricao;
    private List<Lance> lances;

    public Leilao(String descricao){
        this.descricao = descricao;
        lances = new ArrayList<Lance>();
    }

    public void propoe(Lance lance){ this.lances.add(lance); }

    public String getDescricao(){ return this.descricao; }

    public List<Lance> getLances(){ return Collections.unmodifiableList(lances);}

}
