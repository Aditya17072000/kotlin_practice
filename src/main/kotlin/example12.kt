fun main(){
    var i=1
    var n=10
    var sum=0
    var f1=1
    var f2=1
    do{
        i++
        println(f1)
        sum=f1+f2
        f1=f2
        f2=sum
    }while(i<=n)
}