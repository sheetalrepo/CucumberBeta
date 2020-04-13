Youtube Channel:

Cucumber Alpha: https://www.youtube.com/watch?v=n1vJ7zfNN_c
Cucumber Beta : https://www.youtube.com/watch?v=-YPbMYpzt6c
 
========================================================================================================================
#How to run:
mvn clean verify -Dcucumber.filter.tags="@betaone" 

========================================================================================================================
CucumberBeta Project
Its a second project which will reuse CucumberAlpha projects feature

#Steps:
1. Run mvn clean install on CucumberAlpha Project, so that main/test jar get created in .m2 folder
2. Add CucumberAlpha's glue code inside CucumberBeta's glue code
		glue = {"classpath:stepdefs","classpath:parallel"}  //second param is from CucumberAlpha
3. Add CucumberAlpha projects dependency in CucumberBeta's POM.xml
   Using following dependency, CucumberBeta will automatically import CucumberAlpha's jar from .m2 folder
		<dependency>
			<groupId>bdd</groupId>
			<artifactId>CucumberAlpha</artifactId>
			<classifier>tests</classifier>
			<type>test-jar</type>
			<version>0.0.1-SNAPSHOT</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>bdd</groupId>
			<artifactId>CucumberAlpha</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>

4. Features from CucumberAlpha can be copy pasted here, data in scenario outline can be changed
5. Using Global HM we can pass data from CucumberAlpha into CucumberBeta project


========================================================================================================================

