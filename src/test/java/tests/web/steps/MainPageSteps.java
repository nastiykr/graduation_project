package tests.web.steps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MainPageSteps {

    public void openMainPage() {
        step("Открытие сайта ozon.ru", () -> {
            open("https://ozon.ru");
        });
    }

    public void checkTitle() {
        step("Проверить заголовок главной странице", () -> {
            $(byTitle("OZON — интернет-магазин. Миллионы товаров по выгодным ценам")).shouldBe();
        });
    }

    public void checkRegion() {
        step("Проверить автоматически выбранный регион", () -> {
            $(".c4u4._2avF").shouldHave(text("Москва"));
        });
    }

    public void checkTopBar() {
        step("Проверить наличие раздела 'Покупайте как юрлицо' в верхнем меню", () -> {
            $(".a0k9.c4w5.c4w6").shouldHave(text("Покупайте как юрлицо"));
        });

        step("Проверить наличие раздела 'Мобильное приложение'", () -> {
            $(".a0k9.c4w5", 1).shouldHave(text("Мобильное приложение"));
        });

        step("Проверить наличие раздела 'Реферальная программа'", () -> {
            $(".a0k9.c4w5", 2).shouldHave(text("Реферальная программа"));
        });

        step("Проверить наличие раздела 'Зарабатывай с Ozon'", () -> {
            $(".a0k9.c4w5", 3).shouldHave(text("Зарабатывай с Ozon"));
        });

        step("Проверить наличие раздела 'Подарочные сертификаты'", () -> {
            $(".a0k9.c4w5", 4).shouldHave(text("Подарочные сертификаты"));
        });

        step("Проверить наличие раздела 'Пункты выдачи'", () -> {
            $(".a0k9.c4w5", 5).shouldHave(text("Пункты выдачи"));
        });

        step("Проверить наличие раздела 'Постаматы'", () -> {
            $(".a0k9.c4w5", 6).shouldHave(text("Постаматы"));
        });

        step("Проверить наличие раздела 'Помощь'", () -> {
            $(".a0k9.c4w5", 7).shouldHave(text("Помощь"));
        });

        step("Проверить наличие раздела 'Бесплатная доставка'", () -> {
            $(".a0k9.c4w5", 8).shouldHave(text("Бесплатная доставка"));
        });
    }

    public void checkTopBarCategories() {
        step("Проверить наличие категории 'TOP Fashion' в верхнем меню", () -> {
            $(".a0k9.c6d1").shouldHave(text("TOP Fashion"));
        });

        step("Проверить наличие категории 'Premium'", () -> {
            $(".a0k9.c6d1", 1).shouldHave(text("Premium"));
        });

        step("Проверить наличие категории 'Ozon Travel'", () -> {
            $(".a0k9.c6d1", 2).shouldHave(text("Ozon Travel"));
        });

        step("Проверить наличие категории 'Ozon Express'", () -> {
            $(".a0k9.c6d1", 3).shouldHave(text("Ozon Express"));
        });

        step("Проверить наличие категории 'Ozon Card'", () -> {
            $(".a0k9.c6d1", 4).shouldHave(text("Ozon Card"));
        });

        step("Проверить наличие категории 'LIVE'", () -> {
            $(".a0k9.c6d1", 5).shouldHave(text("LIVE"));
        });

        step("Проверить наличие категории 'Акции'", () -> {
            $(".a0k9.c6d1", 6).shouldHave(text("Акции"));
        });

        step("Проверить наличие категории 'Бренды'", () -> {
            $(".a0k9.c6d1", 7).shouldHave(text("Бренды"));
        });

        step("Проверить наличие категории 'Магазины'", () -> {
            $(".a0k9.c6d1", 8).shouldHave(text("Магазины"));
        });

        step("Проверить наличие категории 'Электроника'", () -> {
            $(".a0k9.c6d1", 9).shouldHave(text("Электроника"));
        });

        step("Проверить наличие категории 'Одежда и обувь'", () -> {
            $(".a0k9.c6d1", 10).shouldHave(text("Одежда и обувь"));
        });

        step("Проверить наличие категории 'Детские товары'", () -> {
            $(".a0k9.c6d1", 11).shouldHave(text("Детские товары"));
        });

        step("Проверить наличие категории 'Дом и сад'", () -> {
            $(".a0k9.c6d1", 12).shouldHave(text("Дом и сад"));
        });

        step("Проверить наличие категории 'Услуги'", () -> {
            $(".a0k9.c6d1", 13).shouldHave(text("Услуги"));
        });

        step("Проверить наличие категории 'Dисконт'", () -> {
            $(".a0k9.c6d1", 14).shouldHave(text("Dисконт"));
        });
    }

    public void search() {
        step("Поиск позиции", () -> {
            $(byName("search")).setValue("Смартфон Apple iPhone 11 128GB, черный").pressEnter();

            $("[aria-label = 'Поиск']").parent().click();
        });
    }

    public void checkNamePosition() {
        step("Проверка наименования продукта", () -> {
            $(".widget-search-result-container.ao3")
                    .shouldHave(text("Смартфон Apple iPhone 11 128GB, черный"));
        });
    }
}
