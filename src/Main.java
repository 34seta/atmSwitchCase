import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "dev123";
        String userName = "patika";
        String getPassword, getUserName;
        int rihgt = 3;
        int select;
        int balance= 3000;
        int income = 0,outcome;

        while (rihgt > 0) {

            if (rihgt >= 0) {
                System.out.println("Lütfen Kullanici Adinizi giriniz : ");
                getUserName = input.nextLine();
                System.out.println("Lütfen Sifrenizi giriniz : ");
                getPassword = input.nextLine();
                if (getPassword.equals(password) && getUserName.equals(userName)) {
                    do {
                        System.out.println("Yapmak istediginiz işlemi seciniz. \n" +
                                "1- Bakiye Sorgulama\n" +
                                "2- Para yatirma\n" +
                                "3- Para cekme\n" +
                                "4- Cikis ");

                        select = input.nextInt();

                        switch (select) {
                            case 1:
                                System.out.println("Bakiyeniz : " + balance );
                                break;
                            case 2:

                                System.out.println("Yatirilacak miktari giriniz");
                                income=input.nextInt();

                                if(income<=10000 && income>=10){
                                    balance+=income;
                                    System.out.println("Yatirilan miktardan sonra bakiyeniz: "+ balance);

                                } else  {
                                    System.out.println("Yanlis miktar girdiniz! Lütfen 10 tl ve katlari miktar giriniz.");
                                }
                                break;
                            case 3:
                                System.out.println("Çekeceginiz miktari giriniz: ");
                                outcome=input.nextInt();
                                if (outcome>balance){
                                    System.out.println("Bakiyeniz Yetersiz!");

                                }else {
                                    balance-=outcome;
                                    System.out.println("Çekim isleminden sonra kalan bakiyeniz: "+balance);
                                }

                                break;
                            case 4:
                                System.out.println("Cıkıs yaptınız. İyi gunler");
                                break;

                        }
                    } while (select != 4);

                } else {
                    System.out.println("Kullanici adi veya sifreniz hatali tekrar deneyiniz. ");
                }

            }
            rihgt--;
            System.out.println("Hatali islem! \n kalan deneme : " + rihgt);

            if (rihgt == 0) {
                System.out.println("Kartiniz bloke olmustur. \n " +
                        "Banaknizla iletişime geçiniz");
            }
        }


    }
}