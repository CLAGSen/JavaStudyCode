package Test129.Test01;

public class Person {
    private String name;
    private int lifeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) throws NoLifeValueException {

        if (lifeValue>=0) {
            this.lifeValue = lifeValue;
        } else {
            throw new NoLifeValueException ("生命值不能为负数");

        }
    }

    public Person() {
    }

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }
}
