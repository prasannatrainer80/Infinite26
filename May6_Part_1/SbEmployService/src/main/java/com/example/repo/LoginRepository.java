package com.example.repo;

import com.example.model.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Login,String> {
    Login findByUsernameAndPasscode(String username,String passcode);
}
