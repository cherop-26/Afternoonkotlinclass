fun main() {
    // while loop
    var number = 20
    while (number <= 25){
      println("Number :$number")
      number ++
}
     //example 2
    var num = 5
    while (num >= 1) {
        println("Number is $num")
        num--
    }
    //do ....while loop
    var x = 30
    do{
        println("Number is $x")
        x ++
     }
        while (x<=35)

    //for loop
        for (a in 100..105){
           println("Number is $a")
        }
    for(letter in 'a'..'d'){
        println("My letter is $letter")
    }
    //break
    for (b in 70..75){
        if(b==73){
            break
        }

        println("Number is $b")

    }

    //continue
    for (character in 'd'..'h'){
        if (character =='f'){
            continue
        }
        println("Character is $character")
    }
}