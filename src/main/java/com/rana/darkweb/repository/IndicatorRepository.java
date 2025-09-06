package com.rana.darkweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rana.darkweb.Indicator;

@Repository
public interface IndicatorRepository extends JpaRepository<Indicator, String> {
}
