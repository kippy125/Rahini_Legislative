package com.ohio.legislative.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ohio.legislative.entity.Legislation;


public interface LegislationRepository extends JpaRepository<Legislation, Long> {}


