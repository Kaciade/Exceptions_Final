import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prom {
    public static void main(String[] args) {
        try {
            // Получение данных от пользователя
            System.out.println("Введите данные в формате\nФамилия Имя Отчество дд.мм.гггг Номер_телефона Пол( m(мужской) / f(женский) ): ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            scanner.close();

            // Проверка количества введённых данных
            String[] data = input.split(" ");
            if (data.length != 6) {
                throw new IllegalArgumentException("Введено неверное количество данных");
            }


        }
    }
}