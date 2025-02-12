fun main(){
    println(isPalindromString("vrushank"))
    println(isPalindromString("kasak"))
    println(isPalindromString("abcdefggfedcba"))

}

fun isPalindromString(str:String):Boolean{
   return if (str.length <= 1){
         true
    }
    else{
        if (str.first() == str.last()){
            isPalindromString(str.substring(1 until str.lastIndex))
        }
       else{
           false
        }
   }

}