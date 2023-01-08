package com.isep.rpg;

public class Potion implements Consumable {
    public Potion(int lifePointsBonus, int weaponDamageBonus, int armor, int manaPoints){
        this.lifePointsBonus = lifePointsBonus;
        this.weaponDamageBonus = weaponDamageBonus;
        this.armor = armor;
        this.manaPoints = manaPoints;
    }

    public int lifePointsBonus = 0;
    public int weaponDamageBonus = 0;
    public int armor = 0;
    public int manaPoints = 0;

    public void upgradePotion(int lifePointsBonus, int weaponDamageBonus, int armor, int manaPoints){
        this.lifePointsBonus += lifePointsBonus;
        this.weaponDamageBonus += weaponDamageBonus;
        this.armor += armor;
        this.manaPoints += manaPoints;
    }
}
