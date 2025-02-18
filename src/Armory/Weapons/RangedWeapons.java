package Armory.Weapons;

public enum RangedWeapons {
    SLING(WeaponTypes.SIMPLE, DamageType.BLUDGEONING, 4, 10, 30, 120),
    SHORT_BOW(WeaponTypes.SIMPLE,DamageType.PIERCING, 6, 250, 80,320, WeaponAttribute.TWO_HANDED),
    DART(WeaponTypes.SIMPLE, DamageType.PIERCING, 4, 5, 20, 60, WeaponAttribute.FINESSE, WeaponAttribute.THROWN),
    LIGHT_CROSSBOW(WeaponTypes.SIMPLE, DamageType.PIERCING, 8, 250, 80,320, WeaponAttribute.LOADING, WeaponAttribute.TWO_HANDED),
    LONGBOW(WeaponTypes.MARTIAL, DamageType.PIERCING, 8, 500, 150,600,WeaponAttribute.HEAVY,WeaponAttribute.TWO_HANDED),
    HEAVY_CROSSBOW(WeaponTypes.MARTIAL, DamageType.PIERCING, 10, 500, 100,400, WeaponAttribute.HEAVY, WeaponAttribute.LOADING, WeaponAttribute.TWO_HANDED),
    HAND_CROSSBOW(WeaponTypes.MARTIAL, DamageType.PIERCING, 6, 750, 30,120, WeaponAttribute.LIGHT,WeaponAttribute.LOADING),
    BLOWGUN(WeaponTypes.MARTIAL,DamageType.PIERCING,1,100,25,100,WeaponAttribute.LOADING);


   public WeaponTypes wt;
   public DamageType dt;
   public int dmgDice, cost, effectiveRange,maxRange;
   public WeaponAttribute wa1,wa2,wa3;

    RangedWeapons(WeaponTypes wt, DamageType dt, int dmgDice, int cost, int effectiveRange, int maxRange) {
        this.wt = wt;
        this.dt = dt;
        this.dmgDice = dmgDice;
        this.cost = cost;
        this.effectiveRange = effectiveRange;
        this.maxRange = maxRange;
    }

    RangedWeapons(WeaponTypes wt, DamageType dt, int dmgDice, int cost, int effectiveRange, int maxRange, WeaponAttribute wa1) {
        this.wt = wt;
        this.dt = dt;
        this.dmgDice = dmgDice;
        this.cost = cost;
        this.effectiveRange = effectiveRange;
        this.maxRange = maxRange;
        this.wa1 = wa1;
    }

    RangedWeapons(WeaponTypes wt, DamageType dt, int dmgDice, int cost, int effectiveRange, int maxRange, WeaponAttribute wa1, WeaponAttribute wa2) {
        this.wt = wt;
        this.dt = dt;
        this.dmgDice = dmgDice;
        this.cost = cost;
        this.effectiveRange = effectiveRange;
        this.maxRange = maxRange;
        this.wa1 = wa1;
        this.wa2 = wa2;
    }

    RangedWeapons(WeaponTypes wt, DamageType dt, int dmgDice, int cost, int effectiveRange, int maxRange, WeaponAttribute wa1, WeaponAttribute wa2, WeaponAttribute wa3) {
        this.wt = wt;
        this.dt = dt;
        this.dmgDice = dmgDice;
        this.cost = cost;
        this.effectiveRange = effectiveRange;
        this.maxRange = maxRange;
        this.wa1 = wa1;
        this.wa2 = wa2;
        this.wa3 = wa3;
    }
}

