package com.pibdataviz.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PibRepository extends JpaRepository<PibEntity, Long>{

}
