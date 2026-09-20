import StackCodes.ReverseStringUsingStack;
import StackCodes.StackArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

ReverseArray.reverse();
ReverseString.reverseString();
ReverseNumber.reversenumber();
System.out.println();
FrequencyCount.countFreq();
        System.out.println();
        FirstNonRepeating.firstnonrepeat();
        System.out.println();
        DuplicateElements.duplicate();
        System.out.println();
        MostFrequentElement.mostFrequent();
        System.out.println();
        MissingNumber.missingNumber();

        System.out.println("Stack Code");
        StackArray stack=new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
         stack.print();
        System.out.println(stack.isEmpty());

        ReverseStringUsingStack.reverseString();

    }
}