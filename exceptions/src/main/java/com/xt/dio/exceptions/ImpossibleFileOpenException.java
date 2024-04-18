package com.xt.dio.exceptions;

public class ImpossibleFileOpenException extends Exception {

    private String fileName;
    private String directory;

    public ImpossibleFileOpenException(String fileName, String directory) {
        super("O arquivo " + fileName + " não foi encontrado no diretório " + directory);
        this.fileName = fileName;
        this.directory = directory;
    }

    /*@Override
    public String toString() {
        return "ImpossivelAberturaDeArquivoException{" +
                "nomeDoArquivo='" + nomeDoArquivo + '\'' +
                ", diretorio='" + diretorio + '\'' +
                '}';
    }*/
}
