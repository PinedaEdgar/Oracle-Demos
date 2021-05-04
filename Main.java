
public class Main {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
//
//		System.out.println("Edgar Pineda");
//		System.out.println("Is the best");	
//		
//		int a1 = 10;
//		float flt = 10.123456789f;
//		float flt1 = 10.5f;
//		
//		
//		
//	//	string = 10;
//		
//	//	boolean isCorrect = yes;
//		boolean isTrue = true;
//		
//		
//		int res = 1;
//		res = +res;
//	  	System.out.println(res);
//		res = res++;
//	  	System.out.println(res);
//		res = res--;
//  	    System.out.println(res);
//		res = -res;
//  	    System.out.println(res);
//		
//  	    
//  	    int a =10;
//  	    int b=5;
//  	    int c=20;
//  	    
//  	  System.out.println(a < b && a < c ); //   false        ( || logical OR )
//	  System.out.println(a < b &  a > b ); // false  ( | bitwise OR )
//	    
//  	    System.out.println(a>b || a<c ); //            ( || logical OR )
//  	    System.out.println(a>b |  a<c ); // true Correcto ( | bitwise OR )
//  	
//		
//		
////	//	System.out.print(isCorrect);
//////		System.out.println(isTrue);
//////		
//////		
//////		System.out.println(flt);
//////		System.out.println(flt1);
////		
		
		double tax = 0.2d;
		double total = 0.0d;
		
		// Arrays
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		
		Clothing[] items = {item1, item2, new Clothing(), new Clothing()};
		
		item1.description = "Blue Jacket";
		item1.price = 20.9f;
		item1.size = "M";
		
		item2.description = "Orange T-Shirt";
		item2.price = 10.5f;
		item2.size = "S";
		
		// Appended items
		items[2].description = "Green scarf";
		items[2].price = 5.0f;
		items[2].size = "S";
		
		items[3].description = "Blue T-Shirt";
		items[3].price = 10.5f;
		items[3].size = "S";
		
//		System.out.println("Item1 " + ":" + item1.description + " ," + item1.price + " , " + item1.size);
//		System.out.println("Item2 " + ":" + item2.description + " ," + item2.price + " , " + item2.size);
				
		
	// switch
	Customer c1 = new Customer();
	c1.name = "Pinky";
	c1.size = "S";
	
	int measurement = 3;
	
	switch (measurement) {
	case 1 ,2 ,3 :
		c1.size = "S";
	    break;
	case 4 ,5 ,6 :
		c1.size = "M";
	    break;
	case 7 ,8 ,9 :
		c1.size = "L";
	    break;
	default:
		c1.size = "X";
	    
	}
	
	System.out.println("Welcome to Duke Choice Shop");
	System.out.println("Name: " + c1.name);
	System.out.println("Size: " + c1.size);
	
	// Loop Demo 1
	System.out.println("========== Loop Demo 1 =========");
	for (Clothing item: items) {
		total += item.price;
		System.out.println("Item : " + item.description + " ," + item.price + " , " + item.size);

	}
	
	// Loop Demo 2
	System.out.println("========== Loop Demo 2 =========");
	total = 0;
	
	for (Clothing item: items) {
		if(c1.size.equals(item.size)) {
		total = total + item.price;
		System.out.println("Item : " + item.description + " ," + item.price + " , " + item.size);
		if (total > 15) {break;}
		}
	}
	System.out.println("Total : " + total);
}
}