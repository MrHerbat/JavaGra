package Specials.Spells;

public enum DefensiveSpells
{
    ;

    public int mpCost,minHeal,maxHeal,status1,status2;

    DefensiveSpells(int mpCost, int minHeal, int maxHeal) {
        this.mpCost = mpCost;
        this.minHeal = minHeal;
        this.maxHeal = maxHeal;
    }

    DefensiveSpells(int mpCost, int minHeal, int maxHeal, int status1) {
        this.mpCost = mpCost;
        this.minHeal = minHeal;
        this.maxHeal = maxHeal;
        this.status1 = status1;
    }

    DefensiveSpells(int mpCost, int minHeal, int maxHeal, int status1, int status2) {
        this.mpCost = mpCost;
        this.minHeal = minHeal;
        this.maxHeal = maxHeal;
        this.status1 = status1;
        this.status2 = status2;
    }
}
