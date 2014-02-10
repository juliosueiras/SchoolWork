package model.hero;

import model.Avatar;
import model.Civilian;
import model.Superhero;
import model.interfaces.*;

/**
 * Created by julio on 2/6/14.
 */
public class Superman extends Superhero implements Tank, Brawler
{
    private Civilian girlfriend = new Civilian(1,1,1,1,1,1,1,1,"","");
    private Civilian friend = new Civilian(1,1,1,1,1,1,1,1,"","");

    /**
     * Instantiates a new Superman.
     *
     * @param fighting the fighting
     * @param agility the agility
     * @param strength the strength
     * @param endurance the endurance
     * @param reason the reason
     * @param intuition the intuition
     * @param psyche the psyche
     * @param hitPoints the hit points
     * @param firstName the first name
     * @param lastName the last name
     * @param secretIdentity the secret identity
     * @param energy the energy
     * @param homeTown the home town
     */
    public Superman(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown)
    {
        super(fighting, agility, strength, endurance, reason, intuition, psyche, hitPoints, firstName, lastName, secretIdentity, energy, homeTown);
    }

    /**
     * Heat vision.
     *
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
     * Fly void.
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
        System.out.println("Superman grapple" + avatarName);
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
