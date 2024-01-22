package com.kosmosprueba.Controller;

import com.kosmosprueba.Model.CitasModel;
import com.kosmosprueba.Model.ConsultorioModel;
import com.kosmosprueba.Model.DoctoresResponse;
import com.kosmosprueba.Service.CitasService;
import com.kosmosprueba.Service.ConsultorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/prueba/Citas")
@CrossOrigin("*")
public class CitasController {
    @Autowired
    private CitasService citasService;


    @GetMapping("/ConsultaCitas")
    public ResponseEntity<List<CitasModel>> list(){
        var result= citasService.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/GuardarCitas")
    public ResponseEntity<DoctoresResponse> save(@RequestBody CitasModel citas){
        DoctoresResponse doctoresResponse= new DoctoresResponse();
        var result= citasService.save(citas);
        if (result ==1){
            doctoresResponse.setMessage("Item guardado con exito");
        }
        return new ResponseEntity<>(doctoresResponse, HttpStatus.OK);
    }

    @PostMapping("/ActualizarCitas")
    public ResponseEntity<DoctoresResponse> update(@RequestBody  CitasModel citas){
        DoctoresResponse doctoresResponse= new DoctoresResponse();
        var result= citasService.update(citas);
        if (result ==1){
            doctoresResponse.setMessage("Item actualizado con exito");
        }
        return new ResponseEntity<>(doctoresResponse, HttpStatus.OK);
    }
}
