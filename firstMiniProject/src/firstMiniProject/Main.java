package firstMiniProject;

public class Main {

	public static void main(String[] args) {
		
		

{
		//Kalan (reminder) operatörü: bir sayının başka bir sayıya bölümünden kalanı verir.
		int number = 25;
		int remainder = number % 2 ;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if (number==1) {
			System.out.println("Sayı asal sayı değildir!");
			return;
		}
		
		if(number <1) {
			System.out.println("Sayı geçersiz!");
		}
		
		
		for(int i=2; i<number; i++)
		{
			if(number % i == 0 )
			{
				isPrime= false;
				
			}
			if(isPrime)
			{
				System.out.println("Sayı asaldır !");
				
			}
			
			else
			{
				
				System.out.println("Sayi asal sayi degildir !");
			}

	}

}


	}

}

