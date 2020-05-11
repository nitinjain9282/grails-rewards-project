package rewards

class Awards {

    Date awardDate
    String type
    int points

     static  belongsTo = [customer: Customer]

    static constraints = {
    }
}
