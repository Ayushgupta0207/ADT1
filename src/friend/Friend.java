package friend;

import java.util.Locale;

public class Friend {
    private String name;
    private float udharMoney;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUdharMoney() {
        return udharMoney;
    }

    @Override
    public String toString() {
        return String.format(
                Locale.ENGLISH,
                "%s ne %.2f Rs udhar liya hua h !",
                this.getName(), this.getUdharMoney()
        );
    }

    public void setUdharMoney(float udharMoney) {
        this.udharMoney = udharMoney;
    }

    public Friend(String name, float udharMoney) {
        this.name = name;
        this.udharMoney = udharMoney;
    }
}
