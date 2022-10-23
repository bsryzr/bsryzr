package oopIntro;

public class Product {
//Constructor:yapıcıblok,classı heapte olustururken yapmasını istediğin bişey varsa onu constructor bloguna yazarsın
//constructor yazmasak da arka planda calısır,içine bişey yazmak ıstıyorum dedıgınde yazarsın
	
	
	 public Product() {
		System.out.println("Ben çalıştım"); 
	 }
	 //birden fazla constructor oluşturursak:overloading
	 public Product(int id,String name,double unitPrice,String detail) {//mainde tek tek product1.id şeklinde tanımlamamıza gerek kalmadı
		//constructorın içindeki id'yi alttaki dısardan erısebildiğimiz idye eşitleriz
		// this.id demek bu classdaki id demek, bu classdaki idyi şuna eşitle
		// mainde iki constructorı da kullanabiliriz,hangisini kullanırsak o calısır ve cıktıda onunki görnür
		// örneğin product1 için ikinci const kullandık,diğer ikisi için ilkini kullandık,mainde iki tane "ben çalıştım" yazısı çıkar.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail; 
	 }
	 int id;
     String name;
     double unitPrice;
     String detail;
     
}
