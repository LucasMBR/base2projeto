package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.utils.ExtentReportUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LoginTests extends TestBase {

    LoginPage loginPage;

    //Caso de Teste Tela de Login. Teste Login com sucesso.
    @Test
    public void efetuarLoginComSucesso(){

        loginPage = new LoginPage();

        /*Os parâmetros utilizados nos testes foram incluídos em globalParameters.properties e
        instanciados nas classes presentes na pasta "pages". */
        loginPage.preencherUsuario();
        loginPage.preencherSenha();
        loginPage.clicarEmLogin();

        //Asserção utilizada para verificar a condição do teste, se positiva ou negativa.
        assertTrue(loginPage.loginSucessMessage().equals(GlobalParameters.LOGIN_SUCESS));

        /*Parte que consegui criar para gerar um relatório contendo as informações geradas pelo teste.
        Não consegui colocar a tempo essa parte no TestBase, fiz algumas tentativas porém não consegui até então.
        As variáveis usadas precisam de modificações, eu ainda estava implementando essa parte, então estava em
        desenvolvimento. Os registros dos testes podem ser encontrados na pasta do projetos, em target, report.*/

        ExtentReportUtils.addTest(getClass().getSimpleName(), "method.getDeclaringClass().getSimpleName()");
        ExtentReportUtils.addTestInfo(2, "Method.class.getMethod().getName()");
    }

}
