package model;

/**
 * Superhero class
 */
public class Superhero extends Avatar
{
    private boolean secretIdentity;
    private int energy;
    private String homeTown;


    /**
     * create new Superhero.
     *
     * @param pointSystem    the point system
     * @param firstName      the first name
     * @param lastName       the last name
     * @param secretIdentity the secret identity
     * @param energy         the energy
     * @param homeTown       the home town
     */
    public Superhero(PointSystem pointSystem, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown)
    {
        super(pointSystem, firstName, lastName);
        this.secretIdentity = secretIdentity;
        this.energy = energy;
        this.homeTown = homeTown;
    }

    /**
     * Is secret identity.
     *
     * @return the boolean
     */
    public boolean isSecretIdentity()
    {
        return secretIdentity;
    }

    /**
     * Sets secret identity.
     *
     * @param secretIdentity the secret identity
     */
    public void setSecretIdentity(boolean secretIdentity)
    {
        this.secretIdentity = secretIdentity;
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

    /**
     * Gets home town.
     *
     * @return the home town
     */
    public String getHomeTown()
    {
        return homeTown;
    }

    /**
     * Sets home town.
     *
     * @param homeTown the home town
     */
    public void setHomeTown(String homeTown)
    {
        this.homeTown = homeTown;
    }

    @Override
    public String toString()
    {
        return this.getClass().getSimpleName();
    }

    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println(this + " fight " + avatarName);
    }
}
