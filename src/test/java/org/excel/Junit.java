package org.excel;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit extends BaseClass {
	
	@Test
	public void tc01() {
		String s="Java";
		System.out.println("tc01");
		Assert.assertTrue(s.equals("Java"));
		System.out.println("tc01");
	}
	@Test
	public void tc02() {
		String s="Java";
		System.out.println("tc02");
		Assert.assertFalse(s.equals("java"));
		System.out.println("tc02");
	}
	@Test
	public void tc03() {
		String s="Java";
		System.out.println("tc03");
		Assert.assertEquals("Java",s);
		System.out.println("tc03");
	}
}
