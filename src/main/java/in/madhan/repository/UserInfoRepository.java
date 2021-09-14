package in.madhan.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.madhan.entity.UserInfoEntity;

public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Serializable> {

}
