class Height
{
	public static void main (String args[])
	{
		Scanner Sc=new Scanner(System.in);

		Float ht;

		System.out.println("Enter the height of a person");
		ht=Sc.nextFloat();

		if(ht<150.0f)
			System.out.println("Dwarf");
		else if(ht>=150.0f && ht<165.0f)
			System.out.println("Average height");
		else if(ht>=165.0f && ht<180.0f)
			System.out.println("Taller");
		else if (ht>180.0f)
			System.out.println("Abnormal");
	}
}