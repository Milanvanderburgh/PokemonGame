package nl.delphinity.pokemon.model.trainer;

import nl.delphinity.pokemon.model.area.Area;

public class GymLeader extends Trainer {

    private boolean isDefeated;
    private final Badge badge;

    public GymLeader(String name, Badge badge, Area area) {
        super(name, area);
        this.badge = badge;
    }

    public boolean isDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }

    public Badge getBadge() {
        return badge;
    }
    
}
