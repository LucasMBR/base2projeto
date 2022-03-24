package com.javaseleniumtemplate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalParameters {
    public static String BROWSER_DEFAULT;
    public static String EXECUTION;
    public static int TIMEOUT_DEFAULT;
    public static String URL_DEFAULT;
    public static String DOWNLOAD_DEFAULT_PATH;
    public static String SENHA_GERAL;
    public static String USUARIO_GERAL;
    public static String RESUMO_GERAL;
    public static String DESCRICAO_GERAL;
    public static String ETAPAS_GERAL;
    public static String MENSAGEM_SUCESSO;
    public static String LEMBRETE_GERAL;
    public static String CATEGORIA_GERAL;
    public static String FREQUENCIA_GERAL;
    public static String GRAVIDADE_GERAL;
    public static String PROJETO_PADRAO;
    public static String TEMPO_RENOVACAO_PADRAO;
    public static String TEMPO_REDIRECIONAMENTO_PADRAO;
    public static String NOVOS_CASOS;
    public static String MUDANCAS_ATRI;
    public static String RETORNOS;
    public static String CASOS_RESO;
    public static String CASOS_FECH;
    public static String CASOS_REAB;
    public static String ANOTACOES;
    public static String MUD_STATUS;
    public static String MUD_PRIORI;
    public static String LIMITE_ANOT_EMAIL;
    public static String FUSO_HORARIO;
    public static String IDIOMA_SELECIONADO;
    public static String ESCOLHER_PROJETO;
    public static String VERSAO_MANTIS_ATUAL;
    public static String VERSAO_SCHEMA_ATUAL;

    public GlobalParameters(){
        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("globalParameters.properties");
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BROWSER_DEFAULT = properties.getProperty("browser.default");
        EXECUTION = properties.getProperty("execution");
        TIMEOUT_DEFAULT = Integer.parseInt(properties.getProperty("timeout.default"));
        URL_DEFAULT = properties.getProperty("url.default");
        DOWNLOAD_DEFAULT_PATH = properties.getProperty("download.defaul.path");
        SENHA_GERAL = properties.getProperty("senhaGeral");
        USUARIO_GERAL = properties.getProperty("usuario");
        RESUMO_GERAL = properties.getProperty("resumoTeste");
        DESCRICAO_GERAL = properties.getProperty("descricaoTeste");
        ETAPAS_GERAL = properties.getProperty("etapasTeste");
        MENSAGEM_SUCESSO = properties.getProperty("mensagemSucessoEsperada");
        LEMBRETE_GERAL = properties.getProperty("lembrete");
        CATEGORIA_GERAL = properties.getProperty("categoriaComboBox");
        FREQUENCIA_GERAL = properties.getProperty("frequenciaComboBox");
        GRAVIDADE_GERAL = properties.getProperty("gravidadeComboBox");
        PROJETO_PADRAO = properties.getProperty("projetoPadraoCombobox");
        TEMPO_RENOVACAO_PADRAO = properties.getProperty("tempoRenovacaoPref");
        TEMPO_REDIRECIONAMENTO_PADRAO = properties.getProperty("tempoRedirecionamentoPref");
        NOVOS_CASOS = properties.getProperty("comboboxNovosCasos");
        MUDANCAS_ATRI = properties.getProperty("comboboxMudancaAtri");
        RETORNOS = properties.getProperty("comboboxRetornos");
        CASOS_RESO = properties.getProperty("comboboxCasosReso");
        CASOS_FECH = properties.getProperty("comboboxCasosFech");
        CASOS_REAB = properties.getProperty("comboboxCasosReab");
        ANOTACOES = properties.getProperty("comboboxAnotacoes");
        MUD_STATUS = properties.getProperty("comboboxMudStatus");
        MUD_PRIORI = properties.getProperty("comboboxMudPriori");
        LIMITE_ANOT_EMAIL = properties.getProperty("anotacoesEmail");
        FUSO_HORARIO = properties.getProperty("fusoHorario");
        IDIOMA_SELECIONADO = properties.getProperty("idioma");
        ESCOLHER_PROJETO = properties.getProperty("escolherProjeto");
        VERSAO_MANTIS_ATUAL = properties.getProperty("versaoMantis");
        VERSAO_SCHEMA_ATUAL = properties.getProperty("versaoSchema");

    }
}
