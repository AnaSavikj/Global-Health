package com.example.demo.Repository;

import com.example.demo.DataHolder.DataHolder;
import com.example.demo.model.Apteka;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AptekaRepository {

    public List<Apteka> findallPharmacy()
    {
        return DataHolder.apteki;
    }

    public List<Apteka> findbyC(String id)
    {
        List<Apteka> izbrani=new ArrayList<>();

        for(int i=0;i< DataHolder.apteki.size();i++)
        {
            if(DataHolder.apteki.get(i).getId().equals(id))
            {
                izbrani.add(DataHolder.apteki.get(i));
            }
        }
        return izbrani;
    }

}
