fun main(){
    var alist=listOf<Int>(110,265,315)

    var sum=0;
    alist.forEach{
        sum=sum+it
    }
    println(sum)
}