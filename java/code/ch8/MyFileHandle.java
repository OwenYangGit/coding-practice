import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 練習創建檔案 記住要使用 try cache 語段 , 非常重要 , 因為當錯誤發生它會拋出 IOException
public class MyFileHandle {
    public static void main(String[] args) {
        try {
            File myObj = new File("myfile.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());    
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        // 寫檔
        try {
            FileWriter myWriter = new FileWriter("mywrite.txt");
            myWriter.write("Hello world");
            myWriter.close();
            System.out.println("Successful to write to the file");
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        // 讀檔
        try {
            File myObj = new File("myWrite.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        // 練習取得檔案資訊
        File obj = new File("mywrite.txt");
        if (obj.exists()) {
            System.out.println(obj.getName());
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.canWrite());
            System.out.println(obj.canRead());
            System.out.println(obj.length());
        } else {
            System.out.println("The file does not exists");
        }
        // 刪除檔案
        if (obj.delete()) {
            System.out.println("Deleted the file: " + obj.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}