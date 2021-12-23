package com.epam.week3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileStream {
    public FileStream() {}

    /**
     * Write the flower name and price to the text
     * @param fileName  The file you want to write in
     */
    public void writeFile(String fileName) {
        try {
            FileOutputStream fs = new FileOutputStream(fileName);
            OutputStreamWriter ow= new OutputStreamWriter(fs);
            BufferedWriter  bw = new BufferedWriter(ow);
            int n= 0;
            while (n<2) {
                try {
                    System.out.println("Please enter the flower name: ");
                    Scanner sc = new Scanner(System.in);
                    String flowerName = sc.nextLine();
                    bw.write(flowerName);
                    bw.write(",");
                    System.out.println("Please enter the flower price: ");
                    double flowerPrice = sc.nextDouble();
                    String price = String.valueOf(flowerPrice);
                    bw.write(price);
                    bw.write(",");
                    bw.newLine();
                    bw.flush();
                    n++;

                } catch (InputMismatchException e) {
                    System.out.println("Please enter the price with double type");
                }
            }
            fs.close();
            ow.close();
            bw.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * read the flower name and price from the text
     * @param fileName The file you want to read
     * @return  return the string you read
     */
    public String readFile(String fileName) {
        String str="";
        try {
            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader ir = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(ir);
            String line;
            while ((line = br.readLine())!=null) {
                System.out.println(line);
                str = str+line;
            }
            fis.close();
            ir.close();
            br.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
