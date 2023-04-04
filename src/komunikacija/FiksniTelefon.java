package komunikacija;
import komunikacija.MobilniTelefon;

public class FiksniTelefon extends Telefon implements KomunikacijaTelefoni {
    private double duzinaKabla;
    public FiksniTelefon(String proizvodjac,String model,String broj,double duzinaKabla)
    {
        super(proizvodjac,model,broj);
        this.duzinaKabla = duzinaKabla;
    }

    @Override
    public void pozovi(String broj) {
        System.out.println("Fiksni telefon ("+super.toString()+this.duzinaKabla+")");
    }

    @Override
    public void javiSe() {
        System.out.println("Javili ste se na fiksni telefon");
    }
}
