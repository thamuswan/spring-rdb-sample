/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springrdb.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import thamuswan.sample.springrdb.model.Citizen;

/**
 *
 * @author Thanawat Muangsawang
 */
public interface CitizenRepository extends JpaRepository<Citizen, Long> {

    Optional<Citizen> findFirstByFirstName(String name);

    @Query(value = "SELECT * FROM citizen WHERE first_name LIKE %:name_like% AND age < 18", nativeQuery = true)
    Optional<Citizen> findYoungByFirstNameLike(@Param(value = "name_like") String nameLike);

}
