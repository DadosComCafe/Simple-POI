package br.com.simplePoi;

import br.com.simplePoi.excel.ExcelFile;
import br.com.simplePoi.reader.ExcelReader;
import br.com.simplePoi.model.RegistroPlanilha;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (ExcelFile excel = new ExcelFile("src/main/resources/data/sample2.xlsx")) {
            ExcelReader reader = new ExcelReader();
            List<RegistroPlanilha> registros = reader.lerPrimeiraSheet(excel);

            for (RegistroPlanilha r : registros) {
                System.out.println(r.getNome() + " - " + r.getCpf() + " - " + r.getIdade());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}