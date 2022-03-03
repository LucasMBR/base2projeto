package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class cadastroOcorrenciasPage extends PageBase {
    By relatarCaso = linkText("Relatar Caso");

    By categoriaCombobox = name("category_id");
    By frequenciaCombobox = name("reproducibility");
    By gravidadeCombobox = name("severity");

    By resumoField = name("summary");
    By descricaoField = name("description");
    By stepsField = name("steps_to_reproduce");

    By enviarRelatorioBtn = xpath("//*[@value='Enviar Relatório']");

    public void relatarCasoBtn(){
        click(relatarCaso);
    }

    public void categoriaComboboxSelect(String primeiroValor){
        comboBoxSelectByVisibleText(categoriaCombobox, primeiroValor);
    }

    public void frequenciaComboboxSelect(String segundoValor){
        comboBoxSelectByVisibleText(frequenciaCombobox, segundoValor);
    }

    public void gravidadeComboboxSelect(String terceiroValor){
        comboBoxSelectByVisibleText(gravidadeCombobox, terceiroValor);
    }

    public void campoResumo(String resumo){
        sendKeys(resumoField, resumo);
    }

    public void campoDescricao(String descricao){
        sendKeys(descricaoField, descricao);
    }

    public void campoEtapas(String etapas){
        sendKeys(stepsField, etapas);
    }

    public void enviarRelatorio(){
        click(enviarRelatorioBtn);
    }
}
