package com.clj.monitoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clj.monitoria.model.Comidas;


public interface ComidaBD extends JpaRepository<Comidas, Long> {

}
