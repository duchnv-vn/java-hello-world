package section_27;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

class Product {
    private String name;

    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class Section27 {
    public static void main(String[] args) {
        var products = new ArrayList<Product>();
        products.add(new Product("AAA", 1));

        products.add(new Product("BBB", 2));
        products.add(new Product("CCC", 3));

        var targetProduct = findProduct(products, "BBB");
        if (targetProduct.isPresent()) {
            System.out.println("targetProduct: " + targetProduct.get().getPrice());
        }

        var isEven = checkIsEven(2);
        isEven.ifPresent(System.out::println);

        // REMOVE NULL BY FILTER
        products.add(null);
        var newProducts = products.stream().filter(Objects::nonNull).map(product -> {
            product.setName(product.getName().toLowerCase());
            return product;
        }).map(Product::getName).toList();

    }

    static Optional<Product> findProduct(ArrayList<Product> products, String name) {
        return products.stream().filter(product -> product.getName().equals(name)).findFirst();
    }

    static Optional<String> checkIsEven(int number) {
        if (number % 2 == 0) {
            return Optional.of("even");
        }

        return Optional.empty();
    }
}
