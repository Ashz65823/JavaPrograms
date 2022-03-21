Swagger2
It is an open source project used to generate rest Api documentation 
It also gives you an user Interface to access your rest end point via browser
Following are the steps to carried out in order to use Swagger in application 
	1 Add dependency in pom.xml 
	2 Configure swagger
	3 Enabling Swagger
	4 Adding more annotations for detailed customized requirement (Optional)
	
	Following are important annotation which helps you to customize documentation
	1	@ApiOperation- This is used on top of rest controller method 
						This is used description about the operation
	2 	@ApiModel- This is written on top of model class, It has 2 attributes
					> value: This displays the name of model class
					> description: This gives the description about the model class
	3	@ApiModelProperty- This is written on top of property of model class
	4   @ApiParam- This is used with argument of rest controller method it has following 2 attribute
					> value: This is short description about parameter
					> required: This tell if the parameter is optional or required
					
*********************************************************Note****************************************************
>Using swagger annotation in your entity class to customize swagger documentation is not a good choice as we are
	-touching,changing our business object.
>We need better approach so that our entity class remains untouched.
******************************************
How to do it?
 
---------
					
http://localhost:8083/v2/api-docs-->in browser
-----------------------------------------------	
v2/api-docs
-The above end point is given by swagger,Which is rest end point  which return rest end point documentation in json form
-Idea is you can consume this end point and create custom GUI
-If you don't want to create custom GUI swagger gives you build in GUI and saves lot of efforts of developer
-You can use this build in GUI to test your rest end points.

To use the build in UI we have to add following dependency
http://localhost:8083/swagger-ui.html-->in browser	

