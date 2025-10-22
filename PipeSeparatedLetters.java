import java.io.*;

public class PipeSeparatedLetters {
    public static void main(String[] args) {
        // Change these file paths as needed
        String inputFile = "H:\\XXX\\XXX\\XXXXX XX\\XXXX\\XXXXX XXXXX\\input.txt";
        String outputFile = "H:\\XXX\\XXX\\XXXXX XX\\XXXX\\XXXXX XXXXX\\output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder processedLine = new StringBuilder();

                for (int i = 0; i < line.length(); i++) {
                    processedLine.append(line.charAt(i));
                    if (i < line.length() - 1) {
                        processedLine.append("|");
                    }
                }

                writer.write(processedLine.toString());
                writer.newLine();
            }
            System.out.println("Processing complete. Output written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}