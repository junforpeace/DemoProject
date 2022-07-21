# Project with automated tests for Mercadona web app (desktop)
[Mercadona web page](https://www.mercadona.es/)
![image](https://user-images.githubusercontent.com/65370123/180198794-47f0d92e-321a-4890-ae74-431a715fc8ec.png)

# Jenkins job
[JENKINS](https://jenkins.autotests.cloud/job/Student12_Diplom_DemoProject/)
![image](https://user-images.githubusercontent.com/65370123/180200201-86bbc089-6907-4a0d-8c20-423c930c7cee.png)


# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 99.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```


###### For further development there are some example tests in src/test/java/cloud.autotests/tests/demowebshop
* remove @Disabled("...") annotation to run tests
```bash
gradle clean demowebshop
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
