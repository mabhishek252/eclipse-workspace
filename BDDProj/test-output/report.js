$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/eclipse-workspace/BDDProj/src/main/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login CRM feature",
  "description": "",
  "id": "login-crm-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 60197465,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "CRM Login Test Scenario",
  "description": "",
  "id": "login-crm-feature;crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "When login section display",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter \"AbhishekMishra\" and \"abhi@123\"",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on logout button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.User_already_on_login_page()"
});
formatter.result({
  "duration": 15144896763,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.when_login_section_display()"
});
formatter.result({
  "duration": 207245523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AbhishekMishra",
      "offset": 12
    },
    {
      "val": "abhi@123",
      "offset": 33
    }
  ],
  "location": "LoginPage.user_enter_and(String,String)"
});
formatter.result({
  "duration": 571428327,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.click_on_login_button()"
});
formatter.result({
  "duration": 13883993755,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.user_on_Dashboard_page()"
});
formatter.result({
  "duration": 35632343,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.click_on_logout_button()"
});
formatter.result({
  "duration": 6056054528,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027noprint\u0027]//tr/td[4]/a\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027DESKTOP-FQMLFPA\u0027, ip: \u0027192.168.43.49\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:57771}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387), userDataDir\u003dC:\\Users\\Admin\\AppData\\Local\\Temp\\scoped_dir7372_14328}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003dignore, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d71.0.3578.98, browserConnectionEnabled\u003dfalse, proxy\u003dProxy(), nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 81ff3daac0f617fe97215f5aec2b52ca\n*** Element info: {Using\u003dxpath, value\u003d//div[@class\u003d\u0027noprint\u0027]//tr/td[4]/a}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat stepDefination.LoginPage.click_on_logout_button(LoginPage.java:85)\r\n\tat ✽.Then Click on logout button(C:/Users/Admin/eclipse-workspace/BDDProj/src/main/java/features/Login.feature:8)\r\n",
  "status": "failed"
});
});