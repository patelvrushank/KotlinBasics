fun main(){
    alterNativeSum(4,2,5,3,3,5 )
}
fun alterNativeSum(vararg numbers: Int){
    var result=0
    for(i in 0..numbers.size-1 )
    {
       if(i%2 ==0){
           result += numbers[i]
       }
       else{
           result -= numbers[i]
       }
    }
    println("The alternative sum of the vararg = $result")
}