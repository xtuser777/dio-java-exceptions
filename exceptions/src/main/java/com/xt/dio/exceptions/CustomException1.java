package com.xt.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class CustomException1 {

    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        printFile(fileName);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void printFile(String nomeDoArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossibleFileOpenException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            //e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String fileName) throws ImpossibleFileOpenException {
        File file = new File(fileName);
        try {
            return new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new ImpossibleFileOpenException(file.getName(), file.getPath());
        }
    }
}
