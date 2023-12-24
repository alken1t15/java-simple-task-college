package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filial {
    private Bank bank;

    private List<Vklad> vklads;
    private String name;

    private long totalCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotalCount() {
        if (vklads != null){
            totalCount = 0;
            for (Vklad v : vklads){
                totalCount += v.getSummary();
            }
        }
        return totalCount;
    }

    public Bank getBank() {
        return bank;
    }

    public List<Vklad> getVklads() {
        return vklads;
    }

    public void add(Vklad vklad){
        if (vklads==null){
            vklads = new ArrayList<>();
        }
        totalCount = getTotalCount() + vklad.getSummary();
        vklads.add(vklad);
    }

    private void delete(Vklad vklad){
        vklads.remove(vklad);
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "name='" + name + '\'' +
                ", totalCount=" + totalCount +
                '}';
    }
}