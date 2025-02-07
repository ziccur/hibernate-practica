package com.iticbcn.yerayreyes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LLIGA")
public class Lliga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lliga")
    private Long idLliga;

    @Column(name = "nom_lliga", nullable = false)
    private String nomLliga;

    @Column(name = "temporada", nullable = false)
    private String temporada;

    // Constructores, getters y setters

    public Lliga() {
    }

    public Lliga(String nomLliga, String temporada) {
        this.nomLliga = nomLliga;
        this.temporada = temporada;
    }

    // Getters y Setters

    public Long getIdLliga() {
        return idLliga;
    }

    public void setIdLliga(Long idLliga) {
        this.idLliga = idLliga;
    }

    public String getNomLliga() {
        return nomLliga;
    }

    public void setNomLliga(String nomLliga) {
        this.nomLliga = nomLliga;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Lliga{" +
                "idLliga=" + idLliga +
                ", nomLliga='" + nomLliga + '\'' +
                ", temporada='" + temporada + '\'' +
                '}';
    }
}