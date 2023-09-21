package com.lic.package.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.package.model.Apponintee;
import com.lic.package.repository.ApponinteeRepository;
import com.lic.package.service.ApponinteeService;

@RestController
public class ApponinteeController {
    
    @Autowired
    private ApponinteeService apponinteeService;

    @PostMapping("/appointee/create")
    public void createNewAppointee(@RequestBody Apponintee appointee) {
        apponinteeService.createNewAppointee(appointee);
    }

    @PostMapping("/appointee/update")
    public void updateAppointee(@RequestBody Apponintee appointee) {
        apponinteeService.updateAppointee(appointee);
    }
    
    @GetMapping("/appointee/all")
    public List<Apponintee> getAllAppointees() {
        return apponinteeService.getAllAppointees();
    }
}