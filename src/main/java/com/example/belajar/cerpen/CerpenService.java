package com.example.belajar.cerpen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CerpenService {
    
    @Autowired
    CerpenRepository repository;

    public List<Cerpen> getAll(){
        List<Cerpen> response = repository.findAll();

        return response;
    }

    public Cerpen add(Cerpen cerpen){
        return repository.save(cerpen);
    }

    public List<Cerpen> search(){
        return null;
    }
}
