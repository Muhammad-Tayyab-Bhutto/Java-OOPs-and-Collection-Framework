package com.isep.rpg;

public class Mage extends SpellCaster {

    public Mage() {
        super(40, 15, 40, 50, 2, 4);
        this.healPower = armor;
        this.maxArmor = armor;
        this.maxWeaponDamage = weaponDamage*2;
    }

    @Override
    public int attack() {
        if(manaPoints == 0){return 0;}
        manaPoints--;
        return weaponDamage;
    }

    @Override
    public int defend() {
        //should better make it defend an hero
        return armor;
    }

    @Override
    public void useConsumable(Consumable consumable) {
        if (consumable instanceof Potion) {
            if (potions.size() == 0) {
                System.out.println("Have no potion to consume");
                return;
            }
            this.manaPoints += 3;
            //so that armor health ranges between 0 to 30
            armor += (armor <= maxArmor-((Potion)consumable).armor ? ((Potion)consumable).armor : 0);
            //so that hero health remains between 1 to 80
            lifePoints += (lifePoints <= maxLifePoints-((Potion)consumable).lifePointsBonus ? ((Potion)consumable).lifePointsBonus : 0);
            //so that hero weaponDamage ranges between 0 to 30
            weaponDamage += (weaponDamage<=maxWeaponDamage-((Potion)consumable).weaponDamageBonus ? ((Potion)consumable).weaponDamageBonus : 0);
            this.potions.remove(potions.size() - 1);
        } else {
            if (lifePoints < 100) {
                if (lembas.size() == 0) {
                    System.out.println("Have no food to consume");
                    return;
                }
                lifePoints += (lifePoints <= maxLifePoints-((Food)consumable).lifePointsBonus ? ((Food)consumable).lifePointsBonus : 0);
                weaponDamage += (weaponDamage<=maxWeaponDamage-((Food)consumable).weaponDamageBonus ? ((Food)consumable).weaponDamageBonus : 0);
                this.lembas.remove(lembas.size() - 1);
            }
        }
    }
}