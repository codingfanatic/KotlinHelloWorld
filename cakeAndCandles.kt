fun main(){
    //1. Create a variable age and set it to 24
    //2. Create a variable layers set to 5
    //3. In main(), call a function printCakeCandles() and pass age
    //4. In main(), call a function printCakeTop and also pass in the age
    //5. In main(), call a function printCakeBottom and pass in the age and number of layers
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCakeCandles(age: Int){
    
}

fun printCakeTop(age: Int){
    /*
    Use a repeat() statement to print one equal sign age 
    times plus 2. The extra two equals signs are so that 
    the candles won't fall off the side of the cake.
    At the end, when the repeat statement is done, print an
    empty line.
    */
    repeat(age + 2){
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int){

}