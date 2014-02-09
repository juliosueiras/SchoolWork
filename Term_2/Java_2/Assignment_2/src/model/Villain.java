package model;

public class Villain extends Avatar
{
    private boolean insane;
    private int energy;

    protected Villain(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName)
    {
        super(fighting, agility, strength, endurance, reason, intuition, psyche, hitPoints, firstName, lastName);
    }

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

    @Override
    public void fight(Avatar avatarName)
    {

    }
}
