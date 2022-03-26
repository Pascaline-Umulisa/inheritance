fun main(){
    var myCar=Car("subaru","legacy","white",6)
    myCar.carry(4)
    myCar.carry(8)
    myCar.identity()
    println(myCar.calculateParkingFees(5))

    var schoolBus=Bus("Acura", "single deck","red",48)
    schoolBus.carry(48)
    schoolBus.carry(60)
    schoolBus.identity()
    println(schoolBus.calculateParkingFees(7))
    println(schoolBus.maxTripFare(150.50))



}
open class Car(var make:String,var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if(people<=capacity){
            println("Carrying $people passengers")
        }
        else
            println("Over capacity by $x")
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees (hours:Int):Int{
        return hours*20
    }

}
class Bus(make: String, model: String, color: String,capacity: Int):Car(make,model,color,capacity){
  fun maxTripFare(fare: Double):Double{
      return fare*capacity
  }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity
    }
}