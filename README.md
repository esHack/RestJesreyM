# RestJesreyM

I choose to use Jersey for developing Rest services, MySQL, Tomcat, Maven and Hibernate for database operations.

All the frontend html/js files are included in RestJesreyM\src\main\webapp\pages folder.

Cant avoid hosting frontend files on Tomcat due to CROS(cross scripting) issues.

Following tasks are completed
----------------------------------

1. Developed Rest services to get and post the data to database.
2. An additional column for VAT is added.
3. Added an additional field for VAT which calculates VAT automatically as user enters his expense. (For Extra credits  &#9786; !!)
4. Number validation for Amount entered by user. (requires HTML5)

Deployment Steps
-----------------

1. This is a Maven build. Run as Maven Build and add Goals as clean install on eclipse (otherwise command line can be used).
2. Goto Run Configurations, Chose workspace as base directory  and add goals as tomcat:run on eclipse(or WAR that is built from previous step can be deployed on Tomcat from command line)
3. MySQL Script for Expense table.


<br>
 <p><i>drop table if exists `myspace`.`expense`;<br>
CREATE TABLE  `myspace`.`expense` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `date` varchar(45) NOT NULL DEFAULT '',
  `reason` varchar(45) NOT NULL DEFAULT '',
  `amount` varchar(45) NOT NULL DEFAULT '',
  `vat` varchar(45) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;</i></p>


And the URL for the project is..

  <a href="http://localhost:8080/RestJerseyM/pages">http://localhost:8080/RestJerseyM/pages</a>
  
  and project will look like
  
 <img src="http://s8.postimg.org/3vobpv7px/Alchemy.jpg" >
