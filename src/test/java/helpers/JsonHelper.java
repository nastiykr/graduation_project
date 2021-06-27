package helpers;

import com.google.gson.Gson;
import domain.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class JsonHelper {

    public Product readProductFromResources(String productName)  throws IOException {
        String collect;
        try (InputStream is = getClass().getClassLoader().getResourceAsStream(productName)) {
            try (InputStreamReader isr = new InputStreamReader(is); BufferedReader br = new BufferedReader(isr)) {
                collect = br.lines().collect(Collectors.joining(System.lineSeparator()));
            }
        }
        return new Gson().fromJson(collect, Product.class);
    }
}
