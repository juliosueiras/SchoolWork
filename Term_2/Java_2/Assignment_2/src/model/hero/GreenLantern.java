package model.hero;

import model.Avatar;
import model.PointSystem;
import model.Superhero;
import model.interfaces.Shooter;


/**
 * Green Lantern: the superhero with the green ring to construct object
 */
public class GreenLantern extends Superhero implements Shooter
{
    private int sector;
    private double ringCharge;

    /**
     * create Green lantern.
     *
     * @param inputPoints    the points system
     * @param firstName      the first name
     * @param lastName       the last name
     * @param secretIdentity the secret identity
     * @param energy         the energy
     * @param homeTown       the home town
     * @param sector         the sector
     * @param ringCharge     the ring charge
     */
    public GreenLantern(PointSystem inputPoints, String firstName, String lastName, boolean secretIdentity, int energy, String homeTown, int sector, double ringCharge)
    {
        super(inputPoints, firstName, lastName, secretIdentity, energy, homeTown);
        this.sector = sector;
        this.ringCharge = ringCharge;
    }

    /**
     * Gets sector.
     *
     * @return the sector
     */
    public int getSector()
    {
        return sector;
    }

    /**
     * Sets sector.
     *
     * @param sector the sector
     */
    public void setSector(int sector)
    {
        this.sector = sector;
    }

    /**
     * Gets ring charge.
     *
     * @return the ring charge
     */
    public double getRingCharge()
    {
        return ringCharge;
    }

    /**
     * Sets ring charge.
     *
     * @param ringCharge the ring charge
     */
    public void setRingCharge(double ringCharge)
    {
        this.ringCharge = ringCharge;
    }

    /**
     * make Green Lantern Fly
     */
    public void fly()
    {
        System.out.println("Green lantern use fly");
    }

    /**
     * make green lantern use shield to protect himself
     *
     * @param avatarName the enemy name
     */
    public void shield(Avatar avatarName)
    {
        System.out.println("Green lantern shield from the attack of " + avatarName);
    }

    /**
     * make green lantern construct something with his ring
     *
     * @param constructObject the object that green lantern is going to construct
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
        System.out.println("Green Lantern blasted the area away!");
    }

    @Override
    public void fight(Avatar avatarName)
    {
        System.out.println("Green lantern attack " + avatarName + " with his ring power!");
    }
}
