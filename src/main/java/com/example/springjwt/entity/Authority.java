package com.example.springjwt.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "authority")
@Entity
public class Authority {

    @Id
    @Column(name = "authority_name", length = 50)
    private String authorityName;
}
