fun main(){
    var car=Car("toyota","matatu","white",14)
    car.carry(17)
    car.identity("black","landcruiser","prado")

}
//1. Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy”
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20
 class Car(var make:String, var model:String,var color:String,var capacity:Int){


    fun carry(people:Int){
        var word="Carrying $people passengers"
        var w=people-capacity


        if(people.equals(capacity)){
            println("Carrying $capacity people passengers")
        }else
            println("overcapacity by $w  people")

    }
    fun identity(color: String, make: String,model: String){
        var stmt="I am $color $make $model"
        println(stmt)

    }
}