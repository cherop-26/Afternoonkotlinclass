fun main() {
    var firstname="Cheryl"
    var lastname ="Jerop"
    var school = "eMobilis"
    println(firstname+" "+lastname)// string Concatenation
    println(firstname[0])//single value
    println(firstname.uppercase())
    println(lastname.lowercase())

    //string interpolation
    println(school+" "+"is a coding school")// you could put a space before the message
    println("My full name is $firstname $lastname")
}