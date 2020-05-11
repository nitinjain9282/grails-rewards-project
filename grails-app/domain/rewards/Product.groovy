package rewards

class Product {

    // Defining attributes for Product domain.
    String name
    String sku
    Float price

    static hasMany = [orderitems:Orderitem]

    static constraints = {
    }
}
