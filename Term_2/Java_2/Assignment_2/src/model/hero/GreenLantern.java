package model.hero;

import model.Avatar;
import model.Superhero;
import model.interfaces.Shooter;

/**
 * Created by julio on 2/6/14.
 */
public class GreenLantern extends Superhero implements Shooter
{
    private int sector;
    private double ringCharge;

    /**
     * Fly void.
     */
    public void fly()
    {
        System.out.println("Green lantern use fly");
    }

    /**
     * Shield void.
     *
     * @param avatarName the enemy name
     */
    public void shield(Avatar avatarName)
    {
        System.out.println("Green lantern shield from the attack of " + avatarName);
    }

    /**
     * Construct void.
     *
     * @param constructObject the construct object
     */
    public void construct(String constructObject)
    {
        System.out.println("Green lantern have construct " + constructObject + " with his ring");
    }
    
    @Override
    public void shoot(String weaponName, Avatar avatarName)
    {
        System.out.println("Green lantern shoot " + avatarName + " with " + weaponName);
    }

    @Override
    public void blastArea()
    {
        System.out.println("Green blasted the area away!");
    }

    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println("Green lantern attack " + avatarName + " with his ring power!");
    }
}
