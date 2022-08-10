package tn.iliade.myproject.repository;

import tn.iliade.myproject.entity.user;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository <user,Integer> {
}

