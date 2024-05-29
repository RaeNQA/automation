package lesson_4.task2;

class Krug implements Calculate {
    private double radius;
    private String color;
    private String borderColor;

    public Krug (double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.color = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }
}

