import java.util.Scanner;

public class InputInformation {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные через ПРОБЕЛ: Ф.И.О человека, дату рождения - yyyy.mm.dd, номер телефона, пол - f/m: ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели неполную информацию. Пожалуйста, будьте внимательны!");
            } else System.out.println("В строке присутствуют лишние данные. Повторите попытку!");
        }

    }
}
