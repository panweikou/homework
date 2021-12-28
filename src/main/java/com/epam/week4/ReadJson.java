package com.epam.week4;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.epam.week2.Chrysanthemum;
import com.epam.week2.Flower;
import com.epam.week2.Osmanthus;
import com.epam.week2.Rose;
import com.epam.week3.CustomFindFlower;

import java.io.*;

public class ReadJson implements JsonCommand{
    /**
     * Convert json to string
     * @param fileName
     * @return
     */
    @Override
    public String getJson(String fileName) {
        String jsonStr = "";
        try {
            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader ir = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(ir);
            StringBuffer sb = new StringBuffer();
            int ch=0;
            while ((ch=br.read())!=-1) {
                sb.append((char)ch);
            }
            jsonStr = sb.toString();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    /**
     * Read object from json file
     * @param str
     */
    @Override
    public void readJson(String str) {
        int disableDecimalFeature = JSON.DEFAULT_PARSER_FEATURE & ~Feature.UseBigDecimal.getMask();
        JSONObject subObj = JSON.parseObject(str,JSONObject.class,disableDecimalFeature);
        JSONArray  jsonArray = subObj.getJSONArray("flowers");
        for(int i =0;i<jsonArray.size();i++) {
            JSONObject key = (JSONObject) jsonArray.get(i);
            String name = (String)(key.get("Name"));
            Double price = (Double)(key.get("Price"));
            if(name.equals("Rose")){
                Flower flower = new Rose(name,price);
                System.out.println(flower.toString());
            }else if(name.equals("Osmanthus")) {
                Flower flower1 = new Osmanthus(name,price);
                System.out.println(flower1.toString());
            } else if(name.equals("Chrsanthemum")) {
                Flower flower2 = new Chrysanthemum(name,price);
                System.out.println(flower2.toString());
            }
        }

        //Get the exception from the json file
        JSONObject jsonObject1 = subObj.getJSONObject("Exceptions");
        String type = (String) jsonObject1.get("type");
        String message =(String)jsonObject1.get("message");
        try {
            throw new CustomFindFlower(type,message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
