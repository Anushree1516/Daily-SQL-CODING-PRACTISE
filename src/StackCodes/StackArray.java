package StackCodes;

public class StackArray {
    int[] arr;
   int top;

    public StackArray(int size){
        arr=new int[size];
        top=-1;
    }
     public void push(int value){
        if(top==arr.length-1){
            System.out.println("statck overflow");
            return;
        }
        top++;
        arr[top]=value;

    }
     public int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top--];
     }
    public int peek(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }
   public  boolean isEmpty(){
      return top==-1;
    }
    public void print(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}