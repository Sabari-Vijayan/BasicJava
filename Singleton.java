class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
        
        
    }
}

public class Singleton01
{
	public static void main()
	{
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance1 == instance2);
		System.out.println("instance 1 :"+ instance1.hashCode());
		System.out.println("instance 2 :"+ instance2.hashCode());
	}
}
