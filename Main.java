package oopIntro;

public class Main {

	public static void main(String[] args) {
		//gercek hayatta stringleri listeleme işini yapmayız daha cok objelerle çalışırız
		//kendimiz Product isimli veri tipi oluşturuyoruz gibi düşün
		
		//parantez içini yazarak dört satırda yaptıgımızı yaptık,çunku classda bunlar belirlenmişti
		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram");//örnek olusturma,referans olusturma,instance
		//product1.id=1;
		//product1.name="Lenovo V14";
		//product1.unitPrice = 15000;
		//product1.detail = "16 GB Ram";
		//yukardaki dört satırı yazarak biz kümülatif bir şekilde ürün listesi oluşturduk,sonrasında aşağıdaki arraye product1 i ekleyebiliriz
        //altı sarı çizgiler sen yazdın ama kullanmadın diyor
		
		Product product2 = new Product();
		product2.id=1;
		product2.name="Lenovo V15";
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";
		

		Product product3 = new Product();
		product3.id=1;
		product3.name="Hp 5";
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		
		
		//array olusturma Product veri tipi gibi düşün,product ise array ismi gibi düşün
		Product[] products = {product1,product2,product3};
		for(Product product : products) {//ilki veri tipi olan,ikinci takma ad olan product,üçüncü de array ismni gezcek
			//System.out.println(products.name);
			
		}
		
		System.out.println(products.length);
		
		//!!! Classlar referans tiptir.Steak2de product1 tanımlandı,Heapde eşittirden sonraki bilgiler tutulur,idsi olan 1,lenovo V14, 15000 gibi
		
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=1;
		category2.name="Ev/Bahçe";
		
		ProductManager productManager = new ProductManager();//ilki veri tipi,ikinci takma ad,üçüncü constructı calıstırnak ıcın
		productManager.addToCart(product1);//fonksiyon çağırma
		//bir kere yaz her yerden cagır mantıgı
		productManager.addToCart(product2);//parantez içine parametre eklememiz gerekli.
		productManager.addToCart(product3);
		
		

	}

}
