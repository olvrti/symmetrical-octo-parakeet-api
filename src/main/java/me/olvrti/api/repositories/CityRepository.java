package me.olvrti.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.olvrti.api.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
