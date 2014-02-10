package model.interfaces;

import model.Avatar;

/**
 * The interface Strategist.
 */
public interface Strategist
{
    /**
     * Analyze weakness.
     *
     * @param avatarName the enemy name
     */
    void analyzeWeakness(Avatar avatarName);

    /**
     * try to command a strategy
     *
     * @param strategy the strategy
     * @return the boolean
     */
    boolean command(String strategy);
}
