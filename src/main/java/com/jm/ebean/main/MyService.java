package com.jm.ebean.main;

import com.jm.ebean.model.Car;
import com.jm.ebean.model.Engine;
import com.jm.ebean.model.query.QCar;
import com.jm.ebean.model.query.QEngine;
import io.ebean.Database;
import io.ebean.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyService {
    private final Database database;


    public void addEngine() {
        Engine engine = new Engine(); // tworzenie nowego obiektu
        engine.setName("Nowy Silnik"); //ustawienie nazwy
        engine.setPower(223.4); //ustawienie mocy
        engine.save(); //użycie Ebeanowej metody save()
    }
    public void select(){
        var allCars = new QCar().findList(); // lista wszystkich obiektów
        var carName = new QCar().name.equalTo("Porshe").findList(); // obiekty z nazwą „Porshe”
        var carNameOrId = new QCar().name.equalTo("Porshe").or().id.equalTo(1).findOne();
        // obiekt z nazwą „Porshe” lub o id 1;
        var countCar = new QCar().findCount(); //liczba wszystkich obiektów
    }

    @Transactional
    public void removeEngineTrans(int id) {
        Engine engine = new QEngine().id.equalTo(id).findOne();
        if(engine != null) {
            engine.delete();
        }
        database.find(Car.class).where().idEq(10).delete();
    }
    public void removeEngine(int id) {
        Engine engine = new QEngine().id.equalTo(id).findOne(); //wyszukanie obiektu w bazie danych
        if(engine != null) { // sprawdzenie czy obiekt został znaleziony w bazie danych
            engine.delete(); //usunięcie obiektu z bazy danych
        }
    }

    public void updateEngine(int id) {
        Engine engine = new QEngine().id.equalTo(id).findOne(); //wyszukanie obiektu w bazie danych
        if(engine != null) { // sprawdzenie czy obiekt został znaleziony w bazie danych
            engine.setPower(232.0); //zmiana atrybutu obiektu
            engine.update(); //zapisanie zmian w bazie danych
        }
    }

}
