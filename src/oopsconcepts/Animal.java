package oopsconcepts;

public class Animal 
{
	public void animalsound()
	{
		System.out.println("The animal makes a sound");
	}
}
	class cat extends Animal
	{
		public void animalsound()
		{
			System.out.println("The cat says: miu miu");
		}
	}
	class dog extends Animal
	{
		public void Animalsound()
		{
			System.out.println("The dog says: bow wow");
		}
	}
		class Main
		{
			public static void main(String[] args) {
				Animal myanimal = new Animal();
				Animal mycat = new cat();
				Animal mydog= new dog();
				
				myanimal.animalsound();
				mycat.animalsound();
				mydog.animalsound();
			}
		}