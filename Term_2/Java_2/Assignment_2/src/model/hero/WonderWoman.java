package model.hero;

import model.Avatar;
import model.Superhero;
import model.interfaces.*;


/**
 * Created by julio on 2/6/14.
 */
public class WonderWoman extends Superhero implements Strategist,Brawler
{
    private boolean armed;
    private int mysticEnergy;

    public WonderWoman(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown)
    {
        super(fighting, agility, strength, endurance, reason, intuition, psyche, hitPoints, firstName, lastName, secretIdentity, energy, homeTown);
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
