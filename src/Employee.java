
public class Employee {
    String name;
    double maas;
    int haftalikCalismaSaati;
    int hireYear;
    double vergi = 0.0D;
    double bonus = 0.0D;
    double artis;

    public Employee(String ad, double maas, int haftalikCalismaSaati, int hireYear) {
        this.name = ad;
        this.maas = maas;
        this.haftalikCalismaSaati = haftalikCalismaSaati;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.maas > 1000.0D) {
            this.vergi = this.maas * 3.0D / 100.0D;
        }

        return this.vergi;
    }

    public void bonus() {
        if (this.haftalikCalismaSaati > 40) {
            this.bonus = (double)((this.haftalikCalismaSaati - 40) * 30 * 4);
            this.maas += this.bonus;
        }

    }

    public void raiseSalary() {
        int totalCalisma = 2021 - this.hireYear;
        if (totalCalisma < 10) {
            this.artis = this.maas * 5.0D / 100.0D;
            this.maas += this.maas * 5.0D / 100.0D;
        } else if (totalCalisma > 9 && totalCalisma < 20) {
            this.artis = this.maas * 10.0D / 100.0D;
            this.maas += this.maas * 10.0D / 100.0D;
        } else if (totalCalisma > 19) {
            this.artis = this.maas * 15.0D / 100.0D;
            this.maas += this.maas * 15.0D / 100.0D;
        }

    }

    public String toString() {
        String istenilen = "Adı: " + this.name + "\nMaası:" + this.maas + "\nCalisma saati: " + this.haftalikCalismaSaati + "\nBaslangic yili: " + this.hireYear + "\n";
        this.maas -= this.tax();
        this.bonus();
        istenilen = istenilen + "Vergi: " + this.vergi + "\nBonus: " + this.bonus + "\n";
        this.raiseSalary();
        istenilen = istenilen + "Maas artisi: " + this.artis + "\nVergi: " + this.tax() + "\nBonus: " + this.bonus + "\nToplam maas: " + this.maas + "\n";
        this.maas -= this.tax();
        istenilen = istenilen + "Total Maas: " + this.maas;
        return istenilen;
    }
}

