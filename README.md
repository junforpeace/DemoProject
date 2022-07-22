# Project with automated tests for Mercadona web app (desktop)
[Mercadona web page](https://www.mercadona.es/)
![image](https://user-images.githubusercontent.com/65370123/180198794-47f0d92e-321a-4890-ae74-431a715fc8ec.png)

## :page_with_curl: Scope:

- <a href="#computer-сode_stack">Technology and tools</a>
- <a href="#clipboard-Test-cases">Test-cases</a>
- <a href="#Jenkins-job">Jenkins job</a>
- <a href="#keyboard-launch-from-terminal">Launch from terminal</a>
- <a href="#bar_chart-Test-results-report">Test results report</a>
- <a href="#robot-Telegram">Telegram Bot Notifications</a>
- <a href="#film_projector-Example-video-of-test-run-in-Selenoid">Example video of test-run in Selenoid</a>

## :computer: Technology and tools
<p align="left"> 
<img width="6%" title="Java" src="images/java-logo-vector.png">
<img width="10%" title="Selenide" src="images/selenide-logo-big.png">
<img width="6%" title="Allure Report" src="images/allurereport-logo.png">
<img width="6%" title="Gradle" src="images/gradle-knowledge-graph-logo.png">
<img width="6%" title="JUnit5" src="images/junit5-logo.png">
<img width="6%" title="IntelliJ IDEA" src="images/IntelliJ_IDEA_Icon.svg.png">
<img width="6%" title="Selenoid" src="images/selenoid-logo.png">
<img width="6%" title="GitHub" src="images/github-logo.png">
<img width="4%" title="Jenkins" src="images/jenkins-logo.png">
<img width="6%" title="Telegram" src="images/Telegram_2019_Logo.svg.png">
</p>

## :clipboard: Test-cases
- Check page console log for errors:heavy_check_mark:
- Check changing page's language :heavy_check_mark:
- Check main menu headers :heavy_check_mark:
- Check page title :heavy_check_mark:
- Check postal code settting :soon:

## <img width="4%" title="Allure Report" src="images/jenkins-logo.png"> Jenkins job
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

## <img width="4%" title="Allure Report" src="images/allurereport-logo.png"> Test results report [Allure Report](https://jenkins.autotests.cloud/job/Student12_Diplom_DemoProject/14/allure/)

### :pushpin: Overview page Allure-report

![image](https://user-images.githubusercontent.com/65370123/180204572-c68358b8-285f-458a-9577-744ce8d17815.png)

### :pushpin: Behavior page

![image](https://user-images.githubusercontent.com/65370123/180204881-6121bc72-95aa-4a01-ab15-81627ad6b970.png)


### :pushpin: Graph Page

![image](https://user-images.githubusercontent.com/65370123/180205230-8fdce665-70f7-4721-8de3-52b776ca6dc5.png)



## <img width="4%" title="Telegram" src="images/Telegram_2019_Logo.svg.png"> Telegram Bot Notifications

> When build is completed,  the message with test result is sent by bot created in <code>Telegram</code> automatically 

<img title="Telegram Notifications" src="images/telegramnotify.png">



## <img width="4%" title="Telegram" src="images/selenoid-logo.png"> Example video of test-run in Selenoid

Every test contains last screenshots, page source, browser console logs, video in attachments. One of this viedo can see below.
<p align="center">
<img title="Selenoid Video" src="images/для демо проекта.gif">
</p>
