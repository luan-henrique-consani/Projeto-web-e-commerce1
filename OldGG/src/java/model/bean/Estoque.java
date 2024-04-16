/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Blob;

/**
 *
 * @author consa
 */
public class Estoque {
    private int idEstoque;
    private String nomeEstoque;
    private byte [] imagemEstoque;
    private String categoriaEstoque;
    private float precoEstoque;
    private int quantidadeEstoque;

    public Estoque() {
    }

    public Estoque(int idEstoque, String nomeEstoque, byte[] imagemEstoque, String categoriaEstoque, float precoEstoque, int quantidadeEstoque) {
        this.idEstoque = idEstoque;
        this.nomeEstoque = nomeEstoque;
        this.imagemEstoque = imagemEstoque;
        this.categoriaEstoque = categoriaEstoque;
        this.precoEstoque = precoEstoque;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public String getNomeEstoque() {
        return nomeEstoque;
    }

    public void setNomeEstoque(String nomeEstoque) {
        this.nomeEstoque = nomeEstoque;
    }

    public byte[] getImagemEstoque() {
        return imagemEstoque;
    }

    public void setImagemEstoque(byte[] imagemEstoque) {
        this.imagemEstoque = imagemEstoque;
    }

    public String getCategoriaEstoque() {
        return categoriaEstoque;
    }

    public void setCategoriaEstoque(String categoriaEstoque) {
        this.categoriaEstoque = categoriaEstoque;
    }

    public float getPrecoEstoque() {
        return precoEstoque;
    }

    public void setPrecoEstoque(float precoEstoque) {
        this.precoEstoque = precoEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }


    
}
