import java.util.Scanner;

public class FirstCode2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
            //scanner хувьсагчийг зарласан
            String input = scanner.nextLine();//nextLine()//run Хийхэд эхний Input оруулна
             //int авна - input оролт нь string байна
          //  System.out.print(input);
            //int number = Integer.parseInt(input);//энэ функц гаднаас string аваад буцаахдаа Int буцаана
            int number = scanner.nextInt();//зөврөн бүхэл тоо үүсгэдэг функц, nextInt ажиллаад int төрөл болгоно//2 дахь оролт run хийсний дараа
            System.out.println(input);
            System.out.println(number);

        }

    }
