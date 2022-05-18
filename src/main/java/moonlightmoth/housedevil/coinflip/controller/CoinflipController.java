package moonlightmoth.housedevil.coinflip.controller;


import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class CoinflipController {

    @GetMapping("/coinflip")
    public String flipCoin()
    {
        return new Random().nextBoolean() ? "HEADS" : "TAILS";
    }
}
