package model.interfaces;

import model.Avatar;

/**
 * The interface Shooter.
 */
public interface Shooter
{
    /**
     * shoot enemy with weapon
     *
     * @param weaponName the weapon name
     * @param avatarName the enemy name
     */
    void shoot(String weaponName, Avatar avatarName);

    /**
     * Blast area.
     */
    void blastArea();
}
