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
        System.out.print("Flash use stealth attack on " + avatarName);
    }

    @Override
    public boolean evade()
    {
        return false;
    }

    @Override
    public void shoot(String weaponName, Avatar avatarName)
    {

    }

    @Override
    public void blastArea()
    {

    }

    @Override
    public void fight(Avatar avatarName)
    {

    }
}
