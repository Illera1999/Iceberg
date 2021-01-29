package icebergtracker;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josei
 */
public class IcebergTracker {

    private final List <Iceberg> iceberg = new ArrayList <>();
    private final List <IcebergPosition> position = new ArrayList <>();
    private final List <IcebergVolume> volume = new ArrayList <>();

    public IcebergTracker() {
        
        
        iceberg.add(new Iceberg(1, "Cabo ABC", LocalDate.of(2017, Month.MARCH, 1)));
        iceberg.add(new Iceberg(2, "Bahía DEF", LocalDate.of(2017, Month.MARCH, 10)));
        
        position.add(new IcebergPosition(LocalDate.of(2018, Month.SEPTEMBER, 1), iceberg.get(0), "88ºN 24'E"));
        position.add(new IcebergPosition(LocalDate.of(2018, Month.OCTOBER, 1), iceberg.get(0), "80ºN 12'E"));
        position.add(new IcebergPosition(LocalDate.of(2018, Month.SEPTEMBER, 1),iceberg.get(1), "77ºS 02'W"));
        position.add(new IcebergPosition(LocalDate.of(2018, Month.OCTOBER, 1), iceberg.get(1), "78ºS 03'W"));
        
        volume.add(new IcebergVolume(LocalDate.of(2018, Month.SEPTEMBER, 1), iceberg.get(0), 9e9));
        volume.add(new IcebergVolume(LocalDate.of(2018, Month.OCTOBER, 1), iceberg.get(0), 8e8));
        volume.add(new IcebergVolume(LocalDate.of(2018, Month.SEPTEMBER, 1), iceberg.get(1), 7e7));
        volume.add(new IcebergVolume(LocalDate.of(2018, Month.OCTOBER, 1), iceberg.get(1), 6.5e7));
    }
    
    private void output() {
        for(Iceberg i : iceberg) {
            System.out.println(i.toString());
            for(IcebergPosition p : position) {
                if(p.getIceberg().equals(i)) {
                    System.out.println(p.toString());
                    for(IcebergVolume v : volume) {
                        if(v.getIceberg().equals(i)
                                && v.getDate().equals(p.getDate()))
                            System.out.println(v);
                    }
                }
            }
        }
    }
              
    public static void main(String[] args) {
        // TODO code application logic here

        IcebergTracker icebergTracker= new IcebergTracker();
        icebergTracker.output();
    }

}
