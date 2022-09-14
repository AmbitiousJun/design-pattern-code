package pg2_idcard_number.idcard;

import pg2_idcard_number.framework.Factory;
import pg2_idcard_number.framework.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Ambitious
 * @date 2022/9/14 10:09
 */
public class IdCardFactory extends Factory {

    /**
     * number -> owner
     */
    private final Map<String, String> cardNumberMap = new HashMap<>(16);

    @Override
    protected Product createProduct(String owner) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return new IdCard(owner, uuid);
    }

    @Override
    protected void registerProduct(Product product) {
        IdCard card = (IdCard) product;
        cardNumberMap.put(card.getNumber(), card.getOwner());
    }

    public Map<String, String> getCardMap() {
        return cardNumberMap;
    }
}
