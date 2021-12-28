package com.epam.week4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryFlowerCommand implements Command{

    @Override
    public List<String> execute() {
        //Enhance 2.1
        System.out.println("Please enter the flower name you want to query:");
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String flowerName = sc.nextLine();
        Connection conn = null;
        PreparedStatement pStaement = null;
        ResultSet rs = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "Select * from flower where flowerName=?";
            //3. create the prestatement object
            pStaement= conn.prepareStatement(sql);
            pStaement.setString(1,flowerName);
            rs = pStaement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                Double price = rs.getDouble(2);
                String price1 =String.valueOf(price) ;
                list.add(name);
                list.add(price1);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            DbUtils.closeConnection(pStaement,rs,conn);
        }
        return list;
    }
}

