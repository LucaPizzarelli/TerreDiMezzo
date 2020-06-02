package terredimezzo.Personaggi;

import java.util.ArrayList;
import terredimezzo.Personaggi.Personaggi;

public class Male {
    
    private ArrayList<Personaggi> male;
    
    public Male() {
        male = new ArrayList<>();
    }
    
    public void addPersonaggi(Personaggi personaggi) {
        male.add(personaggi);
    }
    
    public int calcolaForza() {
        int forza = 0;
        for (Personaggi v : male) {
            forza += v.forza();
        }
        return forza;
    }
    
    public void clear() {
        male.clear();
    }
}
