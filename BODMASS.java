import java.util.Scanner;
import java.util.Stack;

import java.util.*;

public class BODMASS {
    public static int solver(String EXPRSN) {
        char[] ARR = EXPRSN.toCharArray();
 Stack<Integer> operands = new Stack<Integer>();
        Stack<Character> operators= new Stack<Character>();

        for (int i = 0; i < ARR.length; i++) {
            if (ARR[i] == ' ')
                continue;
            if (ARR[i] >= '0' && ARR[i] <= '9') {
                StringBuffer buff_s = new StringBuffer();
                while (i < ARR.length && ARR[i] >= '0' && ARR[i] <= '9')
                    buff_s.append(ARR[i++]);
                operands.push(Integer.parseInt(buff_s.toString()));
            }
            else if (ARR[i] == '(')
                operators.push(ARR[i]);
            else if (ARR[i] == ')') {
                while (operators.peek() != '(')
                    operands.push(applyOp(operators.pop(), operands.pop(), operands.pop()));
                operators.pop();
            }

            else if (ARR[i] == '+' || ARR[i] == '-' ||
                    ARR[i] == '*' || ARR[i] == '/') {

                while (!operators.empty() && hasPrecedence(ARR[i], operators.peek()))
                    operands.push(applyOp(operators.pop(), operands.pop(), operands.pop()));
                operators.push(ARR[i]);
            }
        }
        while (!operators.empty())
            operands.push(applyOp(operators.pop(), operands.pop(), operands.pop()));return operands.pop();
    }


    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static int applyOp(char oper, int var2, int var1) {
        switch (oper) {
            case '+':
                return var1 + var2;
            case '-':
                return var1 - var2;
            case '*':
                return var1 * var2;
            case '/':
                if (var2 == 0)
                    throw new
                            ArithmeticException("division by zero.. immpossible!");
                return var1 / var2;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
    var res=    solver(s);
        System.out.println(res);

    }
}
