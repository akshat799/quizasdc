import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskTest {

	private Task task;
	@Before
	public void setUp(){
		task = new Task();
	}

	@Test
	public void testAssignTo(){
		String name = "Akshat Gulati";
		task.assignTo(name);
		assertEquals(name,task.getTeamMember);
	}
}
