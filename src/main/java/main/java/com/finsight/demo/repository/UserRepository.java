package main.java.com.finsight.demo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import main.java.com.finsight.demo.model.FinsightUser;

public interface UserRepository extends JpaRepository<FinsightUser, Long> {
       
    Long id(long id);

    FinsightUser findByUsername(String username);
}
