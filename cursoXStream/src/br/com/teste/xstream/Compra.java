package br.com.teste.xstream;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private int id;
    private List<Produto> produtos = new ArrayList<>();

    public Compra(int id, List<Produto> produtos){
        this.id = id;
        this.produtos = produtos;
    }

}