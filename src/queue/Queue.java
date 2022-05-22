package queue;
public class Queue{
    int size=5 ;
    int []Q = {1,2,3,4,5,6,7};
    int numitem=0;
    int front=0;
    int  rear=0;
   
    public  void enqu(int val){
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
    public  int dequ(){
          
	    if(isempty()){
           	System.out.println("Queue is Empty!!");
                return 00;
            }else{
                 int x=Q[front];
                 front = (front +1)%size;
                 numitem--;
                 return x;
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
         int i=5;
         int sum=0;
         int avg =5;
        while(!q.isfull()){
            q.enqu(i);
            i++;
            avg=(sum+=1)/i;
        }
         System.out.println(avg);
        while(!q.isempty()){
            int x= q.dequ();
            System.out.println(x);

        }
}
}
