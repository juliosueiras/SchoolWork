package model;

/**
 * Villain class
 */
public class Villain extends Avatar
{
    private boolean insane;
    private int energy;

    /**
     * create new Villain.
     *
     * @param fighting  the fighting
     * @param agility   the agility
     * @param strength  the strength
     * @param endurance the endurance
     * @param reason    the reason
     * @param intuition the intuition
     * @param psyche    the psyche
     * @param hitPoints the hit points
     * @param firstName the first name
     * @param lastName  the last name
     */
    protected Villain(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName)
    {
        super(new PointSystem(fighting, agility, strength, endurance, reason, intuition, psyche, hitPoints), firstName, lastName);
    }

    /**
     * Is insane.
     *
     * @return the boolean
     */
    public boolean isInsane()
    {
        return insane;
    }

    /**
     * Sets insane.
     *
     * @param insane the insane
     */
    public void setInsane(boolean insane)
    {
        this.insane = insane;
    }

    /**
     * Gets energy.
     *
     * @return the energy
     */
    public int getEnergy()
    {
        return energy;
    }

    /**
     * Sets energy.
     *
     * @param energy the energy
     */
    public void setEnergy(int energy)
    {
        this.energy = energy;
    }

    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println(this + " fight " + avatarName);
    }
}
