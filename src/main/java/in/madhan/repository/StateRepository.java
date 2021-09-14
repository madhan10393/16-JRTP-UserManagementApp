package in.madhan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.madhan.entity.StateEntity;

public interface StateRepository extends JpaRepository<StateEntity, Serializable> {

}
