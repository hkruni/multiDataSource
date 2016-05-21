import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import com.cmdi.yjs.service.UserService;

public class PersonRedisTest {

	private static Jedis jedis = null;
	private static JedisPool masterPool;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		UserService service = (UserService) context.getBean("userService");
		service.add("haha", "1111111@qq", "haha", 28);
	}
}