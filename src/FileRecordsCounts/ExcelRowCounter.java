package FileRecordsCounts;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExcelRowCounter {

	public static void main(String[] args) {
        File folder = new File("C:\\Users\\DELL\\Desktop\\Test"); // 🔁 Change this path
        File[] files = folder.listFiles();

        if (files == null) {
            System.out.println("Folder not found or is empty.");	
            return;
        }

        int totalFilesProcessed = 0;
        int totalNonEmptyFirstColCells = 0;

        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName().toLowerCase();
                if (fileName.endsWith(".csv") || fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) {
                    int count = countFirstColumnNonEmptyCells(file);
                    System.out.println(file.getName() + " -> Non-empty first column cells: " + count);
                    totalFilesProcessed++;
                    totalNonEmptyFirstColCells += count;
                } else {
                    System.out.println(file.getName() + " -> Skipped (unsupported file type)");
                }
            }
        }

        System.out.println("====================================");
        System.out.println("Total CSV files processed: " + totalFilesProcessed);
        System.out.println("Total non-empty cells in first column: " + totalNonEmptyFirstColCells);
    }

    private static int countFirstColumnNonEmptyCells(File file) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isFirstLine = true;
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false; // Skip header
                    continue;
                }
                String[] columns = line.split(",", -1); // -1 to include trailing empty columns
                if (columns.length > 0 && !columns[0].trim().isEmpty()) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
        return count;
    }
}
