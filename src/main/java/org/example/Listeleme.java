import java.util.ArrayList;
import java.util.List;

public class Listeleme<T> {
    private List<T> liste;

    public Listeleme() {
        liste = new ArrayList<>();
    }

    public void ekle(T eleman) {
        liste.add(eleman);
    }

    public void yazdir() {
        System.out.println("Liste Elemanları:");
        for (T eleman : liste) {
            System.out.println(eleman);
        }
    }

    public static void main(String[] args) {
        Listeleme<String> stringListe = new Listeleme<>();
        stringListe.ekle("Merhaba Java");
        stringListe.ekle("Java programlama dili");
        stringListe.yazdir();

        Listeleme<Integer> integerListe = new Listeleme<>();
        integerListe.ekle(1);
        integerListe.ekle(2);
        integerListe.yazdir();
    }
}