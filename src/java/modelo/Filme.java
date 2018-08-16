/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author 17084237
 */
public class Filme {
    private Long id;
    private String filme;
    private String sinopse;
    private String genero;
    private Integer duracao;
    private String trailer;
    
    public Filme(Long id, String filme, String sinopse, 
            String genero, Integer duracao, String trailer) {
        this.id = id;
        this.filme = filme;
        this.sinopse = sinopse;
        this.genero = genero;
        this.duracao = duracao;
        this.trailer = trailer;
    }

    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.filme);
        hash = 67 * hash + Objects.hashCode(this.sinopse);
        hash = 67 * hash + Objects.hashCode(this.genero);
        hash = 67 * hash + Objects.hashCode(this.duracao);
        hash = 67 * hash + Objects.hashCode(this.trailer);
        return hash;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filme other = (Filme) obj;
        if (!Objects.equals(this.filme, other.filme)) {
            return false;
        }
        if (!Objects.equals(this.sinopse, other.sinopse)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.trailer, other.trailer)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.duracao, other.duracao)) {
            return false;
        }
        return true;
    }
    
    public String toString() {
        return "Filme{" + "id=" + id + ", filme=" + filme + ", sinopse=" + sinopse + ", genero=" + genero + ", duracao=" + duracao + ", trailer=" + trailer + '}';
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public Long getId() {
        return id;
    }

    public String getFilme() {
        return filme;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public String getTrailer() {
        return trailer;
    }
   
}
