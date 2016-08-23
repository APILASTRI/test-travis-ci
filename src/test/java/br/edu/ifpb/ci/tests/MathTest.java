package br.edu.ifpb.ci.tests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import br.edu.ifpb.ci.MathUtils;

public class MathTest {
	
	private MathUtils math;
	
	@Before
	public void setUp(){
		math = new MathUtils();
	}
	
	@Test
	public void sumSucessTest(){
		Integer result = math.sum(10, 10);
		assertThat(Integer.valueOf(20), equalTo(result));
	}
}
