package variable;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Dibyansu
 * @implNote Help to explore more about big decimal
 *
 */
public class BigDecimalKnowledge {

	public static void main(String[] args) {
		/*
		 * BigDecimal x=new BigDecimal(500); BigDecimal y=BigDecimal.valueOf(500.00);
		 * System.out.println(x.compareTo(y)); System.out.println(x+ ","+ y+ ","
		 * +(x.floatValue()==y.floatValue()));
		 */
		
		String[] x={"s","9"};
		List<String>  xlist=Arrays.asList(x);
		Collections.sort(xlist);
		System.out.println(xlist);
		
		Integer bh;

}
}