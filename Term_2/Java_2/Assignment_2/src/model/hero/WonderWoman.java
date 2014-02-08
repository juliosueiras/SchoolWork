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

    public void deflect()
    {

    }

    public void lasso(Avatar a)
    {

    }

    public void interrogate(Avatar a)
    {

    }

    @Override
    public void analyzeWeakness(Avatar avatarName)
    {

    }

    @Override
    public boolean command(String strategy)
    {
        return false;
    }

    @Override
    public void brawl(Avatar avatarName)
    {

    }

    @Override
    public void grapple(Avatar avatarName)
    {

    }

    @Override
    public void fight(Avatar avatarName)
    {
        super.fight(avatarName);
    }
}
