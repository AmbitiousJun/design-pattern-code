package pg1_idcard.idcard;

import pg1_idcard.framework.Factory;
import pg1_idcard.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的生产身份证的工厂
 * @author Ambitious
 * @date 2022/9/12 16:03
 */
public class IdCardFactory extends Factory {

    private final List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IdCard)product).getOwner());
    }

    public List<String> getOwners() {
        return this.owners;
    }
}
