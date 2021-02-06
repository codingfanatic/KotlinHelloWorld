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
    /*
    Create a function, printCakeCandles() that takes one argument, 
    age, of type Int.
    Inside, use a repeat() statement to print one comma 
    for the flame. Repeat this age times.
    At the end, print an empty line.
    Add a print() statement to print one space for insetting 
    the candles.
    Below, repeat the steps to create a second repeat() statement 
    to print the candle bodies with a vertical line |.
     */
    print(" ")
     repeat(age){
         print(",")
     }
     println()

    print(" ")
     repeat(age){
         print("|")
     }
     println()
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
    /*
    The cake width is age + 2
    The cake height is the number of layers
     */
     repeat(layers){
         repeat(age + 2){
             print("@")
         }
         println()
     }
}