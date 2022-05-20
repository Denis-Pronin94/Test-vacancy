## Тестирование UI сайта компании "Расчетные системы"
#### российский разработчик и интегратор, входит в Группу Т1
> <a target="_blank" href="https://tprs.ru/">Ссылка на главную страницу сайта</a>


###  Содержание:

- [Технологии и инструменты](#techno-технологии-и-инструменты)
- [Реализованные проверки](#control-Реализованные-проверки)
- [Сборка в Jenkins](#jenkins-Jenkins-job)
- [Запуск из терминала](#terminal-Запуск-тестов-из-терминала)
- [Allure отчет](#report-Allure-отчет)
- [Отчет в Telegram](#telegram-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

<a name="techno-технологии-и-инструменты"></a>
###  Проект реализован с использованием
IntelliJ IDEA Java Gradle Selenide Selenoid JUnit5 Jenkins Allure Report Allure TestOps Telegram Jira
<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

<a name="control-Реализованные-проверки"></a>
###  Список проверок, реализованных в автотестах
- [x] Проверка заголовка на главной странице
- [x] Переключение кнопок в шапке сайта
- [x] На вкладке "Проекты" проверка кнопки "Offline"
- [x] Проверка адреса на вкладке "Контакты"
- [x] Проверка появления поп-апа "Напишите нам"

<a name="jenkins-Jenkins-job"></a>
###   Сборка в Jenkins
### <img width="6%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/Test-vacancy/)
*Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать с параметрами*</strong></code> и указать значения параметров.*

<p align="center">
  <img src="images/screens/Jenkins.png" alt="job" width="900">
</p>

### Удаленный запуск тестов

```bash
gradle clean test 
-Dbrowser=${BROWSER} 
-DbrowserVersion=${BROWSER_VERSION} 
-DbrowserSize=${BROWSER_SIZE} 
-DselenoidServer=${SELENOID_SERVER}
```

### Параметры сборки

> <code>BROWSER</code> – браузер, в котором будут выполняться тесты.
>
> <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты.
>
> <code>BROWSER_SIZE</code> – разрешени окна браузера, в котором будут выполняться тесты.
>
> <code>SELENOID_SERVER</code> – адрес удаленного сервера, на котором будут запускаться тесты.
>

<a name="terminal-Запуск-тестов-из-терминала"></a>
### :terminal: Запуск из терминала
```bash
gradle clean test
```

<a name="report-Allure-отчет"></a>
### :report:  Allure Reports отчет
### <img width="6%" title="Jenkins" src="images/logo/Jenkins.svg"> Запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/Test-vacancy/)
<p align="center">
  <img src="images/screens/AllureTestOps.png" alt="job" width="900">
</p>

<p align="center">
  <img src="images/screens/AllureTestOps2.png" alt="job" width="900">
</p>

<a name="telegram-Уведомление-в-Telegram-при-помощи-бота"></a>
### :telegram: Отчет в Telegram

<p align="center">
  <img src="images/screens/telegram.png" alt="job" width="600">
</p>

<a name="earth_africa-Примеры-видео-о-прохождении-тестов"></a>
### Видео прохождения тестов

> К каждому тесту в отчете прилагается видео.
<p align="center">
  <img title="Selenoid Video" src="images/screens/tprs.gif" >
</p>


:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a># Test-vacancy