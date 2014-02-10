package model.hero;

import model.Avatar;
import model.PointSystem;
import model.Superhero;
import model.interfaces.MartialArtist;
import model.interfaces.Shooter;


/**
 * Flash:a superhero with greate speed
 */
public class Flash extends Superhero implements MartialArtist, Shooter
{
    private boolean invisible;
    private boolean intangible;

    /**
     * create new Flash.
     *
     * @param pointSystem    the point system
     * @param firstName      the first name
     * @param lastName       the last name
     * @param secretIdentity the secret identity
     * @param energy         the energy
     * @param homeTown       the home town
     * @param invisible      the invisible
     * @param intangible     the intangible
     */
    public Flash(PointSystem pointSystem, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown, boolean invisible, boolean intangible)
    {
        super(pointSystem, firstName, lastName, secretIdentity, energy, homeTown);
        this.invisible = invisible;
        this.intangible = intangible;
    }

    /**
     * Is intangible.
     *
     * @return the boolean
     */
    public boolean isIntangible()
    {
        return intangible;
    }

    /**
     * Sets intangible.
     *
     * @param intangible the intangible
     */
    public void setIntangible(boolean intangible)
    {
        this.intangible = intangible;
    }

    /**
     * Is invisible.
     *
     * @return the boolean
     */
    public boolean isInvisible()
    {
        return invisible;
    }

    /**
     * Sets invisible.
     *
     * @param invisible the invisible
     */
    public void setInvisible(boolean invisible)
    {
        this.invisible = invisible;
    }

    /**
     * Cyclone void.
     */
    public void cyclone()
    {
        System.out.println("Flash use cyclone!");
    }

    /**
     * Vibrate void.
     */
    public void vibrate()
    {
        System.out.println("Flash use vibrate!");
    }

    /**
     * Supersonic void.
     */
    public void supersonic()
    {
        System.out.println("Flash use supersonic!");
    }

    @Override
    public void stealthAttack(Avatar avatarName)
    {
        System.out.println("Flash use stealth attack on " + avatarName);
    }

    @Override
    public boolean evade()
    {
        System.out.println("Flash evaded");
        return true;
    }

    @Override
    public void shoot(String weaponName, Avatar avatarName)
    {
            System.out.println("Flash shoot " + avatarName + " with " + weaponName);
    }

    @Override
    public void blastArea()
    {
        System.out.println("Flash blasted the area away with his speed");
    }
    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println("Flash fight " + avatarName + " with his speed punch");
    }
}
