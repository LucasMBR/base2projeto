package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class CadastroOcorrenciasPage extends PageBase {
    By relatarCaso = linkText("Relatar Caso");

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
        String text = getText(mensagemSucessoEsperada).substring(0,31);
        return text;
    }

}
