package in.madhan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.madhan.entity.CountryEntity;

public interface CountryRepository extends JpaRepository<CountryEntity, Serializable> {

}
