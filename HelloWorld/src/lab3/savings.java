package lab3;

import java.util.Scanner;

public class savings {

    private String ner;
    private String valyut;
    private double jiliinHuu;
    private int sar;
    private double ehniiUldegdel;

    public savings(String ner, String valyut, double jiliinHuu, int sar, double ehniiUldegdel) {
        this.ner = ner;
        this.valyut = valyut;
        this.jiliinHuu = jiliinHuu;
        this.sar = sar;
        this.ehniiUldegdel = ehniiUldegdel;
    }

    private double savingscalcaccrued() {
        return ehniiUldegdel * (jiliinHuu / 12) * sar / 100;
    }


    private double savingscalc() {
        return ehniiUldegdel + savingscalcaccrued();
    }

    public void savingsreport() {

        double huu = savingscalcaccrued();
        double uldegdel = savingscalc();

        System.out.printf(
                "\nТа \"%s\"-д %,.1f%s-ийг %d сарын хугацаатай, жилийн %.1f%%-ийн хүүтэй хадгалуулбал:\n",
                ner, ehniiUldegdel, valyut, sar, jiliinHuu);

        System.out.printf("Хадгаламжийн үлдэгдэл: %,.1f%s болно.\n", uldegdel, valyut);
        System.out.printf("Хуримтлагдсан хүү: %,.1f%s байна.\n", huu, valyut);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Хадгаламжийн нэр: ");
        String ner = input.nextLine();

        System.out.print("Валют: ");
        String valyut = input.nextLine();

        System.out.print("Жилийн хүү (%): ");
        double jiliinHuu = input.nextDouble();

        System.out.print("Хугацаа (сар): ");
        int sar = input.nextInt();

        System.out.print("Эхний үлдэгдэл: ");
        double ehniiUldegdel = input.nextDouble();

        savings s = new savings(ner, valyut, jiliinHuu, sar, ehniiUldegdel);

        s.savingsreport();

        input.close();
    }
}