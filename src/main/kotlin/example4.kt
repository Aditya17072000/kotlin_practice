fun main(){
    val arr1=arrayOf(2,4,5,6,8,10)
    val arr2=arrayOf(1,3,4,7,9,16)

    arr1.set(1,12)
    arr2.set(0,2)
    println(arr1.get(5))
    println(arr2.get(4))
    println()
    for(element in arr1){
        println(element)
    }
    for(element in arr2){
        println(element)
    }
}