package com.example.demo.DataHolder;

import com.example.demo.model.Apteka;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

   public static List<Apteka> apteki= new ArrayList<>();

    @PostConstruct
    public void baza()
    {
        apteki.add(new Apteka("Zegin Skopje","Zegin","Skopje22"));
        apteki.add(new Apteka("Zegin Bitola","Zegin","Bitola 54"));
        apteki.add(new Apteka("Eurofarm Kumanovo","Eurofarm","Kumanovo 332"));
        apteki.add(new Apteka("Zegin Ohrid","Zegin","Ohrid 600"));
        apteki.add(new Apteka("Eurofarm Bitola","Eurofarm","Bitola 22"));

    }



}
