package com.ohio.legislative.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ohio.legislative.entity.Legislator;

public interface LegislatorRepository extends JpaRepository<Legislator, Long> {}
	


