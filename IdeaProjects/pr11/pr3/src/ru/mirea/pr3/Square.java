package ru.mirea.pr3;
  //Создаем наследника класса Rectangle - класс Square
public class Square extends Rectangle {
  //Создаем конструктор со значениями параметров по умолчанию
  public Square() {
    color = "none";
    filled = false;
    width = length = 9;
  }
  //Создаем конструктор с значением параметра size
  public Square(double side) {
    width = length = side;
  }
  //Создаем конструктор с произвольными значениями параметров
  public Square(double side, String color, boolean filled) {
    width = length = side;
    this.color = color;
    this.filled = filled;
  }
  //Создаем методы для данного класса по диаграмме UML
  public double getSide() {
    return length;
  }

  public void setSide(double side) {
    width = length = side;
  }

  public void setWidth (double width) {
    this.width = width;
  }

  public void setLength (double length) {
    this.length = length;
  }

  @Override
  public String toString() {
    return "Square{" +
            "width=" + width +
            ", length=" + length +
            '}' + "Shape{" +
            "color='" + color + '\'' +
            ", filled=" + filled +
            '}';
  }
}
