package com.isep.rpg;

public abstract class SpellCaster extends Hero {
    public SpellCaster(int lifePoints, int manaPoints, int armor, int weaponDamage, int nPotion, int nFood) {
        super(lifePoints, armor, weaponDamage, nPotion, nFood);
        this.manaPoints = manaPoints;
    }

    public int manaPoints;
    @Override
    public String toString(){
        return ((this instanceof Mage ? "Mage" : "Healer")+"(Hero) <lifePoints: "+lifePoints+", manaPoints: "+manaPoints+", armor: "+armor+", weaponDamage: "+weaponDamage+", nPotions: "+potions.size()+", nLembas: "+lembas.size()+">");
    }
}
