package icebergtracker;

import java.time.LocalDate;
import java.time.Month;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.List;

/**
 *
 * @author josei
 */
public class IcebergTracker {

    private final MultiValuedMap <Iceberg,IcebergData> icebergsData = new ArrayListValuedHashMap<>();

    public IcebergTracker() {
        
        Iceberg iceberg1 = new Iceberg(1, "cabo ABC", LocalDate.of(2017, Month.MARCH, 1));
        Iceberg iceberg2 = new Iceberg(2, "bahía DEF", LocalDate.of(2017, Month.MARCH, 10));
        
        icebergsData.put(new IcebergData(LocalDate.of(2018, Month.SEPTEMBER, 1), iceberg1, "88ºN 24'E", 9e9));
        icebergsData.put(new IcebergData(LocalDate.of(2018, Month.OCTOBER, 1), iceberg1, "80ºN 12'E", 8e8));
        icebergsData.put(new IcebergData(LocalDate.of(2018, Month.SEPTEMBER, 1), iceberg2, "77ºS 02'W", 7e7));
        icebergsData.put(new IcebergData(LocalDate.of(2018, Month.OCTOBER, 1), iceberg2, "78ºS 03'W", 6.5e7));
    }
    
    private void output() {
        for (IcebergData d: icebergsData.values()){
            System.out.println(d);
        }
    }
              
    public static void main(String[] args) {
        // TODO code application logic here

        IcebergTracker icebergTracker= new IcebergTracker();
        icebergTracker.output();
    }

}
