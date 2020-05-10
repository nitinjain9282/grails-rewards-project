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

----------------------------------------------------------------