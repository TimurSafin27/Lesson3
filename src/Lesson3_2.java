public class Lesson3_2 
{
    public static void main (String[] args)
	{
		HashMap<String, Object> HashMap = new HashMap<>();
		HashMap.put("Машинка", new Product("Машинка", random.nextint(500)));
		HashMap.put("Лошадка", new Product("Лошадка", random.nextint(500)));
		HashMap.put("Кукла", new Product("Кукла", random.nextint(500)));
		HashMap.put("Конструктор", new Product("Конструктор", random.nextint(500)));
		HashMap.put("Юла", new Product("Юла", random.nextint(500)));
		for (Map.Entry entry: HashMap.entrySet()) 
			{
				System.out.println(entry);
			}
		Set<Integer> keys = HashMap.keySet();
		System.out.println("Ключи: " + keys);
		ArrayList<String> values = new ArrayList<>(HashMap.values());
		System.out.println("Значения: " + values);
    }
}


public class Product (String Name, int ){
	this.Name = Name;
	this.Price = Price;
}
