package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Filial> filials;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Filial> getFilials() {
        return filials;
    }

    public void add(Filial filial){
        if (filials==null){
            filials = new ArrayList<>();
        }
        filials.add(filial);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                '}';
    }

    public Vklad findByFIO(String fio){
        for (Filial f : filials){
            List<Vklad> vklads = f.getVklads();
            for (Vklad v : vklads){
                if (v.getFio().equals(fio)){
                    return v;
                }
            }
        }
        return null;
    }
}