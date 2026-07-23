package br.com.simplePoi.excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class ExcelFile implements AutoCloseable {
    private final File file;
    private final Workbook workbook;

    public ExcelFile(String path) throws IOException {
        this.file = new File(path);
        this.workbook= WorkbookFactory.create(file);
    }

    public Workbook getWorkbook(){
        return workbook;
    }

    public int getNumeroDePlanilhas(){
        return workbook.getNumberOfSheets();
    }

    public String getNomePlanilha(int index){
        return workbook.getSheetName(index);
    }

    public File getFile(){
        return file;
    }

    @Override
    public void close() throws Exception{
        workbook.close();
    }
}
