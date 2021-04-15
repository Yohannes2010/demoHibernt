package com.example.demo.controllers;

import com.example.demo.models.Kompis;
import com.example.demo.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/kompis")
public class MainController {
    @Autowired
    private KompisRepository kompisRepo;
    @GetMapping(path="/addk")
    public String addKompis(@RequestParam String name,@RequestParam String email,
                            @RequestParam String telefonnummer){
        Kompis kom=new Kompis();
        kom.setName(name);
        kom.setEmail(email);
        kom.setTelefonnummer(telefonnummer);
        kompisRepo.save(kom);
        return "Kompis was saved";
    }
    @GetMapping(path="/all")
    public Iterable<Kompis>addKompis(){
        return kompisRepo.findAll();
    }
    /*
    @GetMapping(path="/byname")
    public Iterable<Kompis>addKompiss(){
        return kompisRepo.findByName("John");
    }
    */

}
