import java.util.Scanner;

public  class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x = getInt();
        while (true) {
        char operation = getOperation();
            if (operation == 's') {
                break;
            }else if (operation == 'c') {
                x = getInt();
                operation = getOperation();
            }
        int y = getInt();
        int result = calc(x,y,operation);
        System.out.println("Результат : " +result);
        x = result;
        }
    }

    public static int getInt(){
        System.out.println("Введите число:");
        int number;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        } else {
            System.out.println("Ошибка, Допустимо только целое число");
            scanner.next();
            number = getInt();
        }
        return number;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Ошибка");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int x, int y, char operation){
        int result;
        switch (operation){
            case '+':
                result = x+y;
                break;
            case '-':
                result = x-y;
                break;
            case '*':
                result = x*y;
                break;
            case '/':
                result = x/y;
                break;
            default:
                System.out.println("Ошибка, допустимы:+,-,*,/");
                result = calc(x, y, getOperation());
        }
        return result;
    }
}