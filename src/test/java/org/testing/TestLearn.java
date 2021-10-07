package org.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestLearn extends BaseClass {
	
	@Test
	public void tc1() {
		launchBrowser("https://en-gb.facebook.com/");
		System.out.println("test1 - @Test");
		System.out.println("New joiner B");
		System.out.println("new joiner work");
	}
	

}
