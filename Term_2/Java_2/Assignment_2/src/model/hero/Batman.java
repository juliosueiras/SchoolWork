package model.hero;

import model.Avatar;
import model.Superhero;
import model.interfaces.*;



/**
 * Created by julio on 2/6/14.
 */
public class Batman implements Strategist, Shooter,MartialArtist,Brawler
{

    private boolean armed;
    private Superhero sideKick = new Superhero();

    public void nightVision()
    {

    }

    /***
     *
     * @param a
     */
    public void blind(Avatar a)
    {

    }

    /***
     *
     */
    public void thermalGrenade()
    {

    }

    public void intimidate(Avatar a)
    {

    }

    public void surprise(Avatar a)
    {

    }

    @Override
    public void analyzeWeakness(Avatar a)
    {

    }

    @Override
    public boolean command(String strategy)
    {
        return false;
    }

    @Override
    public void brawl(Avatar a)
    {

    }

    @Override
    public void grapple(Avatar a)
    {

    }

    @Override
    public void stealthAttack(Avatar a)
    {

    }

    @Override
    public boolean evade()
    {
        return false;
    }

    @Override
    public void shoot(String s, Avatar a)
    {

    }

    @Override
    public void blastArea()
    {

    }
}
