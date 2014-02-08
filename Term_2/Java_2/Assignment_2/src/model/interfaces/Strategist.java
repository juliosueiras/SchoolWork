package model.interfaces;

import model.Avatar;

/**
 * Created by julio on 2/6/14.
 */
public interface Strategist
{
    void analyzeWeakness(Avatar avatarName);
    boolean command(String strategy);
}
