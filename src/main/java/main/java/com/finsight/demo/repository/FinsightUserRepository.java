package main.java.com.finsight.demo.repository;

import java.util.List;

import java.util.Optional;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.finsight.demo.model.FinsightUser;

public interface FinsightUserRepository extends JpaRepository<FinsightUser, Long> {
       
    Long id(long id);

    Optional<FinsightUser> findByUsername(String username);
    Optional<FinsightUser> findByEmail(String email);
}
