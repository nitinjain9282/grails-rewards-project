package rewards

class OnlineOrder {

    Date orderDate
    int orderNumber
    float price

    static hasMany = [orderitems:Orderitem]
    static belongsTo = [customer:Customer]

    static constraints = {
    }
}
