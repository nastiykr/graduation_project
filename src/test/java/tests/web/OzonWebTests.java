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
        productCardSteps.openProductCard();
        productCardSteps.checkVersionIosPhone();
    }
}
