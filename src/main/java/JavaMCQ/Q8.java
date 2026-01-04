package JavaMCQ;

public class Q8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            if (i == 3)
                return;
            System.out.print(i + " ");
        }
    }
}
// 1 2


/* for (int i = 1; i <= 5; i++)
Loop starts from i = 1
Runs until i <= 5
Increases i by 1 each time

 if (i == 3)
 Checks if the value of i is 3

return;

Immediately exits the method
No further code is executed after this
The loop and program both stop

System.out.print(i + " ");
Prints the value of i
 */