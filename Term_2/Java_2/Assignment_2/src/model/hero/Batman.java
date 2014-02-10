package model.hero;

import model.Avatar;
import model.PointSystem;
import model.Superhero;
import model.interfaces.*;


/**
 * Batman: the superhero with no power
 */
public class Batman extends Superhero implements Strategist, Shooter,MartialArtist,Brawler
{

    private boolean armed;

    private Superhero sideKick;

    /**
     * create new Batman.
     *
     * @param inputPoints the input points
     * @param firstName the first name
     * @param lastName the last name
     * @param secretIdentity the secret identity
     * @param energy the energy
     * @param homeTown the home town
     * @param sideKick the side kick
     * @param armed the armed
     */
    public Batman(PointSystem inputPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown, Superhero sideKick, boolean armed)
    {
        super(inputPoints, firstName, lastName, secretIdentity, energy, homeTown);
        this.sideKick = sideKick;
        this.armed = armed;
    }

    /**
     * Night vision.
     */
    public void nightVision()
    {
        System.out.println("Batman use night vision!");
    }

    /***
     *
     * @param avatarName the avatar name
     */
    public void blind(Avatar avatarName)
    {
        System.out.println("Batman use blind on "+ avatarName);
    }

    /***
     *
     */
    public void thermalGrenade()
    {
        System.out.println("Batman use thermal Grenade!");
    }

    /**
     * Intimidate void.
     *
     * @param avatarName the avatar name
     */
    public void intimidate(Avatar avatarName)
    {
        System.out.println("Batman use intimidate on " + avatarName);
    }

    /**
     * Surprise void.
     *
     * @param avatarName the enemy name
     */
    public void surprise(Avatar avatarName)
    {
        System.out.println("Batman use surprise on " + avatarName);
    }

    @Override
    public void analyzeWeakness(Avatar avatarName)
    {
        System.out.println("Batman use analyze weakness on " + avatarName + ", now Batman know all weakness");
    }

    @Override
    public boolean command(String strategy)
    {
        System.out.println("Batman fail to do " + strategy + " command");
        return false;
    }

    @Override
    public void brawl(Avatar avatarName)
    {
        System.out.println("Batman use brawl on " + avatarName);
    }

    @Override
    public void grapple(Avatar avatarName)
    {
        System.out.println("Batman use grapple on " + avatarName);
    }

    @Override
    public void stealthAttack(Avatar avatarName)
    {
        System.out.println("Batman use stealth attack on " + avatarName);
    }

    @Override
    public boolean evade()
    {
        System.out.println("Batman have evaded!");
        return true;
    }

    @Override
    public void shoot(String weaponName, Avatar avatarName)
    {
        System.out.println("Batman use " + weaponName + " on " + avatarName);
    }

    @Override
    public void blastArea()
    {
        System.out.println("Batman blast the area away with his power attack!");
    }

    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println("Batman attack " + avatarName + " with his takedown");
    }

    /**
     * Gets side kick.
     *
     * @return the side kick
     */
    public Superhero getSideKick()
    {
        return sideKick;
    }

    /**
     * Sets side kick.
     *
     * @param sideKick the side kick
     */
    public void setSideKick(Superhero sideKick)
    {
        this.sideKick = sideKick;
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
}
