
public class Main {
	public static void main(String[] args) {
	String mesaj = "Yarýn yeni kafe açýlýþý var oraya gidelim.";
	System.out.println(mesaj);

	/*
	 * System.out.println("Eleman sayýsý: " + mesaj.length());
	 * System.out.println("5. eleman : " + mesaj.charAt(4));
	 * System.out.println(mesaj.concat(" Yaþasýn!"));
	 * System.out.println(mesaj.startsWith("B"));
	 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char [5];
	 * mesaj.getChars(0,5,karakterler,0); System.out.println(karakterler);
	 * System.out.println(mesaj.indexOf("a"));
	 * System.out.println(mesaj.lastIndexOf("B"));
	 */

	String yeniMesaj = mesaj.replace(' ', '-');
	System.out.println(yeniMesaj);
	System.out.println(mesaj.substring(2, 5));

	for (String kelime : mesaj.split(" ")) {
		System.out.println(kelime);
	}
}
}

}
