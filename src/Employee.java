
public class Employee {
    String name;
    double maas;
    int haftalikCalismaSaati;
    int hireYear;
    double vergi = 0;
    double bonus = 0;
    double artis;

    public Employee(String ad, double maas, int haftalikCalismaSaati, int hireYear)
    {
        this.name = ad;
        this.maas = maas;
        this.haftalikCalismaSaati = haftalikCalismaSaati;
        this.hireYear = hireYear;
    }

    public double tax()
    {
        if (this.maas > 1000.0D)
        {
            this.vergi = this.maas * 3.0D / 100.0D;
        }

        return this.vergi;
    }

    public double bonus()
    {
        if (this.haftalikCalismaSaati > 40)
        {
            this.bonus = (double)((this.haftalikCalismaSaati - 40) * 30 );

        }
    return this.bonus;
    }

    public double raiseSalary()
    {
        int totalCalisma = 2021 - this.hireYear;
        if (totalCalisma < 10)
        {
            this.artis = this.maas * 5.0 / 100.0;

        } else if (totalCalisma > 9 && totalCalisma < 20)
        {
            this.artis = this.maas * 10.0 / 100.0;

        } else if (totalCalisma > 19)
        {
            this.artis = this.maas * 15.0 / 100.0D;

        }

        return this.artis;
    }

    public String toString()
    {
        String istenilen = "Adı: " + this.name + "\nMaası:" + this.maas + "\nCalisma saati: " + this.haftalikCalismaSaati + "\nBaslangic yili: " + this.hireYear + "\n";
        double vergi = this.tax();
        double bonus = this.bonus();
        double artis = this.raiseSalary();

        istenilen = istenilen + "Vergi: " + vergi + "\n" +"Bonus: " + bonus +"\n" +"Maas artisi: " + artis + "\n";
        double vergiVeBonuslarIleMaas = this.maas - vergi + bonus;
        istenilen = istenilen + "Vergi ve Bonuslar ile birlikte maaş : " + vergiVeBonuslarIleMaas + "\n";
        double totalMaas = vergiVeBonuslarIleMaas + artis;
        istenilen = istenilen + "Total maas : " +totalMaas + "\n";



        return istenilen;
    }
    public static void main(String[] args) {
        Employee deneme = new Employee("Emrah", 2000.0D, 45, 1985);
        System.out.println(deneme);
    }
}



