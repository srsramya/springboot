List of annotations:

1) @NotNull – validates that the annotated property value is not null

2) @AssertTrue – validates that the annotated property value is true

3) @Size – validates that the annotated property value has a size between the attributes min and max; can be applied to String, Collection, Map, and array properties

4) @Min – vValidates that the annotated property has a value no smaller than the value attribute

5) @Max – validates that the annotated property has a value no larger than the value attribute

6)@Email - validates that the annotated property is a valid email address

7) @NotEmpty – validates that the property is not null or empty; can be applied to String, Collection, Map or Array values

8) @NotEmpty – validates that the property is not null or empty; can be applied to String, Collection, Map or Array values

9) @NotBlank – can be applied only to text values and validated that the property is not null or whitespace

10) @Positive and @PositiveOrZero – apply to numeric values and validate that they are strictly positive, or positive including 0

11) @Negative and @NegativeOrZero – apply to numeric values and validate that they are strictly negative, or negative including 0

12) @Past and @PastOrPresent – validate that a date value is in the past or the past including the present; can be applied to date types including those added in Java 8

13) @Future and @FutureOrPresent – validates that a date value is in the future, or in the future including the present
********************************************************************************

Use @Valid and @Validated annotations to enable the validatons framework.

For RequestBody: @Valid

For path and Query params: @Validated


********************************************************************************

Adding customized and dynamic validation messages: 

1) Create beans for MessageSource, LocalValidatorFactoryBean 
2) Create a messages store in resources. 

@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}

	@Bean
	public LocalValidatorFactoryBean validator(MessageSource messageSource) {
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource);
		return bean;
	}
	
	
	Syntax for annotatins: 
	
	@Min(value = 22, message = "{min_age}")
	
	messages.properties: 
	
	min=please enter correct age
	
	
	Rendering dynamic messages: 
	
	messages.properties:
	********************
	min_age=age should be at least {min}. Age ${validatedValue} not allowed. 
    min=22
	
	Here it will take the {min} attribute from the messages.properties 
	${validatedValue} represents value entered by user.
*******************************************************************************

We can also use the regular expressions to validate the fileds. This example is 
to validate the phone number: 

@Pattern(regexp = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$")
privare String phoneNumber;

********************************************************************************

Creating the own validations: 

1) Create One Interface.
2) Create the One Constrain validation class for that annotation. It validates the field value.








