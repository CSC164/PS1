package PS1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyIntegerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void Test_IsEven_1() {

		int iValue = 3;

		MyInteger myInt = new MyInteger(iValue);

		assertFalse(myInt.isEven());

		iValue = 4;
		myInt = new MyInteger(iValue);

		assertTrue(myInt.isEven());
	}

	@Test
	public void Test_IsEven_2() {
		int iValue = 3;

		assertFalse(MyInteger.isEven(iValue));

		iValue = 4;

		assertTrue(MyInteger.isEven(iValue));

	}

	@Test
	public void Test_IsEven_3() {

		int iValue = 3;

		MyInteger myInt = new MyInteger(iValue);

		assertFalse(MyInteger.isEven(myInt));

		iValue = 4;
		myInt = new MyInteger(iValue);

		assertTrue(MyInteger.isEven(myInt));
	}

	@Test
	public void Test_Prime_1() {

		int iValue = 3;
		MyInteger myInt = new MyInteger(iValue);

		try {
			assertTrue(myInt.isPrime());
		} catch (Exception e) {
			fail("isPrime failed");
		}
	}

	@Test
	public void Test_Prime_2() {

		int[] iValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		for (int i : iValues) {
			MyInteger myInt = new MyInteger(i);
			try {
				assertTrue(myInt.isPrime());
			} catch (Exception e) {
				fail("isPrime failed");
			}
		}

	}

	@Test
	public void Test_Prime_3() {

		int[] iValues = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 };

		for (int i = 2; i < 100; i++) {
			boolean bValueFound = false;
			for (int idx : iValues) {
				if (i == idx) {
					bValueFound = true;
					break;
				}
			}
			if (bValueFound == false) {
				MyInteger myInt = new MyInteger(i);
				try {
					assertFalse(myInt.isPrime());
				} catch (Exception e) {
					fail("isPrime failed");
				}
			}

		}
  
	}

	@Test(expected = Exception.class)
	public void Test_Prime_4() throws Exception {

		int iValue = 200;
		MyInteger myInt = new MyInteger(iValue);
		

		boolean bIsPrime = myInt.isPrime();
	}
}
