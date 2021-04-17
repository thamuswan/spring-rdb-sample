/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springrdb.service;

import org.springframework.stereotype.Service;
import thamuswan.sample.springrdb.model.Citizen;
import thamuswan.sample.springrdb.repository.CitizenRepository;

/**
 *
 * @author Thanawat Muangsawang
 */
@Service
public class CitizenServinceImpl implements CitizenService {

    CitizenRepository citizenRepository;

    public CitizenServinceImpl(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    @Override
    public Citizen createCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

}
