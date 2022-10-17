fun main(){
    val arr=arrayOf(52,-77,32,-83,42,-43)
    var i=0
    while(i<arr.size){
        if(arr[i]>0){
            println("positive number: "+arr[i])
        }else{
            println("negative number: "+arr[i])
        }
        i++
    }
}