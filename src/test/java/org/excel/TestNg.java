package org.excel;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg extends BaseClass {
@Test
private void tc01() {
	System.out.println("tc01");
	//Thread count
	System.out.println(Thread.currentThread().getId());

}
@Test
private void tc02() {
	System.out.println("tc02");
	System.out.println(Thread.currentThread().getId());
}
@Test
private void tc03() {
	System.out.println("tc03");
	System.out.println(Thread.currentThread().getId());

}
@Test
private void tc04() {
	System.out.println("tc04");
	System.out.println(Thread.currentThread().getId());

}
@Test
private void tc05() {
	System.out.println("tc05");
	System.out.println(Thread.currentThread().getId());

}
@Test
private void tc06() {
	System.out.println("tc06");
	System.out.println(Thread.currentThread().getId());

}

}
