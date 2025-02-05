package com.iticbcn.yerayreyes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "clasificaciones")
public class Clasificacio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    @JoinColumn(name = "equip_id", nullable = false, unique = true)
    private Equip equipo;
    
    @ManyToOne
    @JoinColumn(name = "lliga_id", nullable = false)
    private Lliga liga;
}