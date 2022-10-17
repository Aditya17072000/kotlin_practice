fun main(){
    HighOrder(50,80,40,{num1:Int,num2:Int,num3:Int ->(num1+num2+num3)/3})
}
fun HighOrder(num1:Int,num2:Int,num3:Int,funcName:(Int, Int,Int)->Int){
    print(funcName(num1,num2,num3))
}