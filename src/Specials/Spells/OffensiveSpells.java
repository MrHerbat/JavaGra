package Specials.Spells;
public enum OffensiveSpells {
    ;


    public int mpCost,minDmg,maxDmg,status1,status2;

    OffensiveSpells(int mpCost, int minDmg, int maxDmg) {
        this.mpCost = mpCost;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }

    OffensiveSpells(int mpCost, int minDmg, int maxDmg, int status1) {
        this.mpCost = mpCost;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.status1 = status1;
    }

    OffensiveSpells(int mpCost, int minDmg, int maxDmg, int status1, int status2) {
        this.mpCost = mpCost;
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
        this.status1 = status1;
        this.status2 = status2;
    }
}
