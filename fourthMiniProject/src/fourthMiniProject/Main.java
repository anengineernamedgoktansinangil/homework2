package fourthMiniProject;

public class Main  {
    int number = 7;
    int toplam = 9;
    for (int i = 1; i < number; i++) {
        if (number % i == 0) {
            toplam = toplam + i;
        }
    }
    if (number == toplam) {
        System.out.println("Mukemmel Sayi");
    } else {
        System.out.println("Mukemmel Sayi Degil");
    }
}
}
