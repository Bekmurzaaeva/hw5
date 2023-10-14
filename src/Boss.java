class Boss {
    private int health;
    private int damage;
    private String defenseType;

    // Геттеры
    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    // Сеттеры
    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    // Конструктор (без дополнительных конструкторов, согласно условиям)
    public Boss(int health, int damage, String defenseType) {
        this.health = health;
        this.damage = damage;
        this.defenseType = defenseType;
    }
}
