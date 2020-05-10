This is sample grails project created directly from IntelliJ
Not all code is checked in. 
only some controller files, .gitignore, build.gradle files are checked in.

----------------------------------------------------------------
1- added new controller - inventory, default action index will be executed.
http://localhost:8080/inventory works as expected.

2- added remove action in inventory and it can be accessed here :
http://localhost:8080/inventory/remove

3- add action edit and define variables. Create map to pass key:values to view. 
Note that when we create inventory controller then corresponding view folder views\inventory is created automatically.
create groovy server page(gsp) edit.gsp in  inventory folder.
http://localhost:8080/inventory/edit will now display values for productName and sku.

Insert form element for better display. 

II. Adding model 
added Domain - Product
defined  attriutes 
now to add data to it. we access console here http://localhost:8080/h2-console and 
modify parameter to http://localhost:8080/h2-console as per details in application.yml
access product table and add 2 rows of entry. 
Note: Don't stop application as data is in memory only, so we will lose data. 

Create list action in inventory to pass this data to view.
we can access this list here: http://localhost:8080/inventory/list

 

----------------------------------------------------------------