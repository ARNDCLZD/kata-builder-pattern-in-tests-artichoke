package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShopTest {

  private UserBuilder userBuilder = new UserBuilder();

    @Test
    public void happy_path() {
      resetBuilder();
      userBuilder.buildAddress(false);
      userBuilder.buildVerified(true);
      final User user = userBuilder.getResult();

      assertTrue(Shop.canOrder(user));
      assertFalse(Shop.mustPayForeignFee(user));
    }

    @Test
    public void minors_cannot_order_from_shop() {
      resetBuilder();
      userBuilder.buildAddress(false);
      userBuilder.buildVerified(true);
      userBuilder.buildAge(true);
      final User user = userBuilder.getResult();

      assertFalse(Shop.canOrder(user));
    }

    @Test
    public void must_be_verified_to_order_from_shop() {
      resetBuilder();
      userBuilder.buildAddress(false);
      userBuilder.buildVerified(false);
      userBuilder.buildAge(false);
      final User user = userBuilder.getResult();

      assertFalse(Shop.canOrder(user));
    }

    @Test
    public void foreigners_must_pay_foreign_fee() {
      resetBuilder();
      userBuilder.buildAddress(true);
      userBuilder.buildVerified(false);
      userBuilder.buildAge(false);
      final User user = userBuilder.getResult();

      assertTrue(Shop.mustPayForeignFee(user));
    }

    private void resetBuilder(){
      userBuilder.reset();
      userBuilder.buildName();
      userBuilder.buildEmail();
    }
}
