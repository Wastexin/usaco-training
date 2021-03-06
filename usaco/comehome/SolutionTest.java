import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	protected comehome solution;

	@Before
	public void setUp() {
		solution = new comehome();
	}

	@Test
	public void test0() {
		String[] map = new String[] {
				"A d 6",
				"B d 3",
				"C e 9",
				"d Z 8",
				"e Z 3"
		};

		String expected = "B 11";
		String actual = solution.solve(map);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test1() {
		String[] map = new String[] {
				"m Z 1000 ", 
				"A m 1000 ", 
				"B m 999 ", 
				"C m 998 ", 
				"D m 997 ", 
				"E m 996 ", 
				"F m 995 ", 
				"G m 994 ", 
				"H m 993 ", 
				"I m 992 ", 
				"J m 991 ", 
				"K m 990 ", 
				"L m 989 ", 
				"M m 988 ", 
				"N m 987 ", 
				"O m 986 ", 
				"P m 985 ", 
				"Q m 984 ", 
				"R m 983 ", 
				"S m 982 ", 
				"T m 981 ", 
				"U m 980 ", 
				"V m 979 ", 
				"W m 978 ", 
				"X m 977 "
		};

		String expected = "X 1977";
		String actual = solution.solve(map);
		Assert.assertEquals(expected, actual);
	}

}
