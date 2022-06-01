package com.sprint2.storebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.sprint2.storebackend.model.Product;
import com.sprint2.storebackend.service.ProductService;

@SpringBootApplication
public class StoreBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreBackendApplication.class, args);
	}
	
	@Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
<<<<<<< HEAD
            productService.save(new Product(1L, "TV Set", 300.00, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.istockphoto.com%2Fphotos%2Fdress-shirt&psig=AOvVaw0vMoTfa9-X01pq4KOcS1G7&ust=1654167420740000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCIi1jdqLjPgCFQAAAAAdAAAAABAD"));
            productService.save(new Product(2L, "Game Console", 200.00, "http://placehold.it/200x100"));
            productService.save(new Product(3L, "Sofa", 100.00, "http://placehold.it/200x100"));
            productService.save(new Product(4L, "Icecream", 5.00, "http://placehold.it/200x100"));
            productService.save(new Product(5L, "Beer", 3.00, "http://placehold.it/200x100"));
            productService.save(new Product(6L, "Phone", 500.00, "http://placehold.it/200x100"));
            productService.save(new Product(7L, "Watch", 30.00, "http://placehold.it/200x100"));
=======
            productService.save(new Product(1L, "Tea set", 900.00, "https://5.imimg.com/data5/RU/HD/NT/SELLER-1012852/premium-handicrafts-500x500.jpg"));
            productService.save(new Product(2L, "Teracota Jewellery set", 1800.00, "https://3.imimg.com/data3/ET/UL/MY-8543683/online-handicrafts-store-500x500.jpg"));
            productService.save(new Product(3L, "Black statue shehnai home decor", 2000.00, "https://5.imimg.com/data5/SELLER/Default/2021/4/BA/OY/OP/98548129/black-statue-home-decor-250x250.jpg"));
            productService.save(new Product(4L, "Meenakari Patla", 100.00, "https://3.imimg.com/data3/CI/KJ/MY-4048339/meenakari-patla-250x250.jpg"));
            productService.save(new Product(5L, "Hexagonal Dome Ceiling", 850.00, "https://2.imimg.com/data2/TL/MT/MY-174147/haxagonal-dome-ceilling-250x250.jpg"));
            productService.save(new Product(6L, "Achmani Nakshi", 6500.00, "https://5.imimg.com/data5/IQ/JR/WP/SELLER-2154583/achmani-nakshi-250x250.jpg"));
            productService.save(new Product(7L, "Hand painted wooden home decor", 1200.00, "https://cdn.shopify.com/s/files/1/0155/8131/products/IMG_5199_0a5dcabe-0a14-4050-9bd6-3f328d9619b2_800x.jpg?v=1613221240"));
            productService.save(new Product(8L, "Copper coated Bells/Chimes", 350.00, "https://cdn.shopify.com/s/files/1/0155/8131/collections/BeFunky-collage_2_f517405d-3136-4db9-89f8-35fd11c639c4_480x.jpg?v=1654001934"));
            productService.save(new Product(9L, "Jogi embroidery Cushion covers", 290.00, "https://cdn.shopify.com/s/files/1/0155/8131/collections/BeFunky-collage_4_cd68966e-a848-46fe-9293-bfe0898f0490_480x.jpg?v=1654001932"));
            productService.save(new Product(10L, "Hand printed Kaftans", 1950.00, "https://cdn.shopify.com/s/files/1/0155/8131/collections/BeFunky-collage_1_0b1e6514-cf38-487e-9f34-987cfe4a3f08_480x.jpg?v=1654001933"));
>>>>>>> 1298a431c37527deef64a2da96aa1abc3e0dcacd
        };
    }

}
