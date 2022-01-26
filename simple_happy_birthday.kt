fun main(){
  val name = "sibba" //change sibba to any name
  printBorder() //printing top border
  println("happy birthday ${name}")  
  printBorder()
}
fun printBorder(){
  repeat(25){ //25 is the border length, change it to change length of border
    print("=")
  }
  println()
}
