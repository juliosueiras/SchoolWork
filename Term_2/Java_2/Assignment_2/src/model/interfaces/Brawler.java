package model.interfaces;

import model.Avatar;

/**
 * The interface Brawler.
 */
public interface Brawler
{
    /**
     * use brawl on enemy
     *
     * @param avatarName the enemy name
     */
    void brawl(Avatar avatarName);

    /**
     * use grapple on enemy
     *
     * @param avatarName the enemy name
     */
    void grapple(Avatar avatarName);
}
