package com.example.demo.repository;

import com.example.demo.model.entity.Ssd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SsdRepository extends CrudRepository<Ssd, Long> {
  
}
