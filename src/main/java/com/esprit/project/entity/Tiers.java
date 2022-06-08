package com.esprit.project.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Tiers")
public abstract class Tiers {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String Prenom;
    private String sexe;
    private Date dateDeNaissance;
    private Date dateDeCreation;

    @OneToMany (mappedBy = "tiers")
    private Collection<Compte> comptes;
    @ManyToOne
    private Country country;
    @OneToMany(mappedBy ="tiers" )
    private Collection<Ugest> ugests;
    @OneToMany(mappedBy = "tiers")
    private Collection<Contact>contacts;



}
