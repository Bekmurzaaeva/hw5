



public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1000, 50, "Armor");
        System.out.println("Здоровье босса: " + boss.getHealth());
        System.out.println("Урон босса: " + boss.getDamage());
        System.out.println("Тип защиты босса: " + boss.getDefenseType());

        Hero hero1 = new Hero(100, 20, "Лазерный взгляд");
        System.out.println("\nЗдоровье героя 1: " + hero1.getHealth());
        System.out.println("Урон героя 1: " + hero1.getDamage());
        System.out.println("Суперспособность героя 1: " + hero1.getSuperpower());

        Hero hero2 = new Hero(120, 30);
        System.out.println("\nЗдоровье героя 2: " + hero2.getHealth());
        System.out.println("Урон героя 2: " + hero2.getDamage());
        System.out.println("Суперспособность героя 2: " + hero2.getSuperpower());
    }
}