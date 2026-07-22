import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        var workbook = WorkbookFactory.create(new File("src/main/resources/data/sample1.xlsx"));
        int numeroDePlanilhas = workbook.getNumberOfSheets();
        System.out.println("Este arquivo possui " + numeroDePlanilhas + " planilhas.");
        if (numeroDePlanilhas > 1){
            System.out.println("O nome das planilhas são listados a seguir: ");
            for (int i = 0; i < numeroDePlanilhas; i ++){
                System.out.println("A planilha " + i + " possui o nome: " + workbook.getSheetName(i));
            }
        }
        else {
            System.out.println("O nome da planilha é: " + workbook.getSheetName(0) + ".");
        }
        workbook.close();
    }
}