package src;

public class StringBuilder {
    public static void main(String[] args) {

        java.lang.StringBuilder sb1=new java.lang.StringBuilder("Prize Dikkat");

        System.out.println(sb1.insert(12," edin."));//Prize Dikkat edin. Urun yerlestirme gibi
        String str="Hayatta cok guzel seyler var";
        System.out.println(sb1.insert(0,str,0,8));//Hayatta Prize Dikkat edin.

        System.out.println(sb1.reverse());//.nide takkiD ezirP attayaH Tersten yazdirir
        System.out.println(sb1);//.nide takkiD ezirP attayaH
        System.out.println(sb1.reverse());//Hayatta Prize Dikkat edin.

        System.out.println(sb1.substring(3, 5));//at
        System.out.println(sb1);

        System.out.println(sb1.subSequence(3,5));//at
        System.out.println(sb1);//Hayatta Prize Dikkat edin.

    }
}
