package komunikacija;

public class MobilniTelefon extends Telefon implements KomunikacijaTelefoni{
    protected String mreza;
    protected double precnikEkrana;
    public MobilniTelefon(String proizvodjac,String model,String broj,String mreza,double precnikEkrana)
    {
        super(proizvodjac,model,broj);
        this.mreza = mreza;
        this.precnikEkrana = precnikEkrana;
    }
    public void poosaljiSMS()
    {
        System.out.println("Poslali ste SMS!");
    }
    public void posaljiMMS()
    {
        System.out.println("Poslali ste MMS");
    }
    public void ispisi()
    {
        System.out.println("Mobilni telefon (");
    }

    @Override
    public void pozovi(String broj) {
        System.out.println("Mobilni telefon ("+super.toString()+this.mreza+" "+this.precnikEkrana+")");
    }

    @Override
    public void javiSe() {
        System.out.println("Javili ste se na mobilni telefon");
    }
}
