package Test117;

public enum Color {
    RED(255,0,0,"红色"),
    ORANGE(255,128,0,"橙色"),
    GREEN(0,255,0,"绿色"),
    BLUE(0,0,255,"蓝色"),
    ;

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name()
                +
                "("+red+","+green+","+blue+")"
                +"->"+description;
    }

}
