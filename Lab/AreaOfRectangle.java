import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
           //Area = length*width;
        int area = length*width;
        System.out.println(area);
    }
}
