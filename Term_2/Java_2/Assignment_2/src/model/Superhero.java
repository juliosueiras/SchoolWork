package model;

public class Superhero extends Avatar
{
    private boolean secretIdentity;
    private int energy;
    private String homeTown;

    public Superhero(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown)
    {
        super(fighting, agility, strength, endurance, reason, intuition, psyche, hitPoints, firstName, lastName);
        this.secretIdentity = secretIdentity;
        this.energy = energy;
        this.homeTown = homeTown;
    }

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


    @Override
    public void fight(Avatar avatarName)
    {

    }
}
