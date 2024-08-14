import java.util.Scanner;
public class Main {
    static int sum(int a,int b) {
        int result = a + b;
        System.out.println("toplam :" +result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Fark : " + result);
        return  result;
    }
    static int divided(int a, int b){

        if( b == 0){
            System.out.println("Girilen 2. sayı 0 değeri olamaz...");
            return 0;
        }
        int result = a / b;
        System.out.println("Bölüm" +result);
        return  result;
    }
    static int times(int a , int b ){
        int result = a *b;
        System.out.println("Çarpım:" + result);
        return result;
    }
    static int power(int a , int b){
        int result = 1;
        for(int i = 1;i<=b;i++){
            result *= a;
        }
        return result;
    }
    static int mod(int a , int b){
        return a % b;
    }

    static void calc(int a , int b){
        System.out.println("Çevreesi :" + (2*(a+b)));
        System.out.println("Alanı :" + (a*b));
    }



    public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-)Toplama işlemi\n"
          + "2-) Çıkarma işlemi\n"
          + "3-) Bölme işlemi\n"
          +  "4-)Çarpma işlemi\n"
          + "5-)Üst alma\n"
          + "6-) mod alma\n"
          + "7-)Dikdörtgen alan ve Çevre hesabı\n"
          + "0-) Çıkış";
        System.out.println(menu);
  while (true){

      System.out.print("Bir işlem seçiniz:");
      select =scan.nextInt();

      if(select == 0){
          break;
      }

      System.out.print("İlk sayı:");
      int a = scan.nextInt();
      System.out.print("İkinci sayı:");
      int b = scan.nextInt();

      switch (select){
          case 1:
              sum(a,b);
              break;
          case 2:
              minus(a,b);
              break;
          case 3:
              divided(a,b);
              break;
          case 4:
              times(a,b);
              break;
          case 5:
              System.out.println(power(a,b));
              break;
          case 6:
              System.out.println(mod(a,b));
              break;
          case 7:
              calc(a,b);
              break;
          default:
              System.out.println("Yanlış bir işlem seçtiniz...");

      }


  }

        System.out.println("Güle güle..");


    }
}