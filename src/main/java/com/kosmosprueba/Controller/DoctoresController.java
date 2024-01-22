package com.kosmosprueba.Controller;


import com.kosmosprueba.Model.DoctoresModel;
import com.kosmosprueba.Model.DoctoresResponse;
import com.kosmosprueba.Service.DocService;
import com.kosmosprueba.Service.IDoctoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/prueba/Doctores")
@CrossOrigin("*")
public class DoctoresController {
    @Autowired
    private DocService iDoctoresService;


    @GetMapping("/ConsultaDoctores")
    public ResponseEntity<List<DoctoresModel>> list(){
        var result= iDoctoresService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/GuardarDoctores")
    public ResponseEntity<DoctoresResponse> save(@RequestBody DoctoresModel doctores){
        DoctoresResponse doctoresResponse= new DoctoresResponse();
        var result= iDoctoresService.save(doctores);
        if (result ==1){
            doctoresResponse.setMessage("Item guardado con exito");
        }
        return new ResponseEntity<>(doctoresResponse, HttpStatus.OK);
    }

    @PostMapping("/ActualizarDoctores")
    public ResponseEntity<DoctoresResponse> update(@RequestBody DoctoresModel doctores){
        DoctoresResponse doctoresResponse= new DoctoresResponse();
        var result= iDoctoresService.update(doctores);
        if (result ==1){
            doctoresResponse.setMessage("Item actualizado con exito");
        }
        return new ResponseEntity<>(doctoresResponse, HttpStatus.OK);
    }
}
