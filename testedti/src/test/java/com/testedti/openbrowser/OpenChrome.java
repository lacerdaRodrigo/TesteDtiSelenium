package com.testedti.openbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenChrome {
    public static WebDriver initializeDriver() {
        // Configurando o WebDriver automático
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}