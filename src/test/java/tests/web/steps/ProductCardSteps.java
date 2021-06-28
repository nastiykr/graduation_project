package tests.web.steps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class ProductCardSteps {

    public void openProductCard() {
        step("Перейти к найденной позиции", () -> {
            open("https://www.ozon.ru/product/smartfon-apple-iphone-11-128gb-chernyy-205771638");
        });
    }

    public void checkProductCode() {
        step("Проверить наличие информации о коде продукта", () -> {
            $(".b2d7.b2d9")
                    .shouldHave(text("Код товара: 105771638"));
        });
    }

    public void checkProductName() {
        step("Проверка наименования продукта", () -> {
            $("[data-widget = webProductHeading]")
                    .shouldHave(text("Смартфон Apple iPhone 11 128GB, черный"));
        });
    }

    public void checkAddToCartButton() {
        step("Проверить наличие кнопки 'Добавить в корзину'", () -> {
            $("._29hd._2XP7._1GB4._2w-L", 1)
                    .shouldHave(text("Добавить в корзину"));
        });
    }

    public void checkGoToDescriptionLink() {
        step("Проверить наличие ссылки 'Перейти к описанию'", () -> {
            $(".db3")
                    .shouldHave(text("Перейти к описанию"));
        });
    }

    public void checkDescription() {
        step("Проверить наличие описание продукта", () -> {
            $(".b0v2")
                    .shouldHave(text("Смартфон Apple iPhone 11 - ничего лишнего. Только самое. Новая система" +
                            " двух камер. Аккумулятор на целый день без подзарядки. Самое прочное стекло и самый " +
                            "быстрый процессор iPhone. Шесть отличных новых цветов. Впечатляющий ЖК‑дисплей Liquid " +
                            "Retina с диагональю 6,1 дюйма.2 Защита от воды при погружении на глубину до 2 метров до " +
                            "30 минут. Сверхширокоугольная камера (13 мм). Угол обзора 120° — область изображения в " +
                            "четыре раза больше. Широкоугольная камера (26 мм). Поддержка Focus Pixels на всей " +
                            "матрице. При слабом освещении объектив автоматически фокусируется до трёх раз быстрее. " +
                            "Снимайте видео 4K с частотой 60 кадров/с на любую камеру. Сверхширокоугольная камера, " +
                            "с которой область изображения в четыре раза больше. Редактировать видео — применять " +
                            "фильтры, поворачивать и кадрировать — так же легко, как и фотографии. Новый Ночной режим " +
                            "автоматически улучшает фотографии, снятые при слабом освещении, — будь то костёр на " +
                            "берегу озера или ужин при свечах. Аккумулятор на целый день без подзарядки. A13 Bionic " +
                            "— самый быстрый процессор iPhone. Поддержка быстрой зарядки с помощью адаптера 18 Вт " +
                            "(продаётся отдельно). Face ID — исключительно надёжная технология аутентификации по лицу. " +
                            "Изображение вашего лица нигде не хранится и никуда не передаётся. Эта технология надёжнее, " +
                            "чем Touch ID."));
        });
    }

    public void checkEquipment() {
        step("Проверить наличие комплектацию продукта", () -> {
            $(".b0v2", 1)
                    .shouldHave(text("Смартфон, кабель USB-C/Lightning, документация"));
        });
    }

    public void checkDiagonalPhone() {
        step("Проверить наличие информации о диогонале", () -> {
            $("#section-characteristics")
                    .shouldHave(text("6.1"));
        });
    }

    public void checkRamPhone() {
        step("Проверить наличие информации об оперативной памяти", () -> {
            $("#section-characteristics")
                    .shouldHave(text("4 ГБ"));
        });
    }

    public void checkBuiltInMemoryPhone() {
        step("Проверить наличие информации об встроенной памяти", () -> {
            $("#section-characteristics")
                    .shouldHave(text("128 ГБ"));
        });
    }

    public void checkMainCameraResolutionPhone() {
        step("Проверить наличие информации о разрешении основной камеры", () -> {
            $("#section-characteristics")
                    .shouldHave(text("12"));
        });
    }

    public void checkProcessorPhone() {
        step("Проверить наличие информации о процессоре", () -> {
            $("#section-characteristics")
                    .shouldHave(text("A13 Bionic (6 ядер), 2.65 ГГц"));
        });
    }

    public void checkResolutionPhone() {
        step("Проверить наличие информации о разрешении экрана", () -> {
            $("#section-characteristics")
                    .shouldHave(text("1792x828"));
        });
    }

    public void checkMatrixTechnologyPhone() {
        step("Проверить наличие информации о технологии матрицы", () -> {
            $("#section-characteristics")
                    .shouldHave(text("IPS"));
        });
    }

    public void checkMainMaterialPhone() {
        step("Проверить наличие информации об основном материале", () -> {
            $("#section-characteristics")
                    .shouldHave(text("Металл"));
        });
    }

    public void checkWeightPhone() {
        step("Проверить наличие информации о весе продукта", () -> {
            $("#section-characteristics")
                    .shouldHave(text("194"));
        });
    }

    public void checkGuaranteePhone() {
        step("Проверить наличие информации о гарантии продукта", () -> {
            $("#section-characteristics")
                    .shouldHave(text("1 год"));
        });
    }

    public void checkBrandPhone() {
        step("Проверить наличие информации о бренде продукта", () -> {
            $("#section-characteristics")
                    .shouldHave(text("Apple"));
        });
    }

    public void checkSizePhone() {
        step("Проверить наличие информации о размере продукта", () -> {
            $("#section-characteristics")
                    .shouldHave(text("150,9х75,7х8,3"));
        });
    }

    public void checkCameraFunctionPhone() {
        step("Проверить наличие информации о функции камеры продукта", () -> {
            $("#section-characteristics")
                    .shouldHave(text("Стабилизация изображения"));
        });
    }

    public void checkVersionIosPhone() {
        step("Проверить наличие информации о версии продукта", () -> {
            $("#section-characteristics")
                    .shouldHave(text("iOS 13"));
        });
    }
}
