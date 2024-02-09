package com.spring.batch.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.batch.entity.Voltage;

@Repository
public interface IVoltageRepository extends JpaRepository<Voltage, Long>{

}
