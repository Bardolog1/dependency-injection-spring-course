Curso Srping :

	Anotaciones
		-	@Autowired : Se usa para inyectar una dependencia de una clase abstracta o una interfqace, con el fin de no generar una instancia ya que el contenedor de spring al identificarlo con el Autowired va a instanciarlo y manejarlo por nosotros
		
		- @Service : esta anotacion es una diferenciación semantica del @Component que sirve para identificar una clase del tipo service, pero su finalidad es la misma, identificar un componente que hace parte del contenedor de spring
		-	@Prrimary :  esta anotación se usa cuando dos clases implementan la misma interface, spring requiere indicar cual se va a usar inicialmenta o cual es la de principal prioridad, ya que no identificar una prioridad de clases de la interface  causaria un APLICATION FAILED TO START 
		-	 @Qualifier : Esta anotación se usa debajo del Autowired, y sirve para inyectar una dependencia que implementa una interface junto con otra clase que ya esta identificada como @Primary y es conveniente cuando no queremos usar la que ya esta con @Primary, recibe un parametro en string que va a ser el nombre que se le asigno al componente spring (@Component("miSpringComponent")), se usa : @Qualifier("miSpringComponent")
		-	@Configuration : esta anotacion se usa en una clase de configuracion, en la cual vamos a agragar al contenedor de spring componentes que no estan marcados con la anotacion  de @Component o alguna de sus variantes, se usa en conjunto con @Bean("MyServiceNoSpringComp") donde @Bean se coloca sobre el metodo que hace la configuracion del componente a incluir
		-@Bean : se usa sobre un metodo de una clase de configuracion para incluir una clase que no esta en el contenedor de spring 