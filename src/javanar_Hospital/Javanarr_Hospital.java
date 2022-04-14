package javanar_Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Javanarr_Hospital {
    static Scanner scan=new Scanner(System.in);
    static StringBuilder sb=new StringBuilder();
    static final int DOCTOR_DAILY_APPOINTMET = 2;
    //String dName,String dSurName,String dBranch
    static Javanar_Doctor dr1=new Javanar_Doctor();
    static Javanar_DataBase database=new Javanar_DataBase();
    //String ad=scan.next();
    //String soyAd=scan.next();
    //int tc=scan.nextInt();
    //String newHasta=ad+" "+soyAd+" "+ tc;
    public static void appointment(String newHasta, int num ) {
        ArrayList<String> appoinmentList=new ArrayList<>();
        if(dr1.database.doctorList().get(num)==null) {
            if(appoinmentList.size()<3) {
                appoinmentList.add(newHasta);
            }else {
                System.out.println("sectiginiz doktorun randevu listesi dolmustur");
            }
        }
    }

}
