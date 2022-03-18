package com.mjvSchool.biblioteca.model;
import javax.persistence.GeneratedValue;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import nonapi.io.github.classgraph.json.Id;

@EntityScan
public class Pessoa {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

}
