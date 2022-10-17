fun main() {
    val score=76
    val grade:String
    grade=if(score>=90){
        "your grade is ex"
    }else if(score>=80 && score<90){
        "your grade is A"
    }else if(score>=70 && score<80){
        "your grade is B"
    }else if(score>=60 && score<70){
        "your grade is C"
    }else if(score>=50 && score<60){
        "your grade is D"
    }
    else if(score>=35 && score<50){
        "your grade is P"
    }
    else{
        "your grade is F"
    }
    println(grade)
}