package ApachePOI;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFRow row;
        XSSFCell cell;

        String path = "src/SampleData.xlsx";

        //opening and loading the in the given path
        FileInputStream fileInputStream = new FileInputStream(path);

        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet("Employees");
        //we are selecting and saving the row
        row = sheet.getRow(1);
        //selecting the cell from the selected row
        cell = row.getCell(1);

        System.out.println("Steven's lastname: " + cell.toString());

        XSSFCell adamCell = sheet.getRow(2).getCell(0);
        System.out.println("BEFORE: " + adamCell.toString());
        adamCell.setCellValue("Trump");



        //this is the line that is executing and writing to the file


        System.out.println("AFTER: " + adamCell.toString());

//TODO: Change Trump's JOB_ID to President dynamically

        for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++){
            if(sheet.getRow(rowNum).getCell(0).toString().equals("Trump")){
                sheet.getRow(rowNum).getCell(2).setCellValue("President");
            }
        }
        //for when you are sending a value to a file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);


        workbook.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
