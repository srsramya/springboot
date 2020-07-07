Spring-data-jpa
***************


To connect with database, Add the following maven dependencies. 
***************************************************************
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
</dependency>
*******************************************************************
Configure the application.properties file
*******************************************************************
#change username,password and database name as per your mysql configuration
spring.datasource.username = root
spring.datasource.password = 123456
spring.jpa.show-sql = true
spring.jpa.format-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.datasource.url = jdbc:mysql://localhost:3306/test?useSSL=false
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.properties.hibernate.format_sql=true
********************************************************************
Annotations we are going use: 
***************************************************************************
@EnableJPARepositories
@EntityScan
@Entity
@Table
@ID
@GeneratedValue
@Column
***************************************************************************
Creating composite primary key: 

In order to define the composite primary keys, we should follow some rules:

1) The composite primary key class must be public
2) It must have a no-arg constructor
3) It must be Serializable


Annotations: 

1) @Embeddable
2) @EmbeddedId

********************************************************************************************
JPA_CLAUSES:
***********

    public List<Employee> findByAge(int age);

	public List<Employee> findByAgeBetween(int start, int max);

	public List<Employee> findByNameLike(String name);

	public List<Employee> findByAgeLessThan(int age);

	public List<Employee> findByAgeLessThanEqual(int age);

	public List<Employee> findByAgeGreaterThan(int age);

	public List<Employee> findByAge(int age, Pageable page);

Reference Link:
https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
********************************************************************************************

pagination:
***********
  findAll(Pagable pagble);
  
  public List<Employee> findWithPagination(int pageNumber, int numberOfRecords) {
		Pageable pagble = PageRequest.of(pageNumber, numberOfRecords);
		Page<Employee> page = employeeRepository.findAll(pagble);
		return page.getContent();
	}
*********************************************************************************************

Query annotaion:

	@Query("select e from Employee e where email=?1")
	public Employee findRecordsByEmail(String email);

**********************************************************************************************

    







