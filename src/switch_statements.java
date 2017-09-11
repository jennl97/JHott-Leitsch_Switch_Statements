import java.util.Scanner;

public class switch_statements {
    public static void main(String[] args) {
        int numbers;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a whole number between 1-10");
        numbers = scanner.nextInt();
        String numberResponse;
        switch (numbers) {
            case 1:
                numberResponse = "Uno";
                break;
            case 2:
                numberResponse = "Dos";
                break;
            case 3:
                numberResponse = "Tres";
                break;
            case 4:
                numberResponse = "Cuatro";
                break;
            case 5:
                numberResponse = "Cinco";
                break;
            case 6:
                numberResponse = "Sies";
                break;
            case 7:
                numberResponse = "Siete";
                break;
            case 8:
                numberResponse = "Ocho";
                break;
            case 9:
                numberResponse = "Nueve";
                break;
            case 10:
                numberResponse = "Diez";
                break;
            default:
                numberResponse = "No hablo grandes números";

        }
        System.out.println(numberResponse);
    }}