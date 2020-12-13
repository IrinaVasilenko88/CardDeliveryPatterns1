package ru.netology;

import com.github.javafaker.Faker;
import lombok.Data;

import java.util.Locale;
@Data

public class DataGenerator {
    DataGenerator() {
    }

    public static RequestInfo generateRequest(String locale) {
        Faker faker = new Faker(new Locale("ru"));
        return new RequestInfo(faker.address().city(),
                faker.name().fullName(),
                faker.phoneNumber().phoneNumber());

    }

        public static String GenerateCity(){

        }
}


