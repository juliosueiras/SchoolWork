package model;

/**
 * The type Point system.
 */
public class PointSystem
{
    private final int fighting;
    private final int agility;
    private final int strength;
    private final int endurance;
    private final int reason;
    private final int intuition;
    private final int psyche;
    private final int hitPoints;

    /**
     * set new Point system.
     *
     * @param fighting  the fighting
     * @param agility   the agility
     * @param strength  the strength
     * @param endurance the endurance
     * @param reason    the reason
     * @param intuition the intuition
     * @param psyche    the psyche
     * @param hitPoints the hit points
     */
    public PointSystem(int fighting, int agility, int strength, int endurance, int reason, int intuition, int psyche, int hitPoints)
    {
        this.fighting = fighting;
        this.agility = agility;
        this.strength = strength;
        this.endurance = endurance;
        this.reason = reason;
        this.intuition = intuition;
        this.psyche = psyche;
        this.hitPoints = hitPoints;
    }

    /**
     * Gets fighting.
     *
     * @return the fighting
     */
    public int getFighting()
    {
        return fighting;
    }

    /**
     * Gets agility.
     *
     * @return the agility
     */
    public int getAgility()
    {
        return agility;
    }

    /**
     * Gets strength.
     *
     * @return the strength
     */
    public int getStrength()
    {
        return strength;
    }

    /**
     * Gets endurance.
     *
     * @return the endurance
     */
    public int getEndurance()
    {
        return endurance;
    }

    /**
     * Gets reason.
     *
     * @return the reason
     */
    public int getReason()
    {
        return reason;
    }

    /**
     * Gets intuition.
     *
     * @return the intuition
     */
    public int getIntuition()
    {
        return intuition;
    }

    /**
     * Gets psyche.
     *
     * @return the psyche
     */
    public int getPsyche()
    {
        return psyche;
    }

    /**
     * Gets hit points.
     *
     * @return the hit points
     */
    public int getHitPoints()
    {
        return hitPoints;
    }
}
