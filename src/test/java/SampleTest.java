import org.junit.Assert;
import org.junit.Test;


public class SampleTest {

	@Test
	public void test() {
		Sample sample = new Sample();
		Assert.assertEquals(3, sample.add(1, 2));
		Assert.assertEquals(4, sample.add(2, 2));
	}
}
