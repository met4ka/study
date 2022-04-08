

import java.io.*;

/*
Задание:
На вход пользователь указывает имя файла - аргумент программы
Если файл не нашли, то открываем run.ini
В консоль пользователь вводит номер строки который он хочет вывести на консоль
Добавить проверки.
Придумать 3 testcase.
 */
public class main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(args.length);
        if (args.length>=1){
            System.out.println(args[0]);
            FileInputStream fileInputStream = null;
            /*try {
                if ((new File(args[0])).exists()){
                    System.out.println("Файл есть");
                    fileInputStream = new FileInputStream(args[0]);
                }else{
                    fileInputStream = new FileInputStream("run.ini");
                }
            } catch (FileNotFoundException e) {
                System.out.println("Ошибка при открытии файла "+args[0]+". Указанный в параметре args[0]");
                e.printStackTrace();
             //   fileInputStream = new FileInputStream("run.ini");
            */

            int index=0;
            try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
            {
                // BufferedReader br = new BufferedReader(new FileReader(args[0]));
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null)
                {
                    index++;
                    System.out.println(sCurrentLine);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("There are "+index+" lines in the file.");

            String[] strings = new String[index];
            index=0;
            try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
            {
                // BufferedReader br = new BufferedReader(new FileReader(args[0]));
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null)
                {
                    strings[index++]=sCurrentLine;
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("Output strings from the array.");
            for (int i=0; i<strings.length; i++){
                System.out.println(strings[i]);
            }

        }
        // write your code here
    }
}