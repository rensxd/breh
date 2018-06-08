package oefentoets;

public class Order
{
	private int tableNumber;
	private Coffee[] coffeeArray;
	private Cake[] cakeArray;
	private int cakeCounter;
	private int coffeeCounter;

	public Order(int newTableNumber)
	{
		setTableNumber(newTableNumber);
		coffeeArray = new Coffee[10];
		cakeArray = new Cake[10];
		cakeCounter = 0;
		coffeeCounter = 0;
	}

	public int getTableNumber()
	{
		return tableNumber;
	}

	public void setTableNumber(int tableNumber)
	{
		if (tableNumber > 0)
		{
			this.tableNumber = tableNumber;
		} else
		{
			System.out.println("Table number must be greater than 0");
		}
	}

	public void addCake(Cake newCake)
	{
		if (cakeCounter < cakeArray.length)
		{
			cakeArray[cakeCounter] = newCake;
			cakeCounter++;
		} else
		{
			System.out.println("I can't take any more cake orders.");
		}
	}

	public void addCoffee(String name, int size)
	{
		Coffee coffee = new Coffee(name, size);

		if (coffeeCounter < coffeeArray.length)
		{
			coffeeArray[coffeeCounter] = coffee;
			coffeeCounter++;
		} else
		{
			System.out.println("I cant take any more coffee orders.");
		}
	}

	public String listSugarFreeCake()
	{
		String retString = "";
		int index = 0;

		while (index < cakeCounter)
		{
			if (cakeArray[index].isSugarFree())
			{
				retString = retString + cakeArray[index].getName() + " ";
			}
			index++;
		}

		retString.trim();
		return retString;
	}

	public void showOrder()
	{
		System.out.println("Tafelnummer: " + tableNumber);
		int index = 0;

		while (index < coffeeCounter)
		{
			System.out.println(coffeeArray[index].getInfoCoffee());
			index++;
		}

		System.out.println();
		System.out.println("Totaal: " + coffeeCounter);
		System.out.println();
		index = 0;

		while (index < cakeCounter)
		{
			System.out.println(cakeArray[index].getInfoCake());
			index++;
		}

		System.out.println();
		System.out.println("Totaal: " + cakeCounter);
	}
}
