package com.testedti.pages.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void digitarEmail(String email) {

        driver.findElement(By.id("email")).sendKeys(email);
    }

    public void digitarSenha(String senha) {

        driver.findElement(By.id("passwd")).sendKeys(senha);
    }

    public void clicarBotaoSingIn() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    public void verificarPaginaInicial() {
        // Verifica se o usuário foi redirecionado para a página inicial
        WebElement texto = driver.findElement(By.xpath("//span[text()='Rodrigo Lacerda']"));
        String textoObtido = texto.getText();
        String textoEsperado = "Rodrigo Lacerda";
        assertEquals(textoEsperado, textoObtido);
    }

    public void verificarMsgAuthenticationFailed(String mensagemExibida) {
        // Verifica se a mensagem de falha de autenticação é exibida
        WebElement texto = driver.findElement(By.xpath("//li[text()='" + mensagemExibida + "']"));
        String textoObtido = texto.getText();
        String textoEsperado = "Authentication failed.";
        assertEquals(textoEsperado, textoObtido);
    }

    public void VerificaMsgInvalidPassword(String mensagemExibida) {
        // Verifica se a mensagem de senha inválida é exibida
        WebElement texto = driver.findElement(By.xpath("//li[text()='" + mensagemExibida + "']"));
        String textoObtido = texto.getText();
        String textoEsperado = "Invalid password.";
        assertEquals(textoEsperado, textoObtido);
    }

    public void clicarBotaoForgotYourPassword() {
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
    }

    public void verificarPaginaRecuperarSenha() {
        // Verifica se o usuário foi redirecionado para a página de recuperação de senha
        WebElement texto = driver.findElement(By.cssSelector("#form_forgotpassword label"));
        String textoObtido = texto.getText();
        String textoEsperado = "Email address";
        assertEquals(textoEsperado, textoObtido);
    }

    public void verificarMsgAnEmailAddressRequired() {
        // Verifica se a mensagem de email obrigatório é exibida
        WebElement texto = driver.findElement(By.cssSelector("#center_column li"));
        String textoObtido = texto.getText();
        String textoEsperado = "An email address required.";
        assertEquals(textoEsperado, textoObtido);
    }

}
