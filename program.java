/*
 import java.util.Deque;
import java.util.LinkedList;

public class DequeOperations {
    public static void main(String[] args) {
        Deque<Integer> num1 = new LinkedList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        
        Deque<Integer> num2 = new LinkedList<>();
        num2.add(3);
        num2.add(4);
        num2.add(5);
        
        // 1) Умножение двух чисел
        Deque<Integer> multiplicationResult = multiply(num1, num2);
        System.out.println("Умножение: " + multiplicationResult);
        
        // 2) Сложение двух чисел
        Deque<Integer> additionResult = add(num1, num2);
        System.out.println("Сложение: " + additionResult);
    }
    
    public static Deque<Integer> multiply(Deque<Integer> num1, Deque<Integer> num2) {
        int m = num1.size();
        int n = num2.size();
        int[] result = new int[m + n];
        
        for (int i = 0; i < m; i++) {
            int digit1 = num1.removeFirst();
            
            for (int j = 0; j < n; j++) {
                int digit2 = num2.removeFirst();
                result[i + j] += digit1 * digit2;
            }
        }
        
        int carry = 0;
        Deque<Integer> product = new LinkedList<>();
        
        for (int i = 0; i < result.length; i++) {
            int sum = result[i] + carry;
            product.add(sum % 10);
            carry = sum / 10;
        }
        
        while (carry != 0) {
            product.add(carry % 10);
            carry /= 10;
        }
        
        return product;
    }
    
    public static Deque<Integer> add(Deque<Integer> num1, Deque<Integer> num2) {
        int carry = 0;
        Deque<Integer> sum = new LinkedList<>();
        
        while (!num1.isEmpty() || !num2.isEmpty() || carry != 0) {
            int digit1 = num1.isEmpty() ? 0 : num1.removeFirst();
            int digit2 = num2.isEmpty() ? 0 : num2.removeFirst();
            
            int currSum = digit1 + digit2 + carry;
            sum.add(currSum % 10);
            carry = currSum / 10;
        }
        
        return sum;
    }
}

 */