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

    private Properties properties;

    public GlobalParameters(){
        properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("globalParameters.properties");
            properties.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
    }
}
