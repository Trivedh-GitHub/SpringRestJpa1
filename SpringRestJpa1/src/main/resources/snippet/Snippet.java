package snippet;

public class Snippet {
	## PostgreSQL
	spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
	spring.datasource.username=postgres
	spring.datasource.password=1234
	
	 
	
	#drop n create table again, good for testing, comment this in production
	spring.jpa.hibernate.ddl-auto=create
	spring.jpa.show-sql=true
}

