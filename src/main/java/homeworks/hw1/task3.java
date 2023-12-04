// При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

package homeworks.hw1;

public class task3 {
    public static void main(String[] args) {
        System.out.println(calculate('+', 5, 2));
        System.out.println(calculate('/', 5, 0));
        System.out.println(calculate('$', 5, 1));
    }

    public static int calculate(char op, int a, int b) {

            if (op == '+'){
                return a + b;
            } else if (op == '-') {
                return a - b;
            } else if (op == '*') {
                return a * b;
            } else if (op == '/'){
                if (b == 0)
                    throw new UnsupportedOperationException("на 0 делить нельзя");
                return a / b;
            }
            else {
                throw new UnsupportedOperationException("Некорректный оператор:" + op);
            }
//        } catch (Exception err) {
//            System.out.println(err.getMessage());
//            return 0;

    }
}
