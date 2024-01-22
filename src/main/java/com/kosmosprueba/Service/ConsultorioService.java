package com.kosmosprueba.Service;

import com.kosmosprueba.Model.ConsultorioModel;
import com.kosmosprueba.Model.DoctoresModel;
import com.kosmosprueba.Repository.ConsultorioRepository;
import com.kosmosprueba.Repository.DoctoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioService implements IConsultorioService{

    @Autowired
    private ConsultorioRepository consultorioRepository;
    @Override
    public List<ConsultorioModel> findAll() {
        List<ConsultorioModel> list;
        try {
            list=consultorioRepository.findAll();

        }catch (Exception ex){
            throw ex;
        }
        return list;
    }

    @Override
    public int save(ConsultorioModel consul) {
        int row;
        try {
            row=consultorioRepository.save(consul);

        }catch (Exception ex){
            throw ex;
        }
        return row;
    }

    @Override
    public int update(ConsultorioModel consul) {
        int row;
        try {
            row=consultorioRepository.update(consul);

        }catch (Exception ex){
            throw ex;
        }
        return row;
    }
}
