package io.github.gabriel121souza.agenda.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.gabriel121souza.agenda.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
