package komunikacija;

public abstract class Telefon implements KomunikacijaTelefoni{
    private String proizvodjac;
    private String model;
    private String broj;
    private static int brojac=0;
    public Telefon(String proizvodjac,String model,String broj)
    {
        brojac++;
        this.proizvodjac = proizvodjac;
        this.model = model;
        this.broj = broj;
    }
    public static int brojTelefona(){
        return brojac;
    }
    public String toString(){
        return this.proizvodjac+" "+this.model+" "+this.broj+" ";
    }
}
