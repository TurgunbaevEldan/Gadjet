package gadjeterium;

import gadjeterium.db.DataBase;
import gadjeterium.enums.Category;
import gadjeterium.model.Model;
import gadjeterium.service.Service;
import gadjeterium.service.ServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Service service = new ServiceImpl(dataBase);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    System.out.println(service.addModel(new Model(1L, 20000, 20, LocalDate.now(), Category.PHONE)));
                    System.out.println(service.addModel(new Model(2L, 30000, 13, LocalDate.now(), Category.LAPTOP)));
                    System.out.println(service.addModel(new Model(3L, 40000, 15, LocalDate.now(), Category.PHONE)));
                    System.out.println(service.addModel(new Model(4L, 50000, 17, LocalDate.now(), Category.LAPTOP)));
                    break;
                case 2:
                    System.out.println(service.getAllModel());
                    break;
                case 3:
                    service.getModelById(6L);
                    break;
                case 4:
                    service.deleteModelsById(1L);
                    break;
                case 5:
                    System.out.println(service.searchById(3L));
                    break;
                case 6:
                    System.out.println(service.categoryChoice(2000));
                    break;
                case 7:
                    System.out.println(service.sortByPrice());
                case 8:
                    System.out.println(service.filter(Category.LAPTOP));
            }
        }
    }
}