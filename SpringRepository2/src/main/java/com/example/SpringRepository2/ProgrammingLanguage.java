package com.example.SpringRepository2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private int firstAppearance;

    @Column(nullable = false)
    private String inventor;
}