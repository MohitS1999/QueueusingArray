import java.util.*;
class QueueusingArray{
		static int front=-1;
		static int rear=-1;
		static int size;
		static int queue[];
		static Scanner sc=new Scanner(System.in);
		public static void main(String[] args){
			System.out.println("Enter the Size of Queue");
			size=sc.nextInt();
			queue=new int[size];
			int f=1;
			int d=1;
			while(f==1){
				System.out.println("Enter the data");
				enqueue(sc.nextInt());
				System.out.println(" repeat again press'1' ");
				f=sc.nextInt();
			}
			
			while(d==1){
				System.out.println("Delete the element:-   "+dequeue());
				System.out.println(" repeat again press'1' ");
				d=sc.nextInt();
			}
			display();
		}
		public static void enqueue(int data){
			if (isFull())
				System.out.println("Queue is Full ");
			else{
				rear++;
				queue[rear]=data;
			}
		}
		public static int dequeue(){
			int x=-1;
			if (isEmpty())
				System.out.println("Queue is Empty");
			else{
				front++;
				x=queue[front];
			}
			return x;
		}
		public static boolean isEmpty(){
			if (front==rear)
				return true;
			return false;
		}
		public static boolean isFull(){
			if (rear==(size-1))
				return true;
			return false;
		}
		public static void display(){
			System.out.println("display the queue");
			for(int i=front+1;i<rear+1;i++)
				System.out.println(queue[i]);
		}
}