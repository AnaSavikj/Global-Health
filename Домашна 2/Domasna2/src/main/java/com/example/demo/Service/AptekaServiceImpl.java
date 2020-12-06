package com.example.demo.Service;

import com.example.demo.Repository.AptekaRepository;
import com.example.demo.model.Apteka;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AptekaServiceImpl  implements AptekaService{
    private final AptekaRepository aptekaRepository;

    public AptekaServiceImpl(AptekaRepository aptekaRepository) {
        this.aptekaRepository = aptekaRepository;
    }

    @Override
    public List<Apteka> findallPharmacy() {
     return   aptekaRepository.findallPharmacy();
    }

    @Override
    public List<Apteka> findbyC(String id) {
       return aptekaRepository.findbyC(id);
    }
}
