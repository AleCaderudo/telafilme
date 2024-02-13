package br.com.mhps.telafilme.service;

public interface IConverteDados {

   <T> T obterDados(String json, Class<T> classe);

}
