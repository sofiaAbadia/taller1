package parteA;

public class ConRunnable implements Runnable{

	private String name;
	private int num;
	
	public ConRunnable(String name, int num)
	{
		System.out.println("Implementando la interfaz Runnable");
		this.name=name;
		this.num=num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
		Thread p0= new Thread(new ConRunnable("T0",50));
		Thread p1= new Thread(new ConRunnable("T1",50));
		p0.start();
		p1.start();
	}

}
