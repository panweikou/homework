package com.epam.week3;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileStream {

    /**
     * Write the flower name and price to the text
     * @param fileName  The file you want to write in
     */
    public void writeFile(String fileName) throws IOException {
        FileOutputStream fs = null;
        OutputStreamWriter ow = null;
        BufferedWriter  bw = null;
        try {
            fs =  new FileOutputStream(fileName);
            ow = new OutputStreamWriter(fs);
            bw = new BufferedWriter(ow);
            int n= 0;
            while (n<2) {
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
             
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {e.printStackTrace();}
        finally {
            if(fs!=null) {
                fs.close();
            } else if(ow !=null) {
                ow.close();
            } else if(bw!=null) {
                bw.close();
            }
        }
    }

    /**
     * read the flower name and price from the text
     * @param fileName The file you want to read
     * @return  return the string you read
     */
    public String readFile(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        InputStreamReader ir = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(ir);
        String str="";
        try {
            String line;
            while ((line = br.readLine())!=null) {
                System.out.println(line);
                str = str+line;
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fis.close();
            ir.close();
            br.close();
        }
        return str;
    }
}
