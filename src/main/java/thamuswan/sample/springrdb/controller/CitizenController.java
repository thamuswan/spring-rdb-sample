/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thamuswan.sample.springrdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thamuswan.sample.springrdb.controller.request.CitizenRequest;
import thamuswan.sample.springrdb.model.Citizen;
import thamuswan.sample.springrdb.service.CitizenService;

/**
 *
 * @author Thanawat Muangsawang
 */
@RestController()
@RequestMapping("citizen")
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @PostMapping()
    public Citizen createCitizen(@RequestBody CitizenRequest citizenRequest) {
        return null; // TODO
    }

}
