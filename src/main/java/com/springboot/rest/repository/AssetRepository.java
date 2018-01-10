package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.rest.model.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long>{

	Asset findOne(Long id);

}
