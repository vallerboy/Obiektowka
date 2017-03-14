package pl.akademiakodu;

import pl.akademiakodu.zadanie5.Guarantee;
import pl.akademiakodu.zadanie5.Product;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by OskarPraca on 2017-03-14.
 */
public class Main {
    public static void main(String[] args) {

//        List<Osoba> osobaList = new ArrayList<>();
//        osobaList.add(new Osoba("Oskar","Polak", 27, 2));
//        osobaList.add(new Osoba("Adam","Rokowski", 67, 2));
//        osobaList.add(new Osoba("Karolina","Polak", 18, 1));
//        osobaList.add(new Osoba("Konczita","Wurst", 18, 0));
//
//        for(Osoba osoba : osobaList) {
//            if(osoba.getGender() == 0) {
//                System.out.println("Imię: " + osoba.getName());
//            }
//        }

        //////////////////////////////////////////////////////////////


//        List<Car> carList = new ArrayList<>();
//        carList.add(new Car("BWM", "E36", 8000.0));
//        carList.add(new Car("FORD", "FOCUS", 4000.0));
//        carList.add(new Car("AUDI", "A4", 16000.0));
//
//        for(Car car : carList) {
//           car.show();
//        }


        ///////////////////////////////////////////////////////////////

//        List<Player> playerList = new ArrayList<>();
//        playerList.add(new Player("Oskar", "hajt", 124));
//        playerList.add(new Player("Adam", "maczupikczu", 50));
//        playerList.add(new Player("Dorota", "dorciaszek", 87));
//
//        Game game = new Game("Deadmatch", playerList);
//
//        Player graczKtoryWygral = game.getWinner();
//
//        System.out.println("Wygrywający: " + game.getWinner().getFullName());

        ////////////////////////////////////////////////////////////////////////

        LocalDate dateGuarantee = LocalDate.now();
        dateGuarantee = dateGuarantee.minus(Period.ofYears(1));

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Drukarka", "Ladnie drukuje","Szybko drukuje"));
        productList.add(new Product("Laptop", "Czarny laptop","Dziala ze az strach"));
        productList.add(new Product("Samochod", "bialy","Niemiec plakal jak sprzedawal"));


        Guarantee guarantee1 = new Guarantee(productList.get(0), dateGuarantee);
        Guarantee guarantee2 = new Guarantee(productList.get(1), dateGuarantee);
        Guarantee guarantee3 = new Guarantee(productList.get(2), dateGuarantee);

        System.out.println("Czy gwarancja w produkcie1 obowiązuje?: " + guarantee1.isVaild());
        System.out.println("Czy gwarancja w produkcie2 obowiązuje?: " + guarantee2.isVaild());
        System.out.println("Czy gwarancja w produkcie3 obowiązuje?: " + guarantee3.isVaild());

    }
}
