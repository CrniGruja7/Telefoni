package glavni;
import komunikacija.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        System.out.println("1. Za unos mobilnog telefona");
        System.out.println("2. Za unos fiksnog telefona");
        System.out.println("3. Kraj unosa");
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Izaberite jednu od 3 opcije:");
        int broj = ulaz.nextInt();
        ArrayList<KomunikacijaTelefoni> lista = new ArrayList<>();
        if(broj == 1)
        {
            KomunikacijaTelefoni mt = (KomunikacijaTelefoni) new MobilniTelefon("Motorola","Nokia210","0641345962","Telenor",6.4);
            KomunikacijaTelefoni mt1 = (KomunikacijaTelefoni) new MobilniTelefon("Samsung","Samsung s4","0621479453","Telenor",6.4);
            if(mt instanceof MobilniTelefon) {
                MobilniTelefon mob = (MobilniTelefon)mt;
                lista.add(mob);
            }
            if(mt1 instanceof MobilniTelefon) {
                MobilniTelefon mob1 =(MobilniTelefon)mt1;
                lista.add(mob1);
            }
        }
        if(broj == 2)
        {
            KomunikacijaTelefoni ft = (KomunikacijaTelefoni) new FiksniTelefon("Telekom","Tesla","664339",3);
            KomunikacijaTelefoni ft1 = (KomunikacijaTelefoni) new FiksniTelefon("Gucci","Markoni","661800",3);
            if(ft instanceof FiksniTelefon) {
                FiksniTelefon fik = (FiksniTelefon) ft;
                lista.add(fik);
            }
            if(ft1 instanceof FiksniTelefon) {
                FiksniTelefon fik1 =(FiksniTelefon) ft1;
                lista.add(fik1);
            }
        }
        if(broj == 3){
            System.out.println("Razgovori zavrseni!!");
        }
        for(KomunikacijaTelefoni kf : lista) {
            kf.pozovi("0641345962");
            kf.javiSe();
        }
    }
}
