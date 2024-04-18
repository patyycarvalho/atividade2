package br.com;
    
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("meuarquivo.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String texto;
            while ((texto = bufferedReader.readLine()) != null) {
                System.out.println(texto);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}