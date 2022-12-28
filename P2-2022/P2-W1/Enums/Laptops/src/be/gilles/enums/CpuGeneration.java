package be.gilles.enums;

public enum CpuGeneration {
    SANDY_BRIDGE, IVY_BRIDGE, HASWELL, BROADWELL, SKYLAKE, KABYLAKE;

    @Override
    public String toString() {
        return (name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase()).replace('_', ' ');
    }

}

