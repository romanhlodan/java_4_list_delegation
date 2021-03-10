package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

//        є класс авто
//поля
// - модель
// - рік
// - номер
// - Двигун (к)
//  - модель
//  - об'єм
//  - кінські сили
// - Колесо (к)
//  -виробник
//  -діаметр
//
//Створити колекцію автівок
//Пройтись по коллекції, всі автівки які меньше 2000 року скопіювати в окоему коллекцію, яка буде посортована
//по року автівок в зростанні
//Всі автівки , старіше 2000 року скопіювати в коллекцію ,яка буде посортована по року та спаданню
//
//"Склеїти " ці дві коллекції  в одну

        Car opel = new Car("Opel", 2009, "ВС6554КХ","Z17DTJ",1.7,110,"Opel",16);
        Car renault = new Car("Renault", 2010, "ВС6460ЕТ", "JE19DRT", 1.5, 110, "Renault", 16);
        Car bmw = new Car("BMW", 1999, "КА1956АР", "DR43", 2.5, 200, "BBC", 18);
        Car audi = new Car("Audi", 2000, "ВС4321КФ", "Qwa43", 3.2, 260, "Audi", 16);
        Car kia = new Car("Kia", 2012, "НС9487АО", "Ki342", 2.4, 190, "Kia", 17);
        Car vw = new Car("Volkswagen", 1992, "АР4532ДЛ", "VK34W", 1.3, 85, "Vaz", 13);
        Car peugeot = new Car("Peugeot", 1995, "РА5846ДО", "Po45D", 1.6, 100, "Peugeot", 15);
        Car skoda = new Car("Skoda", 2016, "АТ4593УЦ", "SE216L", 2.0, 150, "Leon", 17);
        Car mb = new Car("MB", 1998, "КА5476ЦІ", "MD452W", 4.4, 300, "AMG", 20);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(opel);
        cars.add(renault);
        cars.add(bmw);
        cars.add(audi);
        cars.add(kia);
        cars.add(vw);
        cars.add(peugeot);
        cars.add(skoda);
        cars.add(mb);

        ArrayList<Car> cars1 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear()<2000){
                cars1.add(car);
            }
        }

        cars1.sort(Comparator.comparing(car -> car.getYear()));
//        System.out.println(cars1);

        ArrayList car1999 = new ArrayList();
        car1999.addAll(cars1);
//        System.out.println(car1999);



        ArrayList<Car> cars2 = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() >= 2000){
                cars2.add(car);
            }
        }
        
        cars2.sort(Comparator.comparing(car -> car.getYear()));
//        System.out.println(cars2);
        ArrayList car2000 = new ArrayList();
        car2000.addAll(cars2);
        ArrayList<Car> carall = new ArrayList<>();
        carall.addAll(car1999);
        carall.addAll(car2000);
        System.out.println(carall);




    }
}


