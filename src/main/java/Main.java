package br.com.simplePoi;

import br.com.simplePoi.excel.ExcelFile;

public class Main {
    public static void main(String[] args) {
        try (ExcelFile excel = new ExcelFile("src/main/resources/data/sample1.xlsx")) {
            System.out.println("Este arquivo possui " + excel.getNumeroDePlanilhas() + " planilhas.");
            for (int i = 0; i < excel.getNumeroDePlanilhas(); i++) {
                System.out.println("A planilha " + i + " possui o nome: " + excel.getNomePlanilha(i));
            }

            tratarArquivo(excel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void tratarArquivo(ExcelFile excel) {
        System.out.println("Tratando arquivo: " + excel.getFile().getName());
    }
}