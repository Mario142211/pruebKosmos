package com.kosmosprueba.Controller;

import com.kosmosprueba.Model.ConsultorioModel;
import com.kosmosprueba.Model.DoctoresModel;
import com.kosmosprueba.Model.DoctoresResponse;
import com.kosmosprueba.Service.ConsultorioService;
import com.kosmosprueba.Service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/prueba/Consultorio")
@CrossOrigin("*")
public class ConsultorioController {
    @Autowired
    private ConsultorioService consultorioService;


    @GetMapping("/ConsultaConsultorios")
    public ResponseEntity<List<ConsultorioModel>> list(){
        var result= consultorioService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/GuardarConsultorios")
    public ResponseEntity<DoctoresResponse> save(@RequestBody ConsultorioModel consul){
        DoctoresResponse doctoresResponse= new DoctoresResponse();
        var result= consultorioService.save(consul);
        if (result ==1){
            doctoresResponse.setMessage("Item guardado con exito");
        }
        return new ResponseEntity<>(doctoresResponse, HttpStatus.OK);
    }

    @PostMapping("/ActualizarConsultorios")
    public ResponseEntity<DoctoresResponse> update(@RequestBody ConsultorioModel consul){
        DoctoresResponse doctoresResponse= new DoctoresResponse();
        var result= consultorioService.update(consul);
        if (result ==1){
            doctoresResponse.setMessage("Item actualizado con exito");
        }
        return new ResponseEntity<>(doctoresResponse, HttpStatus.OK);
    }
}
