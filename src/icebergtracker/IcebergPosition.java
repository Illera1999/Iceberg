package icebergtracker;

import java.time.LocalDate;

public class IcebergPosition {

    private LocalDate date;
    private Iceberg iceberg;
    private String coordenates;

    public IcebergPosition(LocalDate date, Iceberg iceberg, String coordenadas) {
        this.date = date;
        this.iceberg = iceberg;
        this.coordenates = coordenadas;
    }

    public LocalDate getDate() {
        return date;
    }

    public Iceberg getIceberg() {
        return iceberg;
    }

    public String getCoordenadas() {
        return coordenates;
    }
    
    @Override
    public String toString(){
        return "En: " + date + ", sus coordenadas son: " + coordenates;
    }
}
