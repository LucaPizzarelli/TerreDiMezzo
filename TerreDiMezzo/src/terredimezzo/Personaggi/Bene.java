package terredimezzo.Personaggi;

import java.util.ArrayList;
import terredimezzo.Personaggi.Personaggi;

public class Bene {
    
    private ArrayList<Personaggi> bene;
    
    public Bene() {
        bene = new ArrayList<>();
    }
    
    public void addPersonaggi(Personaggi personaggi) {
        bene.add(personaggi);
    }
    
    public int calcolaForza() {
        int forza = 0;
        for (Personaggi v : bene) {
            forza += v.forza();
        }
        return forza;
    }
    
    public void clear() {
        bene.clear();
    }
}
