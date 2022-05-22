package queue;

import java.util.Queue;

public class queuechar{
    int size=5 ;
    int []Q = new int[size];
    int numitem=0;
    int front=0;
    int  rear=0;
   
    public  void enqu(char val){
       if(isfull()){
           System.out.println("Queue is Full.");
       }
       else{
           Q[rear]=val;
           rear=(rear+1)%size;
          numitem++;
           System.out.println("The value is pushed in Queue = "+val);
       }
    }
    public  char dequ(){
          
	    if(isempty()){
           	System.out.println("Queue is Empty!!");
                return 00;
            }else{
                 int x=Q[front];
                 front = (front +1)%size;
                 numitem--;
                 return (char) x;
                  }
    }
    
    public  boolean isempty(){
        if(numitem==0){
            return true;
        }else 
            return false;
    }
    
    public  boolean isfull(){
        if(numitem==size){
            return true;
        }else 
            return false;
    }

    
    
    public static void main( String[] args) {
        Queue q=new Queue();
        char x[]={'A','H','M','E','D'};
         int i=0;
        while(!q.isfull()){
            q.enqu(x[i]);
            i++;
        }
         
        while(!q.isempty()){
            char xx= (char) q.dequ();
            System.out.println(xx);

        }
}
}
