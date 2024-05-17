import java.io.*;

public class Filemerge {
    public static void main(String[] args) {
        String[] files = {
            "C:\\Users\\DELL\\OneDrive\\Dokumen\\forder selpi\\semester 4\\Students.csv",
            "C:\\Users\\DELL\\OneDrive\\Dokumen\\forder selpi\\semester 4\\new_Students.csv"
        };
        String mergeFile = "C:\\Users\\DELL\\OneDrive\\Dokumen\\forder selpi\\semester 4\\merge_Students.csv";
        
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergeFile))){
            for (String file : files){
                try (BufferedReader br = new BufferedReader(new FileReader(file))){
                    String line;
                    while ((line = br.readLine()) != null){
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}