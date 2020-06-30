# Shopping Cart
Functionalities :
* Implemented discount calculation functionality for Cart
* As of now implemented discount stab for Regular and Premium customers
* Also exposed Rest points for same

Running the app:
* Run the Application: ShoppingCartApplication.java
* Run the Test cases: CartServiceImplTest.java

Rest Points:
http://localhost:8080/rest/cart/discount/{cartId}  - this will give calculated amount after applied discount on cart
http://localhost:8080/rest/cart/{cartId} - this will give cart details along with discounted calculated value 

Pre-requisites:
* JDK 1.8
* Maven
