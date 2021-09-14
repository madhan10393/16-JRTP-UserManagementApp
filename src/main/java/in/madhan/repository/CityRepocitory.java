package in.madhan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.madhan.entity.CityEntity;

public interface CityRepocitory extends JpaRepository<CityEntity, Serializable> {

}
