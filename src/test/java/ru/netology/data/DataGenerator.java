package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateDate(int shift) {
        String date = LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    public static String generateCity() {
        final String[] cities = {"Москва", "Тюмень", "Калининград", "Самара", "Уфа", "Казань"};
        Random random = new Random();
        int index = random.nextInt(cities.length);
        String city = cities[index];
        return city;
    }

    public static String generateName(String locale) {
        Faker faker = new Faker(new Locale(locale));
        String name = faker.name().fullName().replace('ё', 'е');
        return name;
    }

    public static String generatePhone(String locale) {
        Faker faker = new Faker(new Locale(locale));
        String phone = "+7" + String.valueOf(faker.number().randomNumber(10, true));
        return phone;
    }
}
