package pl.akademiakodu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Main {
    public static void main(String[] args) {

        List<Osoba> osobaList = new ArrayList<>();
        osobaList.add(new Osoba("Oskar","Polak", 27, 2));
        osobaList.add(new Osoba("Adam","Rokowski", 67, 2));
        osobaList.add(new Osoba("Karolina","Polak", 18, 1));
        osobaList.add(new Osoba("Konczita","Wurst", 18, 0));

    }
}
