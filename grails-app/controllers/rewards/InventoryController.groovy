package rewards

class InventoryController {

    def index() {
        render("this is sample text for new controller")
    }

    // add more action:
    def remove() {
        render "You have one item less in inventory than before"
    }

    // adding new action for view
    def edit() {

        def productName = "Breakfast Blend"
        def  sku = "BB01"
        // define map or key:value pair to be sent to view, it will be referred by key name only. usually key is same as value for simplicity.
        [product:productName , sku:sku]
        // next we create view- which will be same name as controler.

    }
}
