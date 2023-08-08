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

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String birthDate = data[3];
            String phoneNumber = data[4];
            String gender = data[5];

            // Проверки формата введённых данных
            if (!birthDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
                throw new IllegalArgumentException("Неверный формат даты рождения");
            }

            if (!phoneNumber.matches("\\d+")) {
                throw new IllegalArgumentException("Неверный формат номера телефона");
            }

            if (!gender.matches("[fm]")) {
                throw new IllegalArgumentException("Неверный формат пола");
            }

        }
    }
}