package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class CadastroOcorrenciasPage extends PageBase {
    By relatarCaso = linkText("Relatar Caso");

    //Trecho deve ser utilizado só na primeira vez, quando deve selecionar o projeto padrão.
    //Caso o teste seja realizado uma segunda vez sem limpar cache, não será necessário utilizar o trecho.
    /*By escolherProjeto = xpath("//*[@class='width50']//tr[2]//td[2]//select[@name='project_id']");
    By checkBoxTornarPadrao = xpath("//*[@name='make_default']");
    By selecionarProjetoBtn =  xpath("//*[@value='Selecionar Projeto']");*/
    //Fim do trecho especial.

    By categoriaCombobox = name("category_id");
    By frequenciaCombobox = name("reproducibility");
    By gravidadeCombobox = name("severity");

    By resumoField = name("summary");
    By descricaoField = name("description");
    By stepsField = name("steps_to_reproduce");

    By enviarRelatorioBtn = xpath("//*[@value='Enviar Relatório']");

    By mensagemSucessoEsperada = xpath("//div[@align='center']");


    public void relatarCasoBtn(){
        click(relatarCaso);
    }
    //Parte do trecho especial para primeira execução do teste, caso outras sejam realizadas sem limpar cache.
    /*public void escolherProjetoSeletor(){
        comboBoxSelectByValue(escolherProjeto, GlobalParameters.ESCOLHER_PROJETO);
    }

    public void tornarPadrao(){
        click(checkBoxTornarPadrao);
    }
    public void selecionarProjetoBtn(){
        click(selecionarProjetoBtn);
    }*/

    public void categoriaComboboxSelect(){
        comboBoxSelectByValue(categoriaCombobox, GlobalParameters.CATEGORIA_GERAL);
    }

    public void frequenciaComboboxSelect(){
        comboBoxSelectByValue(frequenciaCombobox, GlobalParameters.FREQUENCIA_GERAL);
    }

    public void gravidadeComboboxSelect(){
        comboBoxSelectByValue(gravidadeCombobox, GlobalParameters.GRAVIDADE_GERAL);
    }

    public void campoResumo(){
        sendKeys(resumoField, GlobalParameters.RESUMO_GERAL);
    }

    public void campoDescricao(){
        sendKeys(descricaoField, GlobalParameters.DESCRICAO_GERAL);
    }

    public void campoEtapas(){
        sendKeys(stepsField, GlobalParameters.ETAPAS_GERAL);
    }

    public void enviarRelatorio(){
        click(enviarRelatorioBtn);
    }

    public String mensagemSucesso(){
        return getText(mensagemSucessoEsperada).substring(0,31);
    }

}
