package com.software.nick.medicinestore.store.module.account.model;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    protected Long id;
}
