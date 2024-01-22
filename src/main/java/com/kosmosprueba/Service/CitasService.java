package com.kosmosprueba.Service;

import com.kosmosprueba.Model.CitasModel;
import com.kosmosprueba.Model.ConsultorioModel;
import com.kosmosprueba.Repository.CitasRepository;
import com.kosmosprueba.Repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CitasService implements iCitasService{
    @Autowired
    private CitasRepository citasRepository;
    @Override
    public List<CitasModel> findAll() {
        List<CitasModel> list;
        try {
            list=citasRepository.findAll();

        }catch (Exception ex){
            throw ex;
        }
        return list;
    }

    @Override
    public int save(CitasModel cita) {
        int row;
        try {
            row=citasRepository.save(cita);

        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int update(CitasModel cita) {
        int row;
        try {
            row=citasRepository.update(cita);

        }catch (Exception ex){
            throw ex;
        }
        return row;
    }
}
