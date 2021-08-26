package ru.mirea.pr6;
// Создаем класс, который будет сортировать наш массив
public class Sorting {
      // Сортируем массив при помощи метода sort сортировкой вставками
      public void sort(Student[] arr) {
            for (int i = 1; i < arr.length; i++){
                  Student key = arr[i];
                  int j = i - 1;
                  while (j >= 0 && arr[j].iDNumber > key.iDNumber) {
                        arr[j+1] = arr[j];
                        j--;
                  }
                  arr[j+1] = key;
            }
      }
}
