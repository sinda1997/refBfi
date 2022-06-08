package com.esprit.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ugest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String codeInterne;
    private String libcou;
    private String liblon;
    @ManyToOne
    private Tiers tiers;
    @OneToMany(mappedBy = "ugest")
    private Collection<Compte> comptes;
    @ManyToOne
    private Ugest agenceParent;


}