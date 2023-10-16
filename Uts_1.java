import java.util.Scanner;
public class Uts_1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int angka, pembagi = 0;

System.out.print("Masukkan bilangan ");
angka = input.nextInt();

if (angka == 1) {
  System.out.println(angka + " bukan bilangan prima");

} else {
  boolean AngkaPrima = true;

  for (pembagi = 2; pembagi < angka; pembagi++) {
    if (angka % pembagi == 0) {
      AngkaPrima = false;
      break;
    }
  }

  if (AngkaPrima) 
    System.out.println(angka + " adalah bilangan prima");
  else 
    System.out.println(angka + " bukan bilangan prima");
  
}

}
  
}
