package lesson_4.task2;

interface Calculate {
   // double cPerim();         // Расчет периметра
    double cArea();          // Расчет площади
    String getfColor();         // Запрос цвета заливки
    String getbColor();         // Запрос цвета границы

    default void Display(){
        System.out.println("Периметр: " + this.cPerim());
        System.out.println("Площадь: " + this.cArea());
        System.out.println("Цвет фона: " + this.getfColor());
        System.out.println("Цвет границ: " + this.getbColor());
    }
   default double cPerim(){
       return 0;
   }

}

