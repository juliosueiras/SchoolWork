package model.hero;

import model.Avatar;
import model.Superhero;
import model.interfaces.MartialArtist;
import model.interfaces.Shooter;

import java.util.Arrays;

/**
 * Created by julio on 2/6/14.
 */
public class Flash extends Superhero implements MartialArtist, Shooter
{
    private boolean invisible,
                    intangible;

    public Flash(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown, boolean invisible, boolean intangible)
    {
        super(fighting, agility, strength, endurance, reason, intuition, psyche, hitPoints, firstName, lastName, secretIdentity, energy, homeTown);
        this.invisible = invisible;
        this.intangible = intangible;
    }

    public void cyclone()
    {
        System.out.println("Flash use cyclone!");
    }

    public void vibrate()
    {
        System.out.println("Flash use vibrate!");
    }

    public void supersonic()
    {
        System.out.println("Flash use supersonic!");
    }

    @Override
    public void stealthAttack(Avatar avatarName)
    {
        System.out.println("Flash use stealth attack on " + avatarName.getFirstName() + " " + avatarName.getLastName());
    }

    @Override
    public boolean evade()
    {
        return false;
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
        System.out.println("Flash fight " + avatarName + " with his speed punch ");
    }
}
