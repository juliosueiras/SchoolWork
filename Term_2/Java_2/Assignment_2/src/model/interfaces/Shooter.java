package model.interfaces;

import model.Avatar;

/**
 * Created by julio on 2/6/14.
 */
public interface Shooter
{
    void shoot(String weaponName, Avatar avatarName);
    void blastArea();
}
