package com.fenix15100.springular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fenix15100.springular.models.bo.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

}
