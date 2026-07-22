import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        var workbook = WorkbookFactory.create(new File("src/main/resources/data/sample1.xlsx"));
        System.out.println("Este arquivo possui " + workbook.getNumberOfSheets() + " planilhas.");
        workbook.close();
    }
}