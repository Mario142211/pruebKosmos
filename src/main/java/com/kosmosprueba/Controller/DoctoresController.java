package com.kosmosprueba.Controller;


import com.kosmosprueba.Service.IDoctoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/prueba/Doctores")
@CrossOrigin("*")
public class DoctoresController {
    @Autowired
    private IDoctoresService iDoctoresService;
}
