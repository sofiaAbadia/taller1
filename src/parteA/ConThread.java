package parteA;

public class ConThread extends Thread{
	
	private String name;
	private int num;
	
	public ConThread(String name, int num)
	{
		System.out.println("Extendiendo la clase thread");
		this.name=name;
		this.num=num;
	}
	
	public void run()
	{
		try{
			for(int i=1; i<=num; i++)
			{
				if(name.equals("T0")&&i%2!=0)
				{
					System.out.println(name + " "+"valor: "+i);
				}
				Thread.sleep(50);
				if(name.equals("T1")&&i%2==0){
					System.out.println(name + " "+"valor: "+i);
				}
				Thread.sleep(50);
			}
		}
		catch(Exception e){
			System.out.println("Saliendo: "+name);
		}
	}

	public static void main(String[] args)
	{
		ConThread p0= new ConThread("T0",50);
		ConThread p1= new ConThread("T1",50);
		p0.start();
		p1.start();
	}
}