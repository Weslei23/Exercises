package com.wsdev;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    static void main()
    {
        Aluno weslei = new Aluno( "Weslei", 9.4, 9.8 );
        Aluno ana = new Aluno( "Ana", 8.4, 9.3 );
        Aluno julia = new Aluno( "Julia", 7.4, 6.7 );

        List<Aluno> alunos = new ArrayList<>();
        alunos.add( weslei );
        alunos.add( ana );
        alunos.add( julia );

        try
        {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet( "Planilha notas" );

            int rowNum = 0;
            for ( Aluno aluno : alunos )
            {
                int cellNum = 0;

                double media = ( aluno.getNota1() + aluno.getNota2() ) / 2;
                aluno.setMedia( media );

                XSSFRow row = sheet.createRow( rowNum++ );

                XSSFCell cellNome = row.createCell( cellNum++ );
                cellNome.setCellValue( aluno.getNome() );

                XSSFCell cellNota1 = row.createCell( cellNum++ );
                cellNota1.setCellValue( aluno.getNota1() );

                XSSFCell cellNota2 = row.createCell( cellNum++ );
                cellNota2.setCellValue( aluno.getNota2() );

                XSSFCell cellMedia = row.createCell( cellNum++ );
                cellMedia.setCellValue( aluno.getMedia() );
            }

            FileOutputStream out = new FileOutputStream( "alunos.xlsx" );
            workbook.write( out );
            out.close();
            workbook.close();
        }
        catch ( Exception e )
        {
            System.out.println( "Erro ao criar o arquivo XLSX" + e.getMessage() );
        }
    }
}
