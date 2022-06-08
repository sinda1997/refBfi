package com.esprit.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    private String mobile;
    private String fax;
    private String email;
    private String zipCode;
    private String description;
    private String contactFunction;
    private String contactName;
    private String langage;
    private String formulePolitesse;
    @ManyToOne
    private Tiers tiers;


}