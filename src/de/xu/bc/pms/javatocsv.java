package de.xu.bc.pms;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javatocsv {
    final static private String GlobalPath = "./Export-"+ System.currentTimeMillis()+".csv";

    public String convertToCSV(String[] data) {
        return Stream.of(data)
      //  .map(this::escapeSpecialCharacters)
        .collect(Collectors.joining(","));
    }

    static private void createCSV(){
        try {
            File myObj = new File(GlobalPath);
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    static public void writeToFile(String[] data){
        try {
            createCSV();
            FileWriter myWriter = new FileWriter(GlobalPath );
            for (String elemnt : data) {
                myWriter.write(elemnt);
                myWriter.write("\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    static public void readFromFile(String filename){
        try {
            File myObj = new File(filename + ".csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}

