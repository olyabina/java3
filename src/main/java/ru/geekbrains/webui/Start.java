package ru.geekbrains.webui;

import java.util.ArrayList;

public class Start {

    private static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";
    private static final String STUDENT_LOGIN = "Applanatest";
    private static final String STUDENT_PASSWORD = "Student2020!";
    public static final WebDriver driver;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver = new ChromeDriver(options);
        driver.get(LOGIN_PAGE_URL);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        ((JavascriptExecutor) driver).executeScript("window.open()");

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowsHandles());

        driver.swithTo().window(tabs.get(1)); tabs: size = 2;

        driver.get(LOGIN_PAGE_URL);

        WebElement loginTextInput = driver.findElement(By.cssSelector("input[id='prependedInput']"));
        loginTextInput.sendKeys(STUDENT_LOGIN);
        Thread.sleep(1000);

        WebElement passwordTextInput = driver.findElement(By.cssSelector(".span2[name='_password']"));
        passwordTextInput.sendKeys(STUDENT_PASSWORD);
        Thread.sleep(1000);

        WebElement loginButton = driver.findElement(By.xpath(".//button[@name='_submit']"));
        loginButton.click();




        driver.quit();





    }


}
