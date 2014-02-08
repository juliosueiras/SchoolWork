package model;

public class Villain extends Avatar
{
    private boolean insane;
    private int energy;

    public boolean isInsane()
    {
        return insane;
    }

    public void setInsane(boolean insane)
    {
        this.insane = insane;
    }

    public int getEnergy()
    {
        return energy;
    }

    public void setEnergy(int energy)
    {
        this.energy = energy;
    }
}
