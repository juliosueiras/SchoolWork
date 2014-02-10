package model.interfaces;

import model.Avatar;

/**
 * The interface Martial artist.
 */
public interface MartialArtist
{
    /**
     * use stealth attack on enemy
     *
     * @param avatarName the enemy name
     */
    void stealthAttack(Avatar avatarName);

    /**
     * try to evaded
     *
     * @return the boolean
     */
    boolean evade();
}
