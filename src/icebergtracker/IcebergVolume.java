package icebergtracker;

import java.time.LocalDate;

public class IcebergVolume {

    private LocalDate date;
    private Iceberg iceberg;
    private double volume;

    public IcebergVolume(LocalDate date, Iceberg iceberg, double volume) {
        this.date = date;
        this.iceberg = iceberg;
        this.volume = volume;
    }

    public LocalDate getDate() {
        return date;
    }

    public Iceberg getIceberg() {
        return iceberg;
    }

    public double getVolume() {
        return volume;
    }
    
    @Override
    public String toString(){
        return "volumen: " + volume;
    }
}
