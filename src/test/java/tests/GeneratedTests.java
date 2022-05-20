package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class GeneratedTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка заголовка на главной странице")
    void checkTitle() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.OpenMainPage();
        });

        step("Проверить заголовок", () -> {
            mainPage.TextHeadings("Пионеры в своём деле");
        });
    }

    @Test
    @DisplayName("Переключение кнопок в шапке сайта")
    void homePage() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.OpenMainPage();
        });

        step("Нажать Проекты", () -> {
            mainPage.MainProjects();
        });

        step("Нажать - Контакты", () -> {
            mainPage.MainContacts();
        });

        step("Нажать - Вакансии", () -> {
            mainPage.MainVacancy();
        });

        step("Нажать - Решения", () -> {
            mainPage.MainDecisions();
        });

        step("проверить текс", () -> {
            mainPage.TextSearch("Расчетные системы");
        });
    }

    @Test
    @DisplayName("На вкладке Проекты проверить кнопку Offline")
    void projectsOfflineName() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.OpenMainPage();
        });

        step("Перейти на вкладку Проекты", () -> {
            mainPage.MainProjects();
        });

        step("Нажать кнопку Offline", () -> {
            mainPage.OfflineClick();
        });

        step("Проверить название Offline проекта", () -> {
            mainPage.ProjectsOfflineName("Система оплаты штрафов ГИБДД в «АРМ сотрудника ДПС»");
        });
    }

    @Test
    @DisplayName("Проверка адреса на вкладке Контакты")
    void address() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.OpenMainPage();
        });

        step("Нажать - Контакты", () -> {
            mainPage.MainContacts();
        });

        step("Проверить адрес", () -> {
            mainPage.Address("ул. Радищева, д.39, офис 402");;
        });
    }

    @Test
    @DisplayName("Проверка появления поп-апа Напишите нам")
    void popUp() {

        step("Открыть сайт https://tprs.ru и проверить название", () -> {
            mainPage.OpenMainPage();
        });

        step("Нажать - Вакансии", () -> {
            mainPage.MainVacancy();
        });

        step("Нажать отправить резюме", () -> {
            mainPage.ResumeButton();
        });

        step("Проверка появления поп-апа Напишите нам", () -> {
            mainPage.CheckText("Напишите нам");
        });
    }
}
