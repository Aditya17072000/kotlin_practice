fun main(){
    val num=arrayOf(7,21,23,16,2,11,17,28,39,18)
    println("the odd and even numbers are as follows: ")
    for(item in num){
        if(item%2==0){
            println("even number: "+item)
        }
        else{
            println("odd number: "+item)
        }
    }
}

