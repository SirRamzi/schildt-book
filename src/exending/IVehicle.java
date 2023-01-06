package exending;

public interface IVehicle {
    int range();
    double fuelneeded(int miles);
    int getPassengers();
    void setPassengers(int p);
    int getFuelcap();
    void setFuelcap(int f);
    int getMpg();
    void setMpg(int m);
}
