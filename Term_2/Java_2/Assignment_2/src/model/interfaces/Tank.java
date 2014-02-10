package model.interfaces;

import model.Avatar;

/**
 * The interface Tank.
 */
public interface Tank
{
    /**
     * defend against the enemy.
     *
     * @param avatarName the enemy name
     */
    void defend(Avatar avatarName);

    /**
     * crush the enemy
     *
     * @param avatarName the enemy name
     */
    void crush(Avatar avatarName);
}

