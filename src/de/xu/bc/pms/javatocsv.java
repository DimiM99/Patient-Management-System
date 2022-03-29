package de.xu.bc.pms;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javatocsv {
    public String convertToCSV(String[] data) {
        return Stream.of(data)
      //  .map(this::escapeSpecialCharacters)
        .collect(Collectors.joining(","));
    }

    public void createCSV(String filename){
        try {
            File myObj = new File(filename + ".csv");
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

    public void writeToFile(String filename, String[] data){
        try {
            FileWriter myWriter = new FileWriter(filename + ".csv");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public void readFromFile(String filename){
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

