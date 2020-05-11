This is sample grails project created directly from IntelliJ
Not all code is checked in. 
only some controller files, .gitignore, build.gradle files are checked in.

Tag - 1.0.0-initial-tag created
----------------------------------------------------------------
I.
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
II. Adding model 
added Domain - Product
defined  attributes 
now to add data to it. we access console here http://localhost:8080/h2-console and 
modify parameter to http://localhost:8080/h2-console as per details in application.yml
access product table and add 2 rows of entry. 
Note: Don't stop application as data is in memory only, so we will lose data. 

Create list action in inventory to pass this data to view.
we can access this list here: http://localhost:8080/inventory/list
tag- 1.0.1-initialMVC_done created
----------------------------------------------------------------
III. 
Designing the domain model,Cases to cover: 
(a) When customer orders a beverage they receive an award. 
    A customer can receive many awards and every award belong to one and only one customer.
(b) A customer can go online and place an order.
    one customer can place many orders but every order will belong to one customer. 
(c) An online order can contain many items. 
    An order can have many items but items will belong to one order only.
(d) You purchase a product in each order item. 
    WE will be adding a domain called product and product can be used in many order items and each item can have one and only one product. 
    
its also called parent child relationship, where a customer is the parent domain and child is the order domain. 
order and product are parent to same child which is orderitem so implied relationship  between order and product is many to many relationship. 

Fields to be put in each domain class: 

Customer: firstName,lastName, phone, email, totalPoints
Awards: date, type, points
Order: date, ordernumber, price
OrderItem: quantity, totalCost, 
Product: SKU productName, price. 

After we create all domain Classes and define variable types and relationship between domain classes, we run the application again and it will
automatically create tables in the database. 
it will not create Order table since in SQL, order is command too hence it results in error. 






    
----------------------------------------------------------------