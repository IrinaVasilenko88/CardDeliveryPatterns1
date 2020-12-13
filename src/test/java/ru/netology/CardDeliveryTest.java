package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardDeliveryTest {
    @BeforeEach
    void setUp() {
        open("http://localhost:9999");
    }

    @Test
    void shouldRegister(){
        DataGenerator dataGenerator= new DataGenerator();
        $("[data-test-id=city] input").setValue(DataGenerator.generateRequest("ru").getCity());
        String s = LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        $("[placeholder='Дата встречи']").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[placeholder='Дата встречи']").setValue(s);
        $("[name='name']").setValue(DataGenerator.generateRequest("ru").getName());
        $("[name='phone']").setValue(DataGenerator.generateRequest("ru").getPhone());
        $("[data-test-id=agreement]").click();
        $("[class='button__text']").click();
        $("[data-test-id=notification]").waitUntil(visible, 15000)
                .shouldHave(exactText("Успешно! Встреча успешно забронирована на "+s));



    }
}
