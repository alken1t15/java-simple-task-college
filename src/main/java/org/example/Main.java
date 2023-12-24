package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Bank bank = new Bank();
//        bank.setName("Каспи");
//        Filial filial = new Filial();
//        filial.setName("Республика 5");
//        filial.setTotalCount(250000);
//        Filial filial2 = new Filial();
//        filial2.setName("Абая 54");
//        filial2.setTotalCount(190000);
//        Vklad vklad = new Vklad();
//        vklad.setFio("Царева Анастасия Артёмовна");
//        vklad.setSummary(25000);
//        Vklad vklad2 = new Vklad();
//        vklad2.setFio("Юдин Фёдор Михайлович");
//        vklad2.setSummary(25670);
//        Vklad vklad3 = new Vklad();
//        vklad3.setFio("Котов Даниил Михайлович");
//        vklad3.setSummary(75000);
//        System.out.println(bank);
//        System.out.println(filial);
//        System.out.println(filial2);
//        System.out.println(vklad);
//        System.out.println(vklad2);
//        System.out.println(vklad3);
        //TODO 2
        Bank bank = new Bank();

        Filial filia = new Filial();
        filia.setName("Республика 5");

        Vklad vklad = new Vklad();
        vklad.setFio("Царева Анастасия Артёмовна");
        vklad.setSummary(25000);
        vklad.setFilial(filia);

        Vklad vklad2 = new Vklad();
        vklad2.setFio("Юдин Фёдор Михайлович");
        vklad2.setSummary(25670);
        vklad2.setFilial(filia);

        filia.add(vklad);
        filia.add(vklad2);

        Filial filial2 = new Filial();
        filial2.setName("Абая 54");

        Vklad vklad3 = new Vklad();
        vklad3.setFio("Котов Даниил Михайлович");
        vklad3.setSummary(75000);
        vklad3.setFilial(filial2);

        Vklad vklad4 = new Vklad();
        vklad4.setFio("Морозов Кирилл Тимофеевич");
        vklad4.setSummary(90000);
        vklad4.setFilial(filial2);

        filial2.add(vklad3);
        filial2.add(vklad4);

        bank.add(filia);
        bank.add(filial2);

        for (Vklad temp : filial2.getVklads()) {
            System.out.println(temp);
        }


        System.out.println("До пополнения");
        System.out.println(filial2.getTotalCount());
        List<Vklad> filials = filial2.getVklads();
        filials.get(0).setSummary(50000);
        System.out.println("После");
        System.out.println(filial2.getTotalCount());

        Vklad vklad1 = bank.findByFIO("Котов Даниил Михайлович");
        if (vklad1 != null) {
            System.out.println("Сумма вклада: " + vklad.getSummary());
            System.out.println("Находится в филиале: " + vklad.getFilial());
        }
        else {
            System.out.println("Нету такого пользователя");
        }

    }
}