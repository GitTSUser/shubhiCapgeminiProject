package com.capgemini.hcs.bean;
import java.io.BufferedReader;

import java.io.InputStreamReader;

import com.capgemini.hcs.dao.DiagnosticTestDAOImpl;
import com.capgemini.hcs.service.DiagnosticTestServiceImpl;

public class DiagnosticCenters {
	 static DiagnosticTestServiceImpl h1=new DiagnosticTestServiceImpl();
	 static DiagnosticTestDAOImpl d1=new DiagnosticTestDAOImpl();
	
	public static void addCenter(){
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter The Center Name to be Added");
            String cName=br.readLine();
            
            if (cName.length()!=0){
                d1.centers.add(new DiagnosticCenter(cName));
                System.out.println("Center Added Succesfully");
            }
            else{
                System.out.println("Name Shouldn't be Blank");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}