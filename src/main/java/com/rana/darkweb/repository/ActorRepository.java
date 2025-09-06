package com.rana.darkweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rana.darkweb.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, String> {
}
