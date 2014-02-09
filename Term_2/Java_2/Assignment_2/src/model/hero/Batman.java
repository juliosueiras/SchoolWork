package model.hero;

import model.Avatar;
import model.Superhero;
import model.interfaces.*;



/**
 * Created by julio on 2/6/14.
 */
public class Batman extends Superhero implements Strategist, Shooter,MartialArtist,Brawler
{

    private boolean armed;
    private Superhero sideKick = new Superhero(1,1,1,1,1,1,1,1,"Robin","Sidekick",true,1,"Gotham");

    public Batman(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown, boolean armed)
    {
        super(fighting, agility, strength, endurance, reason, intuition, psyche, hitPoints, firstName, lastName, secretIdentity, energy, homeTown);
        this.armed = armed;
    }

    public void nightVision()
    {
        System.out.println("Batman use night vision!");
    }

    /***
     *
     * @param avatarName
     */
    public void blind(Avatar avatarName)
    {
        System.out.println("Batman use blind on " + (avatarName.getFirstName() + " " + avatarName.getLastName()));
    }

    /***
     *
     */
    public void thermalGrenade()
    {
        System.out.println("Batman use thermal Grenade!");
    }

    public void intimidate(Avatar avatarName)
    {
        System.out.println("Batman use intimidate on " + avatarName);
    }

    public void surprise(Avatar avatarName)
    {
        System.out.println("Batman use surprise on " + avatarName);
    }

    @Override
    public void analyzeWeakness(Avatar avatarName)
    {
        System.out.println("Batman use analyze weakness on" + avatarName + ", now Batman know all weakness");
    }

    @Override
    public boolean command(String strategy)
    {
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
        return false;
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
}
