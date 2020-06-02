package br.usjt.springclima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.springclima.model.Clima;


public interface ClimaRepository extends JpaRepository<Clima, Long> {

}
