# Project with automated tests for Mercadona web app (desktop)
[Mercadona web page](https://www.mercadona.es/)
![image](https://user-images.githubusercontent.com/65370123/180198794-47f0d92e-321a-4890-ae74-431a715fc8ec.png)

## :page_with_curl: Содержание:

- <a href="#computer-сode_stack">Технологии и инструменты</a>
- <a href="#clipboard-Test-cases">Test-cases</a>
- <a href="#Jenkins-job">Jenkins job</a>
- <a href="#keyboard-запуск-из-терминала">Запуск из терминала</a>
- <a href="#bar_chart-allure-отчет">Allure отчет</a>
- <a href="#robot-отчет-в-telegram">Отчет в Telegram</a>
- <a href="#film_projector-видео-пример-прохождения-тестов">Видео пример прохождения тестов</a>

## :computer: Technology and tools
<p align="left"> 
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

## :clipboard: Test-cases
- Проверка ошибок в консоли :heavy_check_mark:
- Проверка функциональности поиска :heavy_check_mark:
- Проверка доступности кнопок хедера на странице :heavy_check_mark:

## Jenkins job
[JENKINS](https://jenkins.autotests.cloud/job/Student12_Diplom_DemoProject/)
![image](https://user-images.githubusercontent.com/65370123/180200201-86bbc089-6907-4a0d-8c20-423c930c7cee.png)
![image](https://user-images.githubusercontent.com/65370123/180200851-987bedd8-f403-4138-a058-3a375efac674.png)


## :keyboard: Launch from terminal
Local launch:
```
gradle clean test
```


Remote launch:
```
clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteDriverUrl=https://${REMOTE_DRIVER_LOGIN}:${REMOTE_DRIVER_PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
```
### Build parameters

> <code>BROWSER</code> – browser, where test will run (_by deafult - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – browser's version (_by deafult - <code>100.0</code>_).
>
> <code>BROWSER_SIZE</code> – window size (_by deafult- <code>1920x1080</code>_).
> 
> <code>BROWSER_MOBILE</code> – mobile browser.
>
> <code>REMOTE_URL</code> – remote browser.
> 
> <code>LOGIN_REMOTE</code> –login selenoid.
> 
> <code>PASSWORD_REMOTE</code> – password selenoid.
> 
> <code>THREADS</code> – number of threads.

## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/Student12_Diplom_DemoProject/14/allure/)

### :pushpin: Overview page Allure-report

![image](https://user-images.githubusercontent.com/65370123/180204572-c68358b8-285f-458a-9577-744ce8d17815.png)

### :pushpin: Behavior page

![image](https://user-images.githubusercontent.com/65370123/180204881-6121bc72-95aa-4a01-ab15-81627ad6b970.png)


### :pushpin: Graph Page

![image](https://user-images.githubusercontent.com/65370123/180205230-8fdce665-70f7-4721-8de3-52b776ca6dc5.png)



## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом.
<p align="center">
<img title="Telegram Notifications" src="images/screenshots/telegram-report.png">
</p>

## <img width="4%" title="Telegram" src="images/logo/Selenoid.svg"> Пример запуска теста в Selenoid

К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
<img title="Selenoid Video" src="images/gif/video.gif">
</p>
