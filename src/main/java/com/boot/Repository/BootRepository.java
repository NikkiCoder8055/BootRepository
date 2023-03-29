package com.boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.Model.Boot;

@Repository
public interface BootRepository extends JpaRepository<Boot, Integer> {

}
