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
    private Civilian girlfriend = new Civilian();
    private Civilian friend = new Civilian();

    /**
     * Heat vision.
     *
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
