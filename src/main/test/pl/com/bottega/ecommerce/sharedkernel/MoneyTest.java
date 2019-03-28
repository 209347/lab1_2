package pl.com.bottega.ecommerce.sharedkernel;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Currency;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test public void multiplyByDouble() {
        Money money = new Money(new BigDecimal(10.0), Currency.getInstance("EUR"));
        Money moneyExpected = new Money(new BigDecimal(40.0), Currency.getInstance("EUR"));

        money = money.multiplyBy(4.0);

        Assert.assertThat(money, Matchers.equalTo(moneyExpected));
    }

    @Test public void multiplyByBigDecimal() {
        Money money = new Money(new BigDecimal(10.0), Currency.getInstance("EUR"));
        Money moneyExpected = new Money(new BigDecimal(40.0), Currency.getInstance("EUR"));

        money = money.multiplyBy(new BigDecimal(4.0));

        Assert.assertThat(money, Matchers.equalTo(moneyExpected));
    }

    @Test public void add() {
        Money money = new Money(new BigDecimal(10.0), Currency.getInstance("EUR"));
        Money moneyToAdd = new Money(new BigDecimal(30.0), Currency.getInstance("EUR"));
        Money moneyExpected = new Money(new BigDecimal(40.0), Currency.getInstance("EUR"));

        money = money.add(moneyToAdd);

        Assert.assertThat(money, Matchers.equalTo(moneyExpected));
    }

    @Test public void subtract() {
        Money money = new Money(new BigDecimal(40.0), Currency.getInstance("EUR"));
        Money moneyToSubtract = new Money(new BigDecimal(10.0), Currency.getInstance("EUR"));
        Money moneyExpected = new Money(new BigDecimal(30.0), Currency.getInstance("EUR"));

        money = money.subtract(moneyToSubtract);

        Assert.assertThat(money, Matchers.equalTo(moneyExpected));
    }

    @Test public void greaterThan() {
    }

    @Test public void lessThan() {
    }

    @Test public void lessOrEquals() {
    }
}
