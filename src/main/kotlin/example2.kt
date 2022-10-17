fun main(){
    val marks=92
    val marks2=82
    val result= if(marks>marks2){
        "marks=$marks is greater than marks2=$marks2"
    }
    else{
        {"marks=$marks is lesser than marks2=$marks2"}
    }
    println(result)
}