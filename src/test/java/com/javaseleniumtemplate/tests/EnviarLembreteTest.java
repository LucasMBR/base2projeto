package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.PageBase;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.CadastroOcorrenciasFlows;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.EnviarLembretePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class EnviarLembreteTest extends TestBase {
    //Criar teste para verificar se é possível enviar um lembrete com sucesso após relatar um caso.
    CadastroOcorrenciasFlows cadastroOcorrenciasFlows;
    LoginFlows loginFlows;
    EnviarLembretePage enviarLembretePage;
    //PageBase pageBase;

    @Test
    public void enviarLembrete(){
        loginFlows = new LoginFlows();
        cadastroOcorrenciasFlows = new CadastroOcorrenciasFlows();
        enviarLembretePage = new EnviarLembretePage();
        /*Trecho usado para pegar uma parte de hatml que é exibida rapidamente.
        Mantido para fins de avaliação.
        pageBase = new PageBase();*/

        String resumo = "Teste Lucas Souza - Desafio Base2";
        String descricao = "Essa é uma descrição inicial para verificar se a lógica do teste deu certo.\\n\" +\n" +
                "                \"A princípio a lógica inicial funcionou, porém, pode ser resumida durante\\n\" +\n" +
                "                \"a etapa de login. Será feita a melhoria ao final dos outros testes.";
        String categoriaComboBox = "340";
        String mensagemTextoEsperada = "Visualizar Caso Enviado";

        loginFlows.efetuarLogin("lucas.leal", "21DEZ96lsl.");
        cadastroOcorrenciasFlows.CadastrarOcorrenciaSimples(categoriaComboBox,resumo,descricao);

        //Criar uma tratativa que aguarda após o lançamento, e quando carregar a nova tela, verificar se o nome
        //o primeiro resumo da lista é igual o resumo lançado e clicar no número dele para depois tentar enviar o lembrete.

        //Estratégia não deu certo
        //Assert.assertEquals(enviarLembretePage.visualizarCasoEnviadoLink(), mensagemTextoEsperada);
        //enviarLembretePage.visualizarCasoEnviadoLink();
        /*pageBase.getPageSource();*/


    }
}
