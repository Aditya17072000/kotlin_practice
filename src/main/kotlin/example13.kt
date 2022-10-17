fun main(){
    highOrder(50,80,40,::myfunction)
}
fun myfunction(num1:Int,num2:Int,num3:Int):Int{
    return ((num1+num2+num3)/3)
}
fun highOrder(num1:Int,num2:Int,num3:Int,funcName:(Int,Int,Int)->Int){
    print(funcName(num1,num2,num3))
}