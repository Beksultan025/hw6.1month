public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setHealth(1000);
        boss.setDamage(100);

        boss.weapon.setWeaponType(WeaponType.CRIMINAL_WEAPON);
        boss.weapon.setWeaponName("AK-47");

        System.out.println("Boss Health: " + boss.getHealth() + " Boss Damage: " +
                boss.getDamage() + " Boss WeaponName: " + boss.weapon.getWeaponName() +
                " Boss WeaponType: " + boss.weapon.getWeaponType());
    }
}