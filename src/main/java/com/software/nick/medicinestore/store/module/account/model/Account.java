package com.software.nick.medicinestore.store.module.account.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Account extends BaseAuditModel{

    @NotBlank(message = "must be filled in")
    @Column(unique = true, length = 50, updatable = true)
    private String username;

    @Email(regexp = "^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")
    @Min(5)
    private String email;

    private String firstName;

    private String lastName;

    private String middleName;
}
