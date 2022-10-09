public class QueueMain 
{
    public static void main(String[] args) 
    {
        Queue qobj =new Queue();

        for (int i = 0; i < 20; i++)
        {
            qobj.enqueue(i + 1);
        }

        int queueSize = qobj.getSize();
        System.out.println("Values in the Queue are: ");
        
        for (int j = 0; j < queueSize; j++) 
        {
            System.out.printf("Value %d is: %d%n", j+1, qobj.dequeue());
        }
        
        System.out.println("\nSize of Queue : " + qobj.getSize());
        
        System.out.println();
		System.out.println("ID : 21CE142 \nName : Krishna M. Thakor");
    }
}