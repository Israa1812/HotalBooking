package com.example.Room;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RoomApplication  {

	public static void main(String[] args) {
		SpringApplication.run(RoomApplication.class, args);
	}

	/*@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO Room (IdRoom,isVailed,nameCustmor) VALUES(? , ? , ? )";

		int reselt = jdbcTemplate.update(sql, 5 ,false , "tyma");

		if (reselt > 0){
			System.out.println("A new row has been inserted .");
		}
	}*/
}
