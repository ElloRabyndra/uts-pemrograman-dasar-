import java.util.Scanner;
public class Uts_2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int angka, max = 0, temp = 0, hitungLoop = 0, kemunculan = 1;

System.out.print("Masukkan nilai non negatif, masukan selesai jika nilai adalah 0: ");

do {
hitungLoop++;


angka = input.nextInt();

if (hitungLoop == 1) {
  temp = angka;
}

else if (hitungLoop > 1) {

  if (angka > temp) {
    max = angka;
    temp = angka;
    kemunculan = 1;
  }

  else if (angka == temp) {
    max = angka;
    temp = max;
    kemunculan++;
  }

  else {
    max = temp;
    temp = max;
  }
}

} while (angka !=0);

System.out.println();
System.out.println("nilai maximum adalah " + max);
System.out.println("jumlah kemunculannya adalah " + kemunculan);

}
  
}
