package model;

public class Superhero extends Avatar
{
    private boolean secretIdentity;
    private int energy;
    private String homeTown;

    public boolean isSecretIdentity()
    {
        return secretIdentity;
    }

    public void setSecretIdentity(boolean secretIdentity)
    {
        this.secretIdentity = secretIdentity;
    }

    public int getEnergy()
    {
        return energy;
    }

    public void setEnergy(int energy)
    {
        this.energy = energy;
    }

    public String getHomeTown()
    {
        return homeTown;
    }

    public void setHomeTown(String homeTown)
    {
        this.homeTown = homeTown;
    }
}
