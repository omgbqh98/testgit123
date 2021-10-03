//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//
//public class ExportEx {
//    public ByteArrayInputStream exportUserData(List<UserDto> userDtos) throws IOException {
//        ByteArrayInputStream in = exportUserData(userDtos, SHEET, HEADERs, TITLE);
//        return in;
//    }
//
//    private ByteArrayInputStream exportUserData(List<UserDto> userDtos, String SHEET, String[] HEADERs, String TITLE) throws IOException {
//        HSSFWorkbook workbook = new HSSFWorkbook();
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        Sheet sheet = createSheetForm(SHEET, HEADERs, TITLE, workbook);
//        CellStyle headerCellStyle = workbook.createCellStyle();
//        headerCellStyle = workbook.createCellStyle();
//        headerCellStyle.setAlignment(CellStyle.ALIGN_CENTER);
//        int rowIdx = 3; // export từ hàng 3
//        for (UserDto userDto : userDtos) {
//            Row row = sheet.createRow(rowIdx++);
//            row.createCell(0).setCellValue(userDto.getUserId());
//            row.getCell(0).setCellStyle(headerCellStyle);
//            row.createCell(1).setCellValue(userDto.getEmailAddress());
//            row.getCell(1).setCellStyle(headerCellStyle);
//            row.createCell(2).setCellValue(userDto.getFirstName());
//            row.getCell(2).setCellStyle(headerCellStyle);
//            row.createCell(3).setCellValue(userDto.getLastName());
//            row.getCell(3).setCellStyle(headerCellStyle);
//            row.createCell(4).setCellValue(userDto.getGender());
//            row.getCell(4).setCellStyle(headerCellStyle);
//            row.createCell(5).setCellValue(userDto.getDateOfBirth().toString());
//            row.getCell(5).setCellStyle(headerCellStyle);
//            row.createCell(6).setCellValue(userDto.getPhoneNumber());
//            row.getCell(6).setCellStyle(headerCellStyle);
//            row.createCell(7).setCellValue(userDto.getAddress());
//            row.getCell(7).setCellStyle(headerCellStyle);
//            row.createCell(8).setCellValue(userDto.getLoginId());
//            row.getCell(8).setCellStyle(headerCellStyle);
//        }
//        workbook.write(out);
//        return new ByteArrayInputStream(out.toByteArray());
//    }
//
//    private Sheet createSheetForm(String sheetName, String[] headerNames, String titleName,
//        HSSFWorkbook workbook) {
//        Sheet sheet = workbook.createSheet(sheetName);
//        //set độ rộng title
//        int indexTitle = sheet.addMergedRegion(CellRangeAddress.valueOf("A1:I1"));
//        //set độ rộng column
//        sheet.setColumnWidth(1, 25 * 200);
//        sheet.setColumnWidth(2, 25 * 200);
//        sheet.setColumnWidth(3, 25 * 200);
//        sheet.setColumnWidth(4, 25 * 200);
//        sheet.setColumnWidth(5, 25 * 200);
//        sheet.setColumnWidth(6, 25 * 200);
//        sheet.setColumnWidth(7, 25 * 200);
//        sheet.setColumnWidth(8, 25 * 200);
//
//        Row titleRow = sheet.createRow(0);
//        CellStyle styleHeader = workbook.createCellStyle();
//        styleHeader.setFillForegroundColor(IndexedColors.BROWN.getIndex());
//        styleHeader.setAlignment(CellStyle.ALIGN_CENTER);
//        Cell titleCell = titleRow.createCell(0);
//        titleCell.setCellValue(titleName);
//        titleCell.setCellStyle(styleHeader);
//
//        Row headerRow = sheet.createRow(2);
//        CellStyle headerCellStyle = workbook.createCellStyle();
//        headerCellStyle = workbook.createCellStyle();
//        headerCellStyle.setAlignment(CellStyle.ALIGN_CENTER);
//        for (int i = 0; i < headerNames.length; i++) {
//            Cell cell = headerRow.createCell(i);
//            cell.setCellValue(headerNames[i]);
//            cell.setCellStyle(headerCellStyle);
//        }
//        return sheet;
//    }
//
//}



//controller:

//@PostMapping("/user/csv")
//public ResponseEntity exportUserCSVFile(@RequestBody List<UserDto> userDtos) throws IOException {
//    String filename = FILE_EXPORT + EXTENSION;
//    InputStreamResource file = new InputStreamResource(userService.exportUserData(userDtos));
//    return ResponseEntity.ok()
//    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
//    .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
//    .body(file);
//    }


//maven:

//<dependency>
//            <groupId>org.apache.poi</groupId>
//            <artifactId>poi</artifactId>
//            <version>3.12</version>
//        </dependency>

