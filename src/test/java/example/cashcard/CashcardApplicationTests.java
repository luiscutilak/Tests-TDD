package example.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CashcardApplicationTests {

	@Test
	public void contextLoads() {
		assertThat(42).isEqualTo(42);
	}

}
