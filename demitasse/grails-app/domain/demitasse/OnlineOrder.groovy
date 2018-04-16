package demitasse

class OnlineOrder {

    Date orderDate
    Integer orderNumber
    Float order
    static belongsTo = [customer:Customer]
    static hasMany = [ordensItems:OrderItem]

    static constraints = {
    }
}
