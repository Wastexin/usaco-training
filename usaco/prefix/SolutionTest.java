import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

	protected prefix solution;

	@Before
	public void setUp() {
		solution = new prefix();
	}

	@Test
	public void test0() {
		String[] primitives = new String[] { "A", "AB", "BA", "CA", "BBC" };
		String s = "ABABACABAABC";
		int expected = 11;
		int actual = solution.solve(s, primitives);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test1() {
		String[] primitives = new String[] { "A", "B", "C" };
		String s = "DABCDHETHBNAGRKGJTHNUE";
		int expected = 0;
		int actual = solution.solve(s, primitives);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		String[] primitives = new String[] { "AH", "AS", "AZ", "BW", "CD", "CK", "CN", "CU", "CZ", "DB", "DH", "EC", "ED", "EN", "FJ", "GA", "GK",
				"GM", "GS", "GT", "HA", "HN", "HZ", "IN", "IR", "JB", "JD", "JM", "JZ", "KG", "KI", "LO", "LQ", "LU", "LW", "LY", "MJ", "MT", "MV",
				"ND", "NM", "NS", "OB", "OI", "OK", "OM", "PG", "PO", "PQ", "PZ", "QE", "QP", "RG", "RK", "RN", "RP", "RQ", "RR", "RS", "RU", "SA",
				"SF", "SJ", "SN", "TK", "TR", "TU", "TY", "UA", "UO", "US", "UW", "UX", "VH", "VL", "VO", "WF", "WH", "WL", "WS", "WZ", "XU", "XW",
				"XY", "YA", "YI", "YN", "YT", "ZF", "ZH", "ZJ", "ZL", "ZR", "ZX" };
		String s = "ASCDCKCUEDFJGKGMHAIRJMKILQLWLYMJMTMVNSOIOKOMPOPQQPRGRNRPSJTUTYWSWZXWYIYTAHAZBWCDCNCUDHECENGAGMGSGTHAHNKGLQLULWNMOBOIOKOMPGPOPQPZRGRKRNRPRRSATRTUUWVLVOWFWLWSXUXYYAYIYNYTZFZJZRZXBWCKCUFJGAGSHAHNIRJBJMKILQLUNDNMNSOKOMPQQERGRQRRRSSASFSJSNTUTYUAUOUWVLWHXUXWXYYAYTZFZJZLZRZXASBWCDCNDBECEDFJGSHAHNHZINJMKGKILQMJNMNSOKOMPQQPRRRSSFSJSNTRTUTYUAUWUXVLVOWLWSWZXYYNYTZFZHZRZXAHASAZCDCKCNDBECENGMGSHAHZIRJDKGKILOLYOBOKPGPQQPRRSNTRTYUOUSUXVHVLVOWFWLWSXYYNZJZXZZAHAZBWCDCKCNDB";
		int expected = 444;
		int actual = solution.solve(s, primitives);
		Assert.assertEquals(expected, actual);
	}


	@Test
	public void tes3() {
		String[] primitives = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
				"V", "W", "X", "Y", "Z", "TMZJRCSVKE", "YAXHTTSKAS", "ORZOAQFEUH", "RDWEYPIPUR", "OVKUKKPPBE", "SRSJENXUMG", "OZXKJBPSUR",
				"JBCXBMZYLS", "FOKTWKDYGZ", "MLKEKYMZJP", "FSTQJEKMOH", "RZWBKVBODO", "PFCJKNKVSS", "UZZTUAKJVG", "LVIMIPOJMC", "WVHLXQTOCH",
				"GGJNVZEOHU", "OWRLNKVLQR", "KBJMYCJOSM", "AFHJBCELOR", "ZQYROXJQGI", "PQYVVFURPS", "PRFNFYLTAX", "XMOHHMVYOW", "GQHYUJEDWH",
				"VCTMUNTNZC", "LKAVAHKYRS", "KGEUPFEIQV", "GGRQGMVNJM", "TQHXIPBGVO", "XKHHJNEZON", "UBHMCQBRAN", "FYPOXIZVDK", "BZDKNQPAVB",
				"LUFKIFAIYR", "SYNAFTLZIM", "PHGBZKCFLF", "VJDEGYRYRX", "AOFSPDQKTT", "HNVQHEDWQC", "PYWMSNSMIU", "IIDDRLXXQI", "CFOZDRGOIW",
				"LYWANLBPKW", "UCQRAIKTTG", "WCRFAOGBVF", "CDMPUGBGPS", "RPEWCKQNCW", "QSLHDXVUZC", "FMHZYQVXKJ", "ZCOJXHSSEV", "WKJKMAOHHT",
				"BOIFKJSFYK", "BXZVFKJGEC", "INEWLDWTFY", "FDHBAHYURD", "NRMJPGWCHA", "BFEJNEZOGE", "KFRWLNFLGG", "AHRTJQGRBP", "YEYKKKUPLX",
				"NIFUGFIXDP", "ILXBADIUTL", "ENLQIFNDYC", "AGSIZAYXHM", "ZAUOXEDBTP", "IAKUHKDNFV", "MIQUTFLSFW", "ITPGMPQAEZ", "LBYZLIRTQE",
				"OROXJMYXLR", "XTEVKLOOIX", "GLQELFAXAZ", "PWRAWNPNSR", "BHHZQKKLRS", "ACNYAKJEPA", "RJROUIHCWM", "HJRTBQSDGV", "WENEMDHMDC",
				"NCKXQUKUPG", "ZDSZUMKCSB", "ARMILIXVKV", "TNGXZPLSMX", "NFOZQBWSTJ", "TFIQTYDSBW", "MRPAIRXIUK", "VRBNGAEFUM", "ECCJRITVNE",
				"QSFNAWFWUW", "JTYNBPQVVU", "KRAUJRYDJV", "JBRKFTOEOM", "CDRWEFOEMT", "JBDBJKGCXX", "XJMVOUYUOP" };
		String s = "LIUGYTXCIHRCWBOBEQJEQZXOQQLCDILPRGWPZTRIAJKXLYYQPHUFHSTXIFAMNLBFRXURRMZRVKOGINXXURDCKXASCAFQLHVDEQVWCUNXECENPCLKUONEMNXONCFZJBDORYKUTYRYBWLRZXBTMOXYBUMPWSPFTSULQEFJCXIDUUUTRWMDLKBNEODBGSGAKBMBFRKIPTMJNHDEDQHPAJDEXGFEYMFINRJTJUBYNOIBVLFZCNOCWRGTXMXWZCEMUOGDJHCWVKXQWDQYQEBMWHGTUEPTHUGBJMFSTHPPSNGOQWNGBOTXWARREHKMCQOLDTDXASMTFTIWQVDRKWPHXHYBOJORACCDVGAWYNPEHXAXTEPDAFKYMJZBSOSSQUVLBWHAKXERUFPOJERKKCIWLIXEWQWMLSYMPGMZDRQYWGMGKERVHZRTIPXFFURRNQDCWPCAGTYDZLJKQAFXAWQJMOOSIGJVWNYTCATJTRNTDWDTXIQYFHIRVWKECUAZHYSKZLTTDGMGDPZBYQADXIVSEGXHAXHHVZSVLMOOSBUWRUYQKYTIGPBLVYTWVAERAWMLIBABDVYVQWLAVEICUJNQIHMDHRUINHUWJVYMQWHGTSHOXQQSADIILVLTMGBAOWXXRVJIRROLJWZHNPZNTIWEDIXQOZRCVOANJJVBBKMLGLSTBSHUADZDLXUAWLDSZDFJNBKOLXZSJRMKJTFKXFNICHJZTMSSPXBDZMRKJQCSIODSIICFNQNQYWPRJHJZFLCEXUPGKRZTGCMOLOTYEHODEEUNMENRQPWNJLUUDUOJWAXIORGTYVWCARQMWDEMSAACMUXPOLZLLXTAOAUNWQPWIFIEIMRBNREZLBPANPMYMGZBGTOCKEZSJIXSUOUIFYIRAXSNNEMZLLBREPUOTTHDCFWWTRFZQNRQLJEYOQXZCZRHOLWIFDMHIJECAJCQXTHICLGRCEQFDIMSUIAZMNHVWMXXWZNTTVBWHHNJMEPPMBHG";
		int expected = 1000;
		int actual = solution.solve(s, primitives);
		Assert.assertEquals(expected, actual);
	}

}