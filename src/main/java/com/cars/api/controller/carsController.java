package com.cars.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")
public class carsController {

    @PostMapping
    public void create(@RequestBody CarsDTO req) {
        System.out.println("modelo: " + req.modelo() + "\n" + "fabricante: " + req.fabricante() + "\n" + "valor: " + req.valor());
    }
}
