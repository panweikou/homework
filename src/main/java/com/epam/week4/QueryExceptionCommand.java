package com.epam.week4;

import com.epam.week2.Chrysanthemum;
import com.epam.week2.Flower;
import com.epam.week2.Osmanthus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueryExceptionCommand implements Command{
    @Override
    public List<String> execute() {
        //Enhance 3.1
        List<String> list = new ArrayList<String>();
        System.out.println("Please enter the exception type:");
        Scanner sc = new Scanner(System.in);
        String exceptionType = sc.nextLine();
        Connection conn = null;
        PreparedStatement pStaement = null;
        ResultSet rs = null;
        try {
            conn = DbUtils.getConnection();
            String sql = "Select * from exception where type=?";
            //3. create the prestatement object
            pStaement= conn.prepareStatement(sql);
            pStaement.setString(1,exceptionType);
            rs = pStaement.executeQuery();
            while (rs.next()) {
                String type = rs.getString(1);
                String message = rs.getString(2);
                list.add(type);
                list.add(message);
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
