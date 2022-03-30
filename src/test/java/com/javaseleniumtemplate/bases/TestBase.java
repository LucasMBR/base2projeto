package com.javaseleniumtemplate.bases;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.utils.DriverUtils;
import com.javaseleniumtemplate.utils.ExtentReportUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class TestBase {

    @BeforeClass
    public static void beforeSuite(){
        new GlobalParameters();
        //Criar a pasta do report do teste
        ExtentReportUtils.createReport();
    }

    /*@BeforeMethod
    public void beforeMethod(Method method){
        //Cria o arquivo HTML com Cabeçalho.
        ExtentReportUtils.addTest(method.getName(), method.getDeclaringClass().getSimpleName());
    }*/
    @Before
    public void beforeTest(){
        DriverUtils.createInstance();
        //Realiza as tratativas da janela de teste (Forma de exibição).
        DriverUtils.INSTANCE.manage().window().maximize();
        //Navega até o link onde será realizado o teste.
        DriverUtils.INSTANCE.navigate().to(GlobalParameters.URL_DEFAULT);
    }

    @After
    public void afterTest(){
        //Cria o arquivo HTML com Cabeçalho.
        ExtentReportUtils.addTest("NomeTeste(Definir)","(Definir)");
        //Insere as informações do teste.
        ExtentReportUtils.addTestInfo(1 , "(definir detalhes teste)");
        //Pega print da tela.
        ExtentReportUtils.getScreenShotMedia("TesteNome(Definir)");
        //Finaliza o teste, fechando a aba.
        DriverUtils.quitInstace();
    }

    @AfterClass
    public static void afterSuite(){
        //Gera report do teste. (Finaliza o arquivo.)
        ExtentReportUtils.generateReport();
    }

}
