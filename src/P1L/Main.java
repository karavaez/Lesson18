package P1L;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\test\\Text.txt");
            file.createNewFile();
            System.out.println(file.getName());
            System.out.println(file.getParent());
            if (file.exists()){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

            if (file.canRead()){
                System.out.println("I can read");
            }
            if (file.canWrite()){
                System.out.println("I can write");
            }
            if (file.canExecute()){
                System.out.println("I can execute");
            }

            //Перед переименованием необходимо проверить существует ли файл
            // с таким именем которое хотим присвоить.
            // Если сущществует удаляем и дальше переименовываем.
            // Иначе, переименовываем сразу.

            String fileName = "D:\\test\\Text3.txt";
            if ((new File(fileName)).exists()){

                File file1 = new File(fileName);

                if (file1.delete()){
                    String newName = file.getParent() + "\\Text3.txt";
                    File newFile = new File(newName);


                    if (file.renameTo(newFile)) {
                        System.out.println("Rename");
                    }
                    if (newFile.exists()) {
                        System.out.println(newFile.getName());
                    }
                }

            }else{

               String newName = file.getParent() + "\\Text3.txt";
               File newFile = new File(newName);


                if (file.renameTo(newFile)) {
                    System.out.println("Rename");
                }
                if (newFile.exists()) {
                    System.out.println(newFile.getName());
                }
            }


        }catch (IOException exception){}
    }

}

