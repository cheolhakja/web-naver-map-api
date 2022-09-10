package mymap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test1 {

    @Autowired
    private NaverClient naverClient;


    @Test
    public void test1() {
        naverClient.printValue();
    }

    @Test
    public void test2() {
        var search = new SearchLocalRequest();
        search.setQuery("카페");

        var result = naverClient.localSearch(search);
        System.out.println(result);
    }
}
