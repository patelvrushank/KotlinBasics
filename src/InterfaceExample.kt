
fun main(){
    val accountInfo : AccountInfo = AccountInfoImpl()
    println("AccountName : ${accountInfo.getAccountName()} and AccountNo is ${accountInfo.getAccountNo()}")
}

interface AccountInfo{
    fun getAccountName() : String
    fun getAccountNo() : Int
}

class AccountInfoImpl : AccountInfo{
    private val map = hashMapOf<String,Int>()

    override fun getAccountName(): String {
        return "Saving Account"
    }
    override fun getAccountNo(): Int {
        return 122345
    }
}