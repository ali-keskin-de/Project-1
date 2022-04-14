package javanar_Hospital;

public class Javanar_Durum extends Javanar_Hasta {
    private static String pCircum;
    private String pUrgency;
    static Javanar_DataBase dtbs=new Javanar_DataBase();
    public Javanar_Durum(String pName, String pSurname, int pId) {
        super(pName, pSurname, pId);

    }

    public Javanar_Durum(String pName, String pSurname, int pId, String pCircum, String pUrgency) {
        super(pName, pSurname, pId);
        this.pCircum = pCircum;
        this.pUrgency = pUrgency;
    }

    //public PatienceCircum() {
    /// TODO Auto-generated constructor stub
    //}
    public String getpCircum() {
        return pCircum;
    }
    public void setpCircum(String pCircum) {
        this.pCircum = pCircum;
    }
    public String getpUrgency() {
        return pUrgency;
    }
    public void setpUrgency(String pUrgency) {
        this.pUrgency = pUrgency;
    }
    public static void  isUrgency( ) {
        for(int i=0;i<dtbs.cirPat.length;i++) {
            if(dtbs.addIllnes(dtbs.cirPat).get(i).contains("Allerji")||dtbs.addIllnes(dtbs.cirPat).get(i).contains("Kalp hastaliklari")) {
                System.out.println(dtbs.addIllnes(dtbs.cirPat).get(i)+" Acil Hasta");
            }else {
                //System.out.println(dtbs.addIllnes(dtbs.cirPat).get(i)+" Ayakta tedaviye uygun");
            }
        }

    }

    public static void main(String[] args) {
        isUrgency();
    }


}
