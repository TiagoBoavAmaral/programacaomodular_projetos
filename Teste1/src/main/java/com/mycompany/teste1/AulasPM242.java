package com.mycompany.teste1;



import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class AulasPM242 {
    public static void main(String[] args) {
    String path = "./src/main/java/data/arq.txt";
    try {
        //Fluxo de saida de um arquivo
        OutputStream os = new FileOutputStream(path); //nome do arquivo
        Writer wr = new OutputStreamWriter(os); // criacao de um escritor
        BufferedWriter br = new BufferedWriter(wr); //adiciono a um escritor
        br.write("Escrevendo Nosso Primeiro Arquivo em JAVA");
        br.newLine();
        br.write("Outra Linha!");
        br.close();
    } catch (Exception e) {
        System.out.println("Algo de Errado Nao Esta Certo");
    }
}
}