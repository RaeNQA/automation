package lesson_4.task2;
    // Класс для рассчета параметров круга
class Krug implements Calculate {
    private final double r;
    private final String fColor;
    private final String bColor;
    // Создаём конструктор с параметрами радиуса для расчетов и цветов.
    public Krug (double r, String fColor, String bColor) {
        this.r = r;
        this.fColor = fColor;
        this.bColor = bColor;
    }
    // Считаем периметр по формуле (C = 2 × π × r)
    @Override
    public double cPerim() {
        return 2 * 3.14 * r;
    }
    // Расчет площади круга S = π × r2
    @Override
    public double cArea() {
        return 3.14 * r * r;
    }

    @Override
    public String getfColor() {
        return fColor;
    }

    @Override
    public String getbColor() {
        return bColor;
    }
}

