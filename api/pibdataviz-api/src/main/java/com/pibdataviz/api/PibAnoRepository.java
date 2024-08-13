package com.pibdataviz.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PibAnoRepository extends JpaRepository<PibAnoEntity, Long>{

    @Query("SELECT DISTINCT p FROM PibAnoEntity p")
    List<PibAnoEntity> getAllPib();

    @Query("SELECT DISTINCT p FROM PibAnoEntity p where Ano >= 2019")
    List<PibAnoEntity> lastFiveYears();

    @Query("SELECT DISTINCT p FROM PibAnoEntity p where Ano >= 2014")
    List<PibAnoEntity> lastTenYears();

}
