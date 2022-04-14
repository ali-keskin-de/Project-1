package javanar_Hospital;

import java.util.ArrayList;
import java.util.Scanner;

public class Javanar_Runner {
    static Scanner scan=new Scanner(System.in);
    static ArrayList <String> patience=new ArrayList<>();
    static Javanar_DataBase dtbs=new Javanar_DataBase();
    static String name1;

    static Javanar_Doctor dr = new Javanar_Doctor();
    static Javanar_Hasta pt = new Javanar_Hasta();

    public static void main(String[] args) {
        Javanar_DataBase.doctorList();
        System.out.println(Javanar_DataBase.drData);

        System.out.println("********************************** \n"  +
                           "         *****************\n" +
                            "   JAVANAR HOSPITALE HOS GELDINIZ\n" +
                            "         ****************\n" +
                            "***********************************\n" +
                              "");
        while(true) {
            System.out.println("1  HASTA GİRİŞİ\n2  DOKTOR GİRİŞİ");
            switch(scan.nextInt()) {
                case 1:
                    System.out.println("Lütfen bilgilerinizi giriniz:");
                    String name=scan.next().toUpperCase();
                    String lName=scan.next().toUpperCase();
                    String Id=scan.next();
                    String newPatience=name+" "+lName+" "+Id;
                    patience.add(newPatience);
                    System.out.println("Sayin " + name + ", Hasta Randevu Sistemine Hoş Geldiniz!");
                    System.out.println("1  YENİ RANDEVU AL\n2  RANDEVU LİSTEM\n3  RANDEVU İPTALİ");
                    switch(scan.nextInt()) {
                        case 1:
                            System.out.println("Doktorlarımız\n===========================");
                            dr.doctors();
                            System.out.println("Randevu oluşturmak için seçiminizi yapınız.");
                            int choice = scan.nextInt();
                            System.out.println("Sayin "+ name +" Doktorumuz " + dtbs.doctorList().get(choice-1) +"'a "
                                    + java.time.LocalDate.now() +" tarihinde kaydınız alınmıştır.");
                            pt.addPtAppointment(newPatience + " " + dtbs.doctorList().get(choice-1));
                            dr.addDrAppointment(newPatience + " " + dtbs.doctorList().get(choice-1));
                            System.out.println("Mevcut Randevularınız:");
                            for(int i=0; i<pt.getPtAppointment().size(); i++) {
                                if(pt.getPtAppointment().get(i).contains(newPatience)) {
                                    System.out.println(i + "  " + pt.getPtAppointment().get(i));
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Mevcut Randevularınız:");
                            for(int i=0; i<pt.getPtAppointment().size(); i++) {
                                if(pt.getPtAppointment().get(i).contains(newPatience)) {
                                    System.out.println(i + "  " + pt.getPtAppointment().get(i));
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Randevularınız:");
                            for(int i=0; i<pt.getPtAppointment().size(); i++) {
                                if(pt.getPtAppointment().get(i).contains(newPatience)) {
                                    System.out.println(i + "  " + pt.getPtAppointment().get(i));
                                }
                            }
                            System.out.println("İptal etmek istediğiniz randevu numarasını giriniz:");
                            int cancel = scan.nextInt();
                            pt.cancelPtAppointment(cancel);
                            System.out.println("Seçtiğiniz randevu iptal edilmiştir.\nGüncel randevu listeniz:");
                            for(int i=0; i<pt.getPtAppointment().size(); i++) {
                                if(pt.getPtAppointment().get(i).contains(newPatience)) {
                                    System.out.println(i + "  " + pt.getPtAppointment().get(i));
                                }
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Sayin doktor Lutfen adinizi giriniz");
                    mdControl();
                    break;
            }
            System.out.println("Ana menuye donmek icin 1 \ncıkmak icin 9'u tuslayiniz");
            int num=scan.nextInt();
            if(num==1) {
                continue;
            }else if(num==9) {
                System.out.println("cıkıs yaptınız");
                break;
            }else {
                System.out.println("gecersiz islem yaptiniz. Sizi Ana menuye aktariyorum");
                continue;
            }
        }
    }
    private static void mdControl() {
        String doctorName = null;
        ArrayList<String> doctors=new ArrayList<>();
        doctors = dtbs.doctorList();
        boolean access = false;
        int k = doctors.size();
        for(int i=0;i<3;i++) {
            doctorName = scan.next().trim();
            for(int j=0;j<k;j++) {
                if(doctors.get(j).contains(doctorName)) {
                    System.out.println("Sayin " + doctors.get(j) +" otomasyona hos geldiniz");
                    System.out.println();
                    //i=3; j=k;
                    access = true;
                    //drPanel();
                    break;
                }
                else {
                    access = false;
                }
            }
            if(i<2 && access == false) {
                System.out.println("Bilgilerinizi kontrol edip tekrar giriniz.");
            }
            if(access)
                break;
        }
        if(access) {
            drPanel(doctorName);
        }
        else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }

    private static void drPanel(String dName) {
        System.out.println("Acil Hastalar:");
        // Acil hastaların tüm doktorları ilgilendirdiği düşünülerek her doktora tüm acil hasta listesi gösterildi.
        Javanar_Durum.isUrgency();
        System.out.println();
        System.out.println("Randevularınız:");
        for(int i=0; i<dr.getDrAppointment().size(); i++) {
            if(dr.getDrAppointment().get(i).contains(dName)) {
                System.out.println(i + "  " + dr.getDrAppointment().get(i));
            }
        }
        System.out.println();
    }

}
