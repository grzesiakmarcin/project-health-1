package com.github.java.demo.repositories;

import com.github.java.demo.domain.Dietician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DieticanRepository extends JpaRepository<Dietician, Long> {

}
