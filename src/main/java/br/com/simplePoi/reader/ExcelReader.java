package br.com.simplePoi.reader;

import br.com.simplePoi.excel.ExcelFile;
import br.com.simplePoi.model.RegistroPlanilha;
import org.apache.poi.ss.usermodel.*;

import java.util.ArrayList;
import java.util.List;

public class ExcelReader {

    public List<RegistroPlanilha> lerPrimeiraSheet(ExcelFile excel) {
        Sheet sheet = excel.getWorkbook().getSheetAt(0);
        List<RegistroPlanilha> registros = new ArrayList<>();

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) {
                continue;
            }

            RegistroPlanilha registro = new RegistroPlanilha();
            registro.setNome(getCellString(row, 0));
            registro.setCpf(getCellString(row, 1));
            registro.setIdade(getCellInt(row, 2));
            registro.setCidade(getCellString(row, 3));
            registro.setStatus(getCellString(row, 4));

            registros.add(registro);
        }

        return registros;
    }

    private String getCellString(Row row, int index) {
        Cell cell = row.getCell(index);
        if (cell == null) return "";
        return cell.toString().trim();
    }

    private int getCellInt(Row row, int index) {
        Cell cell = row.getCell(index);
        if (cell == null) return 0;
        return (int) cell.getNumericCellValue();
    }
}