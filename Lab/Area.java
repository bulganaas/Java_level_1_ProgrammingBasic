import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        String input = scanner.nextLine();//nextLine()//run Хийхэд эхний Input оруулна
        //int авна - input оролт нь string байна
        int a = Integer.parseInt(input);//input-ээ int болгоно

        int area = a * a;
        System.out.print(area);
    }
}
