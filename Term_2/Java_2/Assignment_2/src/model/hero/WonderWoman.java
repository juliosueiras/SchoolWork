package model.hero;

import model.Avatar;
import model.PointSystem;
import model.Superhero;
import model.interfaces.*;

/**
 * The type Wonder woman.
 */
public class WonderWoman extends Superhero implements Strategist, Brawler
{
    private boolean armed;
    private int mysticEnergy;

    /**
     * Instantiates a new Wonder woman.
     *
     * @param inputPoints    the input points
     * @param firstName      the first name
     * @param lastName       the last name
     * @param secretIdentity the secret identity
     * @param energy         the energy
     * @param homeTown       the home town
     * @param armed          the armed
     * @param mysticEnergy   the mystic energy
     */
    public WonderWoman(PointSystem inputPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown, boolean armed, int mysticEnergy)
    {
        super(inputPoints, firstName, lastName, secretIdentity, energy, homeTown);
        this.armed = armed;
        this.mysticEnergy = mysticEnergy;
    }

    /**
     * Gets mystic energy.
     *
     * @return the mystic energy
     */
    public int getMysticEnergy()
    {
        return mysticEnergy;
    }

    /**
     * Sets mystic energy.
     *
     * @param mysticEnergy the mystic energy
     */
    public void setMysticEnergy(int mysticEnergy)
    {
        this.mysticEnergy = mysticEnergy;
    }

    /**
     * Is armed.
     *
     * @return the boolean
     */
    public boolean isArmed()
    {
        return armed;
    }

    /**
     * Sets armed.
     *
     * @param armed the armed
     */
    public void setArmed(boolean armed)
    {
        this.armed = armed;
    }

    /**
     * Deflect void.
     */
    public void deflect()
    {
        System.out.println("Wonder woman deflect the attack");
    }

    /**
     * Lasso void.
     *
     * @param avatarName the avatar name
     */
    public void lasso(Avatar avatarName)
    {
        System.out.println("Wonder woman use lasso on " + avatarName);
    }

    /**
     * Interrogate void.
     *
     * @param avatarName the avatar name
     */
    public void interrogate(Avatar avatarName)
    {
        System.out.println("Wonder woman interrogated " + avatarName);
    }

    @Override
    public void analyzeWeakness(Avatar avatarName)
    {
        System.out.println("Wonder woman analyze weakness of " + avatarName);
    }

    @Override
    public boolean command(String strategy)
    {
        System.out.println("Wonder Woman fail to do " + strategy + " command");
        return false;
    }

    @Override
    public void brawl(Avatar avatarName)
    {
        System.out.println("Wonder woman use brawl on " + avatarName);
    }

    @Override
    public void grapple(Avatar avatarName)
    {
        System.out.println("Wonder woman use grapple on " + avatarName);
    }

    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println("Wonder woman attack " + avatarName + " with her wonder power");
    }
}
