package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bean.Address;
import bean.Student;

@Configuration
public class Spring_config_file {
	
	@Bean
	public Address createAddrObj() {
		Address addr=new Address();
		addr.setHouseno(234);
		addr.setCity("Jamsedhpur");
		addr.setPincode(201010);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std =new Student();
		std.setName("Mansi");
		std.setRollno(512);
		std.setAddress(createAddrObj());
		return std;
	}

}
