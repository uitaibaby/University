import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    private ExcelReader() {
    }

    public static List<University> ExlReader(String path, int page) {

        File newFile = new File(path); //path
        XSSFWorkbook excelBook = null; // book
        try {
            excelBook = new XSSFWorkbook(newFile);
        } catch (IOException | InvalidFormatException e) {
            e.printStackTrace();
        }

        XSSFSheet Sheet = excelBook.getSheetAt(page); //get page(for students = 0, for universites = 1)
        for (Row row : Sheet) {
            //while (row != null){
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                ArrayList<String> student = new ArrayList<>();
                Cell cell = cellIterator.next();
                final DataFormatter df = new DataFormatter();
                String value = df.formatCellValue(cell);
                System.out.println(value);
                student.add(value);
            }
        }
        return null;
    }
}