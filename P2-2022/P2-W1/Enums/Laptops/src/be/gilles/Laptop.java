package be.gilles;

import be.gilles.enums.CpuGeneration;
import be.gilles.enums.CpuType;
import be.gilles.enums.Merk;

public class Laptop {

    private final String eigenaar;
    private final CpuGeneration cpuGeneration;
    private final CpuType cpuType;
    private final int ram;
    private final int disk;
    private final Merk merk;

    public Laptop(String eigenaar, CpuGeneration cpuGeneration, CpuType cpuType, int ram, int disk, Merk merk) {

        this.eigenaar = eigenaar;
        this.cpuGeneration = cpuGeneration;
        this.cpuType = cpuType;
        this.ram = ram;
        this.disk = disk;
        this.merk = merk;

    }

    public String getEigenaar() {
        return eigenaar;
    }

    public CpuGeneration getCpuGeneration() {
        return cpuGeneration;
    }

    public CpuType getCpuType() {
        return cpuType;
    }

    public int getRam() {
        return ram;
    }

    public int getDisk() {
        return disk;
    }

    public Merk getMerk() {
        return merk;
    }

    @Override
    public String toString() {
        return String.format("Laptop van %s: %s (%s %s), %dGB, %dGB", getEigenaar(), getMerk(), getCpuType(), getCpuGeneration(), getRam(), getDisk());
    }

}
