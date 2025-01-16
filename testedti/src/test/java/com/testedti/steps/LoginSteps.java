package com.testedti.steps;

import org.openqa.selenium.WebDriver;

import com.testedti.openbrowser.OpenChrome;
import com.testedti.pages.login.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    String Url = "http://automationpractice.pl/index.php?controller=authentication&back=my-account";

    @Before
    public void abrirBrowser() {

        driver = OpenChrome.initializeDriver();
        loginPage = new LoginPage(driver);
    }

    @Dado("que acesso a página de login da pagina 'automation practice'")
    public void que_acesso_a_página_de_login_da_pagina() {

        driver.get(Url);
    }

    @Quando("o usuário preencher os campos de email com {string} e senha com {string}")
    public void o_usuario_preencher_os_campos_de_email_com_e_senha_com(String email, String senha) {

        loginPage.digitarEmail(email);
        loginPage.digitarSenha(senha);
    }

    @Quando("clicar em \"Sign in\"")
    public void clicar_em_sign_in() {

        loginPage.clicarBotaoSingIn();
    }

    @Então("o usuário deve ser redirecionado para a pagina inicial")
    public void o_usuario_deve_ser_redirecionado_para_a_pagina_inicial() {

        loginPage.verificarPaginaInicial();
    }

    @Então("a mensagem {string} deve ser exibida")
    public void a_mensagem_deve_ser_exibida(String mensagemExibida) {

        loginPage.verificarMsgAuthenticationFailed(mensagemExibida);
    }

    @Então("a mensagem senha invalida {string} deve ser exibida")
    public void a_mensagem_senha_invalida_deve_ser_exibida(String mensagemExibida) {

        loginPage.VerificaMsgInvalidPassword(mensagemExibida);
    }

    @Quando("clico no texto {string}")
    public void clico_no_texto(String mensagemExibida) {

        loginPage.clicarBotaoForgotYourPassword();
    }

    @Então("devo ser redirecionado para a pagina de recuperar a senha")
    public void devo_ser_redirecionado_para_a_pagina_de_recuperar_a_senha() {

        loginPage.verificarPaginaRecuperarSenha();
    }

    @Quando("deve mostrar a mensagem \"An email address required.\"")
    public void deve_mostrar_a_mensagem_an_email_address_required() {

        loginPage.verificarMsgAnEmailAddressRequired();
    }

    @After
    public void fecharBrowser() {
        // Fecha o navegador após o teste
        driver.quit();
    }
}
