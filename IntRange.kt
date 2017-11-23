
import java.util.Scanner
fun main(args: Array<String>){

    var reader = Scanner(System.`in`)
    var arr: Int
    arr = reader.nextInt()

    when(arr){

        in 1..6 -> print("Hello")
        7,8,9,10,11,12,13,14,15 -> print("World")
    }

}
