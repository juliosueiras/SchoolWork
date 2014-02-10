package model.hero;

import model.Avatar;
import model.Civilian;
import model.PointSystem;
import model.Superhero;
import model.interfaces.*;

/**
 * Superman: greatest superhero
 */
public class Superman extends Superhero implements Tank, Brawler
{
    private Civilian girlfriend;
    private Civilian friend;

    /**
     * create new Superman.
     *
     * @param inputPoints    the input points
     * @param firstName      the first name
     * @param lastName       the last name
     * @param secretIdentity the secret identity
     * @param energy         the energy
     * @param homeTown       the home town
     * @param girlfriend     the girlfriend
     * @param friend         the friend
     */
    public Superman(PointSystem inputPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown, Civilian girlfriend, Civilian friend)
    {
        super(inputPoints, firstName, lastName, secretIdentity, energy, homeTown);
        this.girlfriend = girlfriend;
        this.friend = friend;
    }

    /**
     * Gets friend.
     *
     * @return the friend
     */
    public Civilian getFriend()
    {
        return friend;
    }

    /**
     * Sets friend.
     *
     * @param friend the friend
     */
    public void setFriend(Civilian friend)
    {
        this.friend = friend;
    }

    /**
     * Gets girlfriend.
     *
     * @return the girlfriend
     */
    public Civilian getGirlfriend()
    {
        return girlfriend;
    }

    /**
     * Sets girlfriend.
     *
     * @param girlfriend the girlfriend
     */
    public void setGirlfriend(Civilian girlfriend)
    {
        this.girlfriend = girlfriend;
    }

    /**
     * Heat vision.
     */
    public void heatVision()
    {
        System.out.println("Superman use heat vision! it melt through metal!!");
    }

    /**
     * Cold breath.
     */
    public void coldBreath()
    {
        System.out.println("Superman use cold breath! it freeze even atom!");
    }

    /**
     * X ray vision.
     */
    public void xRayVision()
    {
        System.out.println("Superman use x ray vision! it see through everything");
    }

    /**
     * Fly
     */
    public void fly()
    {
        System.out.println("Superman use fly! in sonic speed");
    }

    @Override
    public void brawl(Avatar avatarName)
    {
        System.out.println("Superman brawl " + avatarName);
    }

    @Override
    public void grapple(Avatar avatarName)
    {
        System.out.println("Superman grapple " + avatarName);
    }

    @Override
    public void defend(Avatar avatarName)
    {
        System.out.println("Superman defend " + avatarName);
    }

    @Override
    public void crush(Avatar avatarName)
    {
        System.out.println("Superman crush " + avatarName);
    }

    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println("Superman fight " + avatarName + " with super-punch");
    }
}
