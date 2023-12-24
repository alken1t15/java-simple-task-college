package org.example;

public class Vklad {

    private Filial filial;
    private String fio;

    private int summary;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getSummary() {
        return summary;
    }

    public void setSummary(int summary) {
        this.summary = this.summary + summary;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    @Override
    public String toString() {
        return "Vklad{" +
                "fio='" + fio + '\'' +
                ", summary=" + summary +
                '}';
    }
}