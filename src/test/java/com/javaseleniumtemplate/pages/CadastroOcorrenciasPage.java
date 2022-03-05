package com.javaseleniumtemplate.pages;

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

    public void categoriaComboboxSelect(String primeiroValor){
        comboBoxSelectByValue(categoriaCombobox, primeiroValor);
    }

    public void frequenciaComboboxSelect(String segundoValor){
        comboBoxSelectByValue(frequenciaCombobox, segundoValor);
    }

    public void gravidadeComboboxSelect(String terceiroValor){
        comboBoxSelectByValue(gravidadeCombobox, terceiroValor);
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

    public String mensagemSucesso(){
        String text = getText(mensagemSucessoEsperada).substring(0,31);
        return text;
    }

}
