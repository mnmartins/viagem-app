package com.masterclass.cliente;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Cliente extends PanacheEntity {
    //Nota: Panache gerencia o Id das Entidades

    public String nome;
}
