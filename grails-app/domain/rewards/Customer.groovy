package rewards

class Customer {

    String firstName
    String lastName
    long phone
    String email
    int totalPoints

    // a customer has many awards and a award belong to customer.
    // we need to define above relationship here so when we query Customer, we automatically get awards and if we
    // delete customer and award is automatically deleted.
    // define relationship here
    static  hasMany = [awards:Awards, orders:OnlineOrder]


    static constraints = {
    }
}
