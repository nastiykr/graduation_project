package tests.web;

import annotations.JiraIssue;
import annotations.Layer;
import annotations.Microservice;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import tests.TestBase;

@Layer("rest")
@Owner("c05-ebogdanovaa")
@Feature("Карточка продукта")
public class OzonWebTests extends TestBase {

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Microservice("")
    @Feature("Главная страница")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка заголовка")
    public void checkMainPageTitle() {
        mainSteps.openMainPage();
        mainSteps.checkTitle();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Главная страница")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка автоматически выбранного региона")
    public void checkRegion() {
        mainSteps.openMainPage();
        mainSteps.checkRegion();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Главная страница")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка разделов")
    public void checkTopBar() {
        mainSteps.openMainPage();
        mainSteps.checkTopBar();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Главная страница")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка категорий")
    public void checkCategoriesTopBar() {
        mainSteps.openMainPage();
        mainSteps.checkTopBarCategories();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Главная страница")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка поиска позиции")
    public void checkFoundedPosition() {
        mainSteps.openMainPage();
        mainSteps.search();
        mainSteps.checkNamePosition();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о коде продукта")
    public void checkProductCode() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkProductCode();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наименования продукта")
    public void checkProductName() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkProductName();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия кнопки 'Добавить в корзину'")
    public void checkAddToCartButton() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkAddToCartButton();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия ссылки 'Перейти к описанию'")
    public void checkGoToDescriptionLink() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkGoToDescriptionLink();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия описания продукта")
    public void checkDescriptionProduct() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkDescription();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия комплектации продукта")
    public void checkEquipmentProduct() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkEquipment();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о диогонале")
    public void checkDiagonalPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkDiagonalPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации об оперативной памяти")
    public void checkRamPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkRamPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации об оперативной памяти")
    public void checkBuiltInMemoryPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkBuiltInMemoryPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о разрешении основной камеры")
    public void checkMainCameraResolution() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkMainCameraResolutionPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о разрешении основной процессоре")
    public void checkProcessorPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkProcessorPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о разрешении экрана")
    public void checkResolutionPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkResolutionPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о технологии матрицы")
    public void checkMatrixTechnologyPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkMatrixTechnologyPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации об основном материале")
    public void checkMainMaterialPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkMainMaterialPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о весе продукта")
    public void checkWeightPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkWeightPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о гарантии продукта")
    public void checkGuaranteePhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkGuaranteePhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о бренде продукта")
    public void checkBrandPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkBrandPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о размере продукта")
    public void checkSizePhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkSizePhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о функции камеры продукта")
    public void checkCameraFunctionPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkCameraFunctionPhone();
    }

    @Test
    @AllureId("0000")
    @JiraIssue("QC5-7")
    @Feature("Страница продукта")
    @Tags({@Tag("regress"), @Tag("web")})
    @DisplayName("Проверка наличия информации о версии продукта")
    public void checkVersionIosPhone() {
        mainSteps.openMainPage();
        mainSteps.search();
        productCardSteps.openProductCard();
        productCardSteps.checkVersionIosPhone();
    }
}
