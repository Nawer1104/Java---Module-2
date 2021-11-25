package JavaLesson16.CopyFileText;

import java.io.*;

public class CopyFile {
    public void copyFile(String input, String output){
        try {
            File file = new File(input);
            File fileCopy = new File(output);
            if (!file.exists() || !fileCopy.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileCopy));
            int count = 0;
            int line;
            while ((line = br.read()) != -1) {
                bw.write(line);
                count++;
            }
            bw.close();
            System.out.println("Characters copied = " + count);
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();

        copyFile.copyFile("numbers.txt" , "copied.txt");
    }
}
