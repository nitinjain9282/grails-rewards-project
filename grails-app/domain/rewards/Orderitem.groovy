package rewards

class Orderitem {

    int qty
    float total


    static belongsTo = [products:Product, orders:OnlineOrder]
    static constraints = {
    }
}
