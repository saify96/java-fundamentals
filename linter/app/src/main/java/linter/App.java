package linter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.*;


public class App {

    public static void main(String[] args) {
        readFiles("gates.js");
    }

    public static String readFiles(String s){
        String allData="";
        Path path = Paths.get(s);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line = reader.readLine();
            char last = line.charAt(line.length()-1);
            String msg ="Missing semicolon.";
            int lineCounter=0;
            while (line != null){
                lineCounter++;
                if (last==';'|| last=='{' || last=='}' || line.contains("if")|| line.contains("else")){
                    System.out.println(line);
                    allData+=line;

                }else if (last!=';'){
                    System.out.println("line "+ lineCounter +": "+msg);
                    allData+="line "+ lineCounter +": "+msg;
                }
                line = reader.readLine();
                try{
                    if(!line.isEmpty()){
                        last = line.charAt(line.length()-1);
                    }
                }catch(NullPointerException e){}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(allData);
        return allData;
    }

}
