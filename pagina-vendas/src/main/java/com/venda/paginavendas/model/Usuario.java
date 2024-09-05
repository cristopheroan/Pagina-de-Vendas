package com.venda.paginavendas.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String celular;
    private String senha;

    // Getters e Setters
}
